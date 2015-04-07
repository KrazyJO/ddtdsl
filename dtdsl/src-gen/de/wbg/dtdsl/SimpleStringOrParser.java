package de.wbg.dtdsl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

class SimpleStringOrParser {
	
	private Head headNode;
	private Element actualNode;
	private Element prev;
	private SimpleScanner scanner;
	private HashMap<String, String> stringKeyVariables;
	private HashMap<String, String> stringValueVariables;
	private ArrayList<Integer> visited;
	
	public SimpleStringOrParser()
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
			parseOr(o, actualNode);
		}
		catch (Exception e)
		{
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
		
		return headNode;
	}
	
	private void parseOr(Object o, Element n) throws Exception
	{
		String s = (String) o;
		scanner.setScanString(s);
		
		Node nodeForValue = new Node("none");
		
		{
			int oldStringPosition = this.scanner.getPosition();
			boolean optionFound = false;
			if (!optionFound)
			{
				try
				{
					Head optionHead = new Head("OPTIONHEAD");
					parseOrOptionjson(optionHead);
					optionFound = true;
				}
				catch (ParserException e)
				{
					optionFound = false;
					scanner.resetToPosition(oldStringPosition);
				}
			}
			
			if (!optionFound)
			{
				try
				{
					Head optionHead = new Head("OPTIONHEAD");
					parseOrOptionxml(optionHead);
					optionFound = true;
				}
				catch (ParserException e)
				{
					optionFound = false;
					scanner.resetToPosition(oldStringPosition);
				}
			}
			
			if (!optionFound)
			{
				throw new ParserException("no possible option found in stringobject Or");
			}
		}
	}
		
	private void parseOrOptionjson(Element n) throws Exception
	{
		Node nodeForValue = new Node("none");
		//overread {
		if (scanner.hasNext("{"))
		{
			scanner.skip("{");
		}
		else
		{
			throw new ParserException("Error while parsing String in  while overreading \"{\"");
		}
		
		//parseKey key
		{
			Node stringNode = new Node(n.getNameForNode());
			String key = scanner.scanUpToString(":");
			stringNode.setValue(key);
			stringNode.setKey(true);
			this.stringKeyVariables.put("key", key);
			
			stringNode.setParent(n);
			n.addChild(stringNode);
			nodeForValue = stringNode;
		}
		
		//overread :
		if (scanner.hasNext(":"))
		{
			scanner.skip(":");
		}
		else
		{
			throw new ParserException("Error while parsing String in  while overreading \":\"");
		}
		
		//parseValue value
		{
			Attribute valueAttrib = new Attribute(n.getNameForAttribute());
			valueAttrib.setType(String.class);
			//parse Value
			String value = scanner.scanUpToString("}");
			valueAttrib.setValue(value);
			valueAttrib.setParent(nodeForValue);
			nodeForValue.addChild(valueAttrib);
		}
		//overread }
		if (scanner.hasNext("}"))
		{
			scanner.skip("}");
		}
		else
		{
			throw new ParserException("Error while parsing String in  while overreading \"}\"");
		}
		
	}
	private void parseOrOptionxml(Element n) throws Exception
	{
		Node nodeForValue = new Node("none");
		//overread <
		if (scanner.hasNext("<"))
		{
			scanner.skip("<");
		}
		else
		{
			throw new ParserException("Error while parsing String in  while overreading \"<\"");
		}
		
		//parseKey key
		{
			Node stringNode = new Node(n.getNameForNode());
			String key = scanner.scanUpToString(">");
			stringNode.setValue(key);
			stringNode.setKey(true);
			this.stringKeyVariables.put("key", key);
			
			stringNode.setParent(n);
			n.addChild(stringNode);
			nodeForValue = stringNode;
		}
		
		//overread >
		if (scanner.hasNext(">"))
		{
			scanner.skip(">");
		}
		else
		{
			throw new ParserException("Error while parsing String in  while overreading \">\"");
		}
		
		//parseValue value
		{
			Attribute valueAttrib = new Attribute(n.getNameForAttribute());
			valueAttrib.setType(String.class);
			//parse Value
			String value = scanner.scanUpToString("</");
			valueAttrib.setValue(value);
			valueAttrib.setParent(nodeForValue);
			nodeForValue.addChild(valueAttrib);
		}
		//overread </
		if (scanner.hasNext("</"))
		{
			scanner.skip("</");
		}
		else
		{
			throw new ParserException("Error while parsing String in  while overreading \"</\"");
		}
		
		{
			//keyRef de.wbg.dTDSL.impl.StringKeyImpl@2e0eb69d (name: key, type: String)
			String storedValue = this.stringKeyVariables.get("key");	
			if (storedValue == null)
			{
				throw new ParserException("Variable is not exsisting");
			}
			else
			{
				//Wert der gespeicherten Variable mit dem geparsten Wert überprüfen
				String value = scanner.scanUpToString(">");
				if (!value.equals(storedValue))
				{
					throw new ParserException("Different key values are not allowed at this context");
				}
			}
		}
	
		//overread >
		if (scanner.hasNext(">"))
		{
			scanner.skip(">");
		}
		else
		{
			throw new ParserException("Error while parsing String in  while overreading \">\"");
		}
		
	}
}