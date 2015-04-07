package de.wbg.dtdsl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

class SimpleNodeParser {
	
	private Head headNode;
	private Element actualNode;
	private Element prev;
	private SimpleScanner scanner;
	private HashMap<String, String> stringKeyVariables;
	private HashMap<String, String> stringValueVariables;
	private ArrayList<Integer> visited;
	
	public SimpleNodeParser()
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
		//model.start
		try {
			int nextVisit = System.identityHashCode(o);
			this.visited.add(nextVisit);
			parseSkv(o, actualNode);
		}
		catch (Exception e)
		{
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
		
		return headNode;
	}
	
	private void parseSkv(Object o, Element n) throws Exception
	{
	
		Node newNode = new Node(n.getNameForNode());
		newNode.setParent(n);
		n.addChild(newNode);
		//{Element copy = n.copy();
		try 
		{
		parseSkvAttributeS(o, newNode);
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
	
		//{Element copy = n.copy();
		try 
		{
		parseSkvAttributeI(o, newNode);
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
	
		//{Element copy = n.copy();
		try 
		{
		parseSkvNext(o, newNode);
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
		
	public void parseSkvAttributeS(Object o, Element n) throws Exception
	{
		//Attribute
		//inner == null
		int oldAttributeNumber = n.getAttributeNumber();
		try {
			
			Field f = o.getClass().getDeclaredField("s"); //NoSuchFieldException
			f.setAccessible(true);
			Object iWantThis = f.get(o); //IllegalAccessException
		
			Attribute valueNode = new Attribute("attribute" + n.increaseAttributeNumber());
			
		
			valueNode.setName("s");
			valueNode.setValue(iWantThis);
			valueNode.setType(iWantThis.getClass());
			
			valueNode.setParent(n);
			n.getChildren().add(valueNode);
		}
		catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			//e.printStackTrace();
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("Error while parsing : s");
		}
	}
	
	public void parseSkvAttributeI(Object o, Element n) throws Exception
	{
		//Attribute
		//inner == null
		int oldAttributeNumber = n.getAttributeNumber();
		try {
			
			Field f = o.getClass().getDeclaredField("i"); //NoSuchFieldException
			f.setAccessible(true);
			Object iWantThis = f.get(o); //IllegalAccessException
		
			Attribute valueNode = new Attribute("attribute" + n.increaseAttributeNumber());
			
		
			valueNode.setName("i");
			valueNode.setValue(iWantThis);
			valueNode.setType(iWantThis.getClass());
			
			valueNode.setParent(n);
			n.getChildren().add(valueNode);
		}
		catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			//e.printStackTrace();
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("Error while parsing : i");
		}
	}
	
	public void parseSkvNext(Object o, Element n) throws Exception
	{
 //Node
try
{
	Field f = o.getClass().getDeclaredField("next");
	f.setAccessible(true);
	Object next = (Object) f.get(o);
	
	int nextVisit = System.identityHashCode(next);
	if (this.visited.contains(nextVisit))
	{
		return;
	}
	else
	{
		this.visited.add(nextVisit);
	}
	
	parseInner(next, n);
}
catch(NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
{
<<<<<<< HEAD
	throw new ParserException("Error while parsing next in de.wbg.dTDSL.impl.ObjectNodeImpl@5f4d7a20 (attributes: next)");
=======
	throw new ParserException("Error while parsing next in de.wbg.dTDSL.impl.ObjectNodeImpl@157261fc (attributes: next)");
>>>>>>> 8656d901e5178d7c0a7085c15713baddf5fb122a
}
catch (ParserException e)
{
	throw e;
}
			
	}
	private void parseInner(Object o, Element n) throws Exception
	{
	
		Node newNode = new Node(n.getNameForNode());
		newNode.setParent(n);
		n.addChild(newNode);
		//{Element copy = n.copy();
		try 
		{
		parseInnerAttributeS(o, newNode);
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
	
		//{Element copy = n.copy();
		try 
		{
		parseInnerAttributeI(o, newNode);
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
		
	public void parseInnerAttributeS(Object o, Element n) throws Exception
	{
		//Attribute
		//inner == null
		int oldAttributeNumber = n.getAttributeNumber();
		try {
			
			Field f = o.getClass().getDeclaredField("s"); //NoSuchFieldException
			f.setAccessible(true);
			Object iWantThis = f.get(o); //IllegalAccessException
		
			Attribute valueNode = new Attribute("attribute" + n.increaseAttributeNumber());
			
		
			valueNode.setName("s");
			valueNode.setValue(iWantThis);
			valueNode.setType(iWantThis.getClass());
			
			valueNode.setParent(n);
			n.getChildren().add(valueNode);
		}
		catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			//e.printStackTrace();
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("Error while parsing : s");
		}
	}
	
	public void parseInnerAttributeI(Object o, Element n) throws Exception
	{
		//Attribute
		//inner == null
		int oldAttributeNumber = n.getAttributeNumber();
		try {
			
			Field f = o.getClass().getDeclaredField("i"); //NoSuchFieldException
			f.setAccessible(true);
			Object iWantThis = f.get(o); //IllegalAccessException
		
			Attribute valueNode = new Attribute("attribute" + n.increaseAttributeNumber());
			
		
			valueNode.setName("i");
			valueNode.setValue(iWantThis);
			valueNode.setType(iWantThis.getClass());
			
			valueNode.setParent(n);
			n.getChildren().add(valueNode);
		}
		catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			//e.printStackTrace();
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("Error while parsing : i");
		}
	}
	
}
