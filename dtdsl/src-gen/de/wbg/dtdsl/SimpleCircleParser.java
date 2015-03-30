package de.wbg.dtdsl;

import java.lang.reflect.Field;
import java.util.ArrayList;

class SimpleCircleParser {
	
	private Head headNode;
	private Element actualNode;
	private Element prev;
	private ArrayList<Integer> visited;
	
	public SimpleCircleParser()
	{
		
	}
	
	public Head parse(Object o)
	{
		this.headNode = new Head("HEAD");
		this.actualNode = this.headNode;
		this.visited = new ArrayList<>();
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
		Element maybeHead = new Element("MAYBEHEAD");
		maybeHead.setNodeNumber(n.getNodeNumber());
		Object temp = o;
		try
		{
			parseSkvSkv(temp, maybeHead);
			this.prev = newNode;
			for (Element child: maybeHead.getChildren())
			{
				n.addChild(child);
				child.setParent(n);
				if (this.prev != null)
				{
					this.prev.setNext(child);
				}
				this.prev = child;
			}
		} 
		catch (ParserException e) 
		{
			//destroy reference
			maybeHead = null;
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
	
	public void parseSkvSkv(Object o, Element n) throws Exception
	{
		//Next: 
		//kein code: next
		try {
			Field f = o.getClass().getDeclaredField("next"); //NoSuchFieldException
			f.setAccessible(true);
			Object next = (Object) f.get(o); //IllegalAccessException
		
		int nextVisit = System.identityHashCode(next);
		if (this.visited.contains(nextVisit))
		{
			return;
		}
		else
		{
			this.visited.add(nextVisit);
		}
		
			parseSkv(next, n);
			actualNode = n;
		}
		catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			throw new ParserException("Error while parsing next");
		}
		
		///maybe
	}
}
		