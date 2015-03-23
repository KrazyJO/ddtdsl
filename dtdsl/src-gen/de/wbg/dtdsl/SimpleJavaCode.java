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
		Node newNode = new Node("node"+n.increaseNodeNumber());
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
		
		//actualNode.getChildren().add(node);
		
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
		
		//actualNode.getChildren().add(node);
		
		actualNode = n;
	
		//{Element copy = n.copy();
		try 
		{
			parseSkvInner(o, n);
		}
		catch (ParserException e)
		{
			newNode.setParent(null);
			n.removeChild(newNode);
			throw e;
		}
		
		//actualNode.getChildren().add(node);
		
		actualNode = n;
	
}
		
	public void parseSkvAttributeS(Object o, Element n) throws Exception
	{
		//Attribute
		//inner == null
		//String s as ;
		int oldAttributeNumber = n.getAttributeNumber();
		try {
			
			Field f = o.getClass().getDeclaredField("s"); //NoSuchFieldException
			f.setAccessible(true);
			String iWantThis = (String) f.get(o); //IllegalAccessException
		
			Attribute valueNode = new Attribute("attribute" + n.increaseAttributeNumber());
			valueNode.setType("value");
		
			valueNode.setName("s");
			valueNode.setValue(String.valueOf(iWantThis));
			valueNode.setType("value");
			
			valueNode.setParent(n);
			n.getChildren().add(valueNode);
		}
		catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			//e.printStackTrace();
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("Error while parsing : String s");
		}
	}
	
	public void parseSkvAttributeI(Object o, Element n) throws Exception
	{
		//Attribute
		//inner == null
		//int i as ;
		int oldAttributeNumber = n.getAttributeNumber();
		try {
			
			Field f = o.getClass().getDeclaredField("i"); //NoSuchFieldException
			f.setAccessible(true);
			int iWantThis = (int) f.get(o); //IllegalAccessException
		
			Attribute valueNode = new Attribute("attribute" + n.increaseAttributeNumber());
			valueNode.setType("value");
		
			valueNode.setName("i");
			valueNode.setValue(String.valueOf(iWantThis));
			valueNode.setType("value");
			
			valueNode.setParent(n);
			n.getChildren().add(valueNode);
		}
		catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			//e.printStackTrace();
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("Error while parsing : int i");
		}
	}
	
	public void parseSkvInner(Object o, Element n) throws Exception
	{
		//Next: 
		//code: getNext();
			}
	private void parseInner(Object o, Element n) throws Exception
	{
		Node newNode = new Node("node"+n.increaseNodeNumber());
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
		
		//actualNode.getChildren().add(node);
		
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
		
		//actualNode.getChildren().add(node);
		
		actualNode = n;
	
}
		
	public void parseInnerAttributeS(Object o, Element n) throws Exception
	{
		//Attribute
		//inner == null
		//String s as ;
		int oldAttributeNumber = n.getAttributeNumber();
		try {
			
			Field f = o.getClass().getDeclaredField("s"); //NoSuchFieldException
			f.setAccessible(true);
			String iWantThis = (String) f.get(o); //IllegalAccessException
		
			Attribute valueNode = new Attribute("attribute" + n.increaseAttributeNumber());
			valueNode.setType("value");
		
			valueNode.setName("s");
			valueNode.setValue(String.valueOf(iWantThis));
			valueNode.setType("value");
			
			valueNode.setParent(n);
			n.getChildren().add(valueNode);
		}
		catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			//e.printStackTrace();
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("Error while parsing : String s");
		}
	}
	
	public void parseInnerAttributeI(Object o, Element n) throws Exception
	{
		//Attribute
		//inner == null
		//int i as ;
		int oldAttributeNumber = n.getAttributeNumber();
		try {
			
			Field f = o.getClass().getDeclaredField("i"); //NoSuchFieldException
			f.setAccessible(true);
			int iWantThis = (int) f.get(o); //IllegalAccessException
		
			Attribute valueNode = new Attribute("attribute" + n.increaseAttributeNumber());
			valueNode.setType("value");
		
			valueNode.setName("i");
			valueNode.setValue(String.valueOf(iWantThis));
			valueNode.setType("value");
			
			valueNode.setParent(n);
			n.getChildren().add(valueNode);
		}
		catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			//e.printStackTrace();
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("Error while parsing : int i");
		}
	}
	
}
		
