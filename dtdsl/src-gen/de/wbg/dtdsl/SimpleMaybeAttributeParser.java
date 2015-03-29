package de.wbg.dtdsl;

import java.lang.reflect.Field;

class SimpleMaybeAttributeParser {
	
	private Head headNode;
	private Element actualNode;
	
	public SimpleMaybeAttributeParser()
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
			Object temp = o;
			try
			{
				parseMaybeSkvAttributeI(temp, maybeHead);
				for (Element child: maybeHead.getChildren())
				{
					newNode.addChild(child);
					child.setParent(newNode);
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
	
	public void parseMaybeSkvAttributeI(Object o, Element n) throws Exception
	{
		//Attribute
		//inner == null
		int oldAttributeNumber = n.getAttributeNumber();
	try {

		Field f = o.getClass().getDeclaredField("i"); //NoSuchFieldException
		f.setAccessible(true);
		Object iWantThis = f.get(o); 
	
		Attribute valueNode = new Attribute("attribute" + n.increaseAttributeNumber());
		valueNode.setType(iWantThis.getClass());
	
		valueNode.setName("i");
		valueNode.setValue(iWantThis);
		
		valueNode.setParent(n);
		n.getChildren().add(valueNode);
	}
	catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
	{
		//e.printStackTrace();
		n.setAttributeNumber(oldAttributeNumber);
		throw new ParserException("Error while parsing : i");
	}
		///maybe
	}
}
		
