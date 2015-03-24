package de.wbg.dtdsl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

class SimpleHashMapNodeParser {
	
	private Head headNode;
	private Element actualNode;
	
	public SimpleHashMapNodeParser()
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
		Node newNode = new Node("node"+n.increaseNodeNumber());
		newNode.setParent(n);
		n.addChild(newNode);	
		//{Element copy = n.copy();
		try 
		{
			Field f = o.getClass().getDeclaredField("children");
			f.setAccessible(true);
			Object next = (Object) f.get(o);
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
		
	public void parseManyStartChildren(Object o, Element n) throws Exception
	{
		//many
	}
	private void parseSimpleValue(Object o, Element n) throws Exception
	{
		Node newNode = new Node("node"+n.increaseNodeNumber());
		newNode.setParent(n);
		n.addChild(newNode);	
		//{Element copy = n.copy();
		try 
		{
			parseSimpleValueAttributeValue(o, newNode);
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
		
	public void parseSimpleValueAttributeValue(Object o, Element n) throws Exception
	{
		//Attribute
		//inner == null
		//int value as ;
		int oldAttributeNumber = n.getAttributeNumber();
		try {
			
			Field f = o.getClass().getDeclaredField("value"); //NoSuchFieldException
			f.setAccessible(true);
			int iWantThis = (int) f.get(o); //IllegalAccessException
		
			Attribute valueNode = new Attribute("attribute" + n.increaseAttributeNumber());
			valueNode.setType("value");
		
			valueNode.setName("value");
			valueNode.setValue(String.valueOf(iWantThis));
			valueNode.setType("value");
			
			valueNode.setParent(n);
			n.getChildren().add(valueNode);
		}
		catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			//e.printStackTrace();
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("Error while parsing : int value");
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
		
