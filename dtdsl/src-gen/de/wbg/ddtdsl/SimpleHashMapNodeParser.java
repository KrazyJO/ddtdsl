package de.wbg.ddtdsl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.reflect.Array;
import java.util.HashMap;

class SimpleHashMapNodeParser {
	
	private Head headNode;
	private Element actualNode;
	private Element prev;
	private SimpleScanner scanner;
	private HashMap<String, Node> stringKeyVariables;
	private HashMap<String, String> stringValueVariables;
	private ArrayList<Integer> visited;
	private HashMap<Integer, Node> allObjectNodes;
	
	public SimpleHashMapNodeParser()
	{
		
	}
	
	public Head parse(Object o)
	{
		this.headNode = new Head("HEAD");
		this.actualNode = this.headNode;
		this.visited = new ArrayList<>();
		this.scanner = new SimpleScanner();
		this.stringKeyVariables = new HashMap<>();
		this.stringValueVariables = new HashMap<>();
		this.allObjectNodes = new HashMap<>();
		//model.start
		try {
			int nextVisit = System.identityHashCode(o);
			this.visited.add(nextVisit);
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
		newNode.setName("Start");
		newNode.setOriginalHashCode(this.visited.get(this.visited.size()-1));
		this.allObjectNodes.put(this.visited.get(this.visited.size()-1) ,newNode);
		newNode.setParent(n);
		n.addChild(newNode);
		//{Element copy = n.copy();
		try 
		{
		Field f = o.getClass().getDeclaredField("children");
		f.setAccessible(true);
		Object next = (Object) f.get(o);
		
		int nextVisit = System.identityHashCode(next);
		if (this.visited.contains(nextVisit))
		{
			Node actNode = this.allObjectNodes.get(this.visited.get(this.visited.size()-1));
			Node circleNode = this.allObjectNodes.get(nextVisit);
			actNode.setNext(circleNode);
			circleNode.setPrevious(actNode);
			return;
		}
		else
		{
			this.visited.add(nextVisit);
		}
		
		Head manyHead = new Head("MANYHEAD");
		
		if (next instanceof Object[])
		{
			Object[] array = (Object[]) next;
			for (int index = 0; index < array.length; index++)
			{
				parseSimpleValue(array[index], manyHead);
			}
		}
		else if (next instanceof ArrayList)
		{
			ArrayList al = (ArrayList)next;
			for (Object obj: al)
			{
				parseSimpleValue(obj, manyHead);
			}
		}
		else if (next instanceof LinkedList)
		{
			LinkedList al = (LinkedList)next;
			for (Object obj: al)
			{
				parseSimpleValue(obj, manyHead);
			}
		}
		else if (next instanceof HashMap)
		{
			HashMap hashMap = (HashMap) next;
			
			for (Object entry : hashMap.keySet())
			{
				
				Object valueForEntry = hashMap.get(entry);
				
				parseSimpleValue(valueForEntry, manyHead);
				Node act = manyHead.getNodeByName("MANYHEAD.node"+(manyHead.size()-1));
				act.setKey(true);
				act.setValue(String.valueOf(entry));
				act.setName(entry.getClass().toString().replace("class ", ""));
			}
		}
		
		for (Element el : manyHead.getChildren())
		{
			newNode.addChild(el);
			el.setParent(newNode);
		}
		if (newNode.getTotalLength() == 1)
		{
			//remove newNode
			newNode.setParent(null);
			n.removeChild(newNode);
		}
		}
		catch (ParserException e)
		{
			System.err.println(e.getMessage());
			newNode.setParent(null);
			n.removeChild(newNode);
		}
		
		actualNode = n;
	
}
		
	public void parseManyStartChildren(Object o, Element n) throws Exception
	{
		//many
	}
	private void parseSimpleValue(Object o, Element n) throws Exception
	{
	
		Node newNode = new Node(n.getNameForNode());
		newNode.setName("SimpleValue");
		newNode.setOriginalHashCode(this.visited.get(this.visited.size()-1));
		this.allObjectNodes.put(this.visited.get(this.visited.size()-1) ,newNode);
		newNode.setParent(n);
		n.addChild(newNode);
		//{Element copy = n.copy();
		try 
		{
		parseSimpleValueAttributeValue(o, newNode);
		}
		catch (ParserException e)
		{
			System.err.println(e.getMessage());
			newNode.setParent(null);
			n.removeChild(newNode);
		}
		
		actualNode = n;
	
}
		
	public void parseSimpleValueAttributeValue(Object o, Element n) throws Exception
	{
		//Attribute
		//inner == null
		int oldAttributeNumber = n.getAttributeNumber();
		try {
			
			Field f = o.getClass().getDeclaredField("value"); //NoSuchFieldException
			f.setAccessible(true);
			Object iWantThis = f.get(o); //IllegalAccessException
		
			Attribute valueNode = new Attribute("attribute" + n.increaseAttributeNumber());
		
			valueNode.setName("value");
			valueNode.setValue(iWantThis);
			valueNode.setType(iWantThis.getClass());
			
			valueNode.setParent(n);
			n.getChildren().add(valueNode);
			
		}
		catch (NoSuchFieldException e)
		{
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("could not find field \"value\" in SimpleValue");
		}
		catch ( SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			//e.printStackTrace();
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("Error while parsing: value");
		}
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