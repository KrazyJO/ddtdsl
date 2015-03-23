package de.wbg.dtdsl;

import java.lang.reflect.Field;

class JSONSimple {
	
	private Head headNode;
	private Element actualNode;
	
	public JSONSimple()
	{
		
	}
	
	public Head parse(Object o)
	{
		this.headNode = new Head("HEAD");
		this.actualNode = this.headNode;
		//model.start
		try {
			parseJSONSimple(o, actualNode);
		}
		catch (Exception e)
		{
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
		
		return headNode;
	}
	
	private void parseJSONSimple(Object o, Element n) throws Exception
	{
		Node newNode = new Node("node"+n.increaseNodeNumber());
		newNode.setParent(n);
		n.addChild(newNode);
	
	
		//{Element copy = n.copy();
		try 
		{
			parseJSONSimpleAttributeTable(o, newNode);
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
		
	public void parseJSONSimpleAttributeTable(Object o, Element n) throws Exception
	{
		//Attribute
}
	private void parseHashMap(Object o, Element n) throws Exception
	{
		Node newNode = new Node("node"+n.increaseNodeNumber());
		newNode.setParent(n);
		n.addChild(newNode);
	
	
}
		
}
		
