package de.wbg.ddtdsl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

class SimpleMaybeAttributeParser {
	
	private Head headNode;
	private Element actualNode;
	private Element prev;
	private SimpleScanner scanner;
	private HashMap<String, Node> stringKeyVariables;
	private HashMap<String, String> stringValueVariables;
	private ArrayList<Integer> visited;
	private HashMap<Integer, Node> allObjectNodes;
	
	public SimpleMaybeAttributeParser()
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
		newNode.setName("Skv");
		newNode.setOriginalHashCode(this.visited.get(this.visited.size()-1));
		this.allObjectNodes.put(this.visited.get(this.visited.size()-1) ,newNode);
		newNode.setParent(n);
		n.addChild(newNode);
		//{Element copy = n.copy();
		try 
		{
		parseSkvAttributeS(o, newNode);
		}
		catch (ParserException e)
		{
			System.err.println(e.getMessage());
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
			System.err.println(e.getMessage());
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
		catch (NoSuchFieldException e)
		{
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("could not find field \"s\" in Skv");
		}
		catch ( SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			//e.printStackTrace();
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("Error while parsing: s");
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