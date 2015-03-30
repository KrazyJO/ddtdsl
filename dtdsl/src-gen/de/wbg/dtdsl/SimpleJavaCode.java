package de.wbg.dtdsl;

import java.lang.reflect.Field;

class SimpleJavaCode {
	
	private Head headNode;
	private Element actualNode;
	
	public SimpleJavaCode()
	{
		
	}
	
	public Head parse(Object o)
	{
		this.headNode = new Head("HEAD");
		this.actualNode = this.headNode;
		//model.start
		try {
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
		 	Node parent = new Node(n.getId());
			parent.setNodeNumber(n.getNodeNumber());
			parent.setAttributeNumber(n.getAttributeNumber());
			parseSkvInner(o, parent);
			
			Node tempNode = (Node) parent.getChildren().get(0);
			tempNode.setParent(n);
			n.addChild(tempNode);
			n.increaseNodeNumber();
			newNode.setNext(tempNode);
			
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
	
	public void parseSkvInner(Object o, Element n) throws Exception
	{
		//Next: 
		//code: getNext();
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
		
