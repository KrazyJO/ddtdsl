package de.wbg.dtdsl;

import java.lang.reflect.Field;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.lang.reflect.Array;
				

class SimpleManyAttributeParser {
	
	private Head headNode;
	private Element actualNode;
	
	public SimpleManyAttributeParser()
	{
		
	}
	
	public Head parse(Object o)
	{
		this.headNode = new Head("HEAD");
		this.actualNode = this.headNode;
		//model.start
		try {
			parseStart(o, actualNode);
		}
		catch (Exception e)
		{
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
		
		return headNode;
	}
	
	private void parseStart(Object o, Element n) throws Exception
	{
		Node newNode = new Node(n.getNameForNode());
		newNode.setParent(n);
		n.addChild(newNode);
		//{Element copy = n.copy();
		try 
		{
		Field f = o.getClass().getDeclaredField("array");
		f.setAccessible(true);
		Object next = (Object) f.get(o);
		Head manyHead = new Head("MANYHEAD");
		
		if (next.getClass().isArray())
		{
			for (int index = 0; index < Array.getLength(next); index++)
			{
				parseManyStartAttributeArray(Array.get(next ,index), manyHead);
			}
		}
		else if (next instanceof ArrayList)
		{
			ArrayList al = (ArrayList)next;
			for (int index = 0; index < al.size(); index++)
			{
				Object obj = al.get(index);
				parseManyStartAttributeArray(obj, manyHead);
			}
		}
		else if (next instanceof LinkedList)
		{
			LinkedList al = (LinkedList)next;
			for (int index = 0; index < al.size(); index++)
			{
				Object obj = al.get(index);
				parseManyStartAttributeArray(obj, manyHead);
			}
		}
		else if (next instanceof HashMap)
			{
				HashMap hashMap = (HashMap) next;
				
				for (Object entry : hashMap.keySet())
				{
					Object valueForEntry = hashMap.get(entry);
					
					//entry is primitiv
					//=> Node with key -> Attribute with value
					Node node = new Node(manyHead.getNameForNode());
					node.setKey(true);
					node.setValue(String.valueOf(entry));
					node.setName(entry.getClass().toString().replace("class ", ""));
					Attribute attrib = new Attribute(node.getNameForAttribute());
					attrib.setName("array");
					attrib.setValue(hashMap.get(entry));
					attrib.setType(hashMap.get(entry).getClass());
					
					node.addChild(attrib);
					attrib.setParent(node);
					
					manyHead.addChild(node);
					node.setParent(manyHead);
				}
			}
		
		for (Element el: manyHead.getChildren())
		{
			newNode.addChild(el);
			el.setParent(newNode);
		}
		}
		catch (ParserException e)
		{
			newNode.setParent(null);
			n.removeChild(newNode);
			throw e;
		}
		
		if (newNode.getTotalLength() == 1)
		{
			//remove newNode
			newNode.setParent(null);
			n.removeChild(newNode);
		}
		
		actualNode = n;
	
}
		
	public void parseManyStartAttributeArray(Object o, Element n) throws Exception
	{
		Attribute valueNode = new Attribute("attribute" + n.increaseAttributeNumber());
		valueNode.setType(o.getClass());
	
		valueNode.setName("array");
		valueNode.setValue(o);
		
		valueNode.setParent(n);
		n.getChildren().add(valueNode);
		//many
	}
	private static String getInstance(Object o)
	{
		if (o instanceof Object[])
		{
			return "Array";
		}
		else if (o instanceof ArrayList)
		{
			return "ArrayList";
		}
		else if (o instanceof HashMap)
		{
			return "HashMap";
		}
		else if (o instanceof LinkedList)
		{
			return "LinkedList";
		}
		else 
		{
			return "unknown";
		}
	}
		
}
		