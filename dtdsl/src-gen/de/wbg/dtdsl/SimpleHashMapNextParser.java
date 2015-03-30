package de.wbg.dtdsl;

import java.lang.reflect.Field;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.lang.reflect.Array;
				

class SimpleHashMapNextParser {
	
	private Head headNode;
	private Element actualNode;
	
	public SimpleHashMapNextParser()
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
		//many Next
		Field f = o.getClass().getDeclaredField("children");
		f.setAccessible(true);
		Object next = (Object) f.get(o);
		Head manyHead = new Head("MANYHEAD");
		
		//String instance = this.getInstance(next);
		if (next instanceof Object[])
		{
			for (int index = 0; index < ((Object[])next).length; index++)
			{
				parseSimpleValue(((Object[])next)[index], manyHead);
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
		
		Element setNext = null;
		for (Element el : manyHead.getChildren())
		{
			n.addChild(el);
			el.setParent(n);
			if (setNext != null)
			{
				setNext.setNext(el);
			}
			setNext = el;
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
		
	public void parseStartSimpleValue(Object o, Element n) throws Exception
	{
		//many
	}
	private void parseSimpleValue(Object o, Element n) throws Exception
	{
		Node newNode = new Node(n.getNameForNode());
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
		catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			//e.printStackTrace();
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("Error while parsing : value");
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
		
