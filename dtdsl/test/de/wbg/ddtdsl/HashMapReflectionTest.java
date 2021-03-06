package de.wbg.ddtdsl;
import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import de.wbg.ddtdsl.Attribute;
import de.wbg.ddtdsl.Element;
import de.wbg.ddtdsl.Head;
import de.wbg.ddtdsl.Node;
import de.wbg.ddtdsl.testhelper.SimpleHashMapWithSimpleValue;


public class HashMapReflectionTest {

	@Test
	public void testHashMapReflection()
	{
		SimpleHashMapWithSimpleValue hashMap = new SimpleHashMapWithSimpleValue();
		
		//hasAttribute children ofType SimpleValue*;
		/*
		 * Start:
		 * {
		 * 		hasNode children ofType SimpleValue*;	//children ist HashMap
		 * }
		 * 
		 * SimpleValue : 
		 * {
		 * 		hasAttribute value ofType int;
		 * }
		 * 
		 * beginWith = Start;
		 */
		Object o = hashMap;
		Head head = new Head("HEAD"); 
		
		ArrayList<Integer> visited = new ArrayList<>();
		
		
		try {
			Field f;
			f = o.getClass().getDeclaredField("children");
			f.setAccessible(true);
			HashMap iWantThis = (HashMap) f.get(o); //IllegalAccessException
//			System.out.println(iWantThis.keySet().toArray()[0].getClass());
//			System.out.println(System.identityHashCode(iWantThis));
			int v = System.identityHashCode(iWantThis);
			visited.add(v);
			assertTrue(visited.contains(v));
			
			
			for (Object entry : iWantThis.keySet())
			{
				Node node = new Node("node" + head.increaseNodeNumber());
				node.setKey(true);
				node.setValue(String.valueOf(entry));
				//name muss type werden
				node.setName(entry.getClass().toString().replace("class ", ""));
//				System.out.println(entry.getClass().toString().replace("class ", ""));
				
				//Attribute
				Object valueForEntry = iWantThis.get(entry);
				Attribute attribute = new Attribute("attribute" + node.increaseAttributeNumber());
				attribute.setName("children");
				
				parseSimpleValueAttributeValue(valueForEntry, node);
				
				//Verkn?pfen
				attribute.setParent(node);
				node.addChild(attribute);
				head.addChild(node);
				node.setParent(head);
			}
			
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //NoSuchFieldException
		
		
	}
	
	public void parseSimpleValueAttributeValue(Object o, Element e)
	{
		
	}
}
