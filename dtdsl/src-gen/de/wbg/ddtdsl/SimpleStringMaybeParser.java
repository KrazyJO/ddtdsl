package de.wbg.ddtdsl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

class SimpleStringMaybeParser {
	
	private Head headNode;
	private Element actualNode;
	private Element prev;
	private SimpleScanner scanner;
	private HashMap<String, Node> stringKeyVariables;
	private HashMap<String, String> stringValueVariables;
	private ArrayList<Integer> visited;
	private HashMap<Integer, Node> allObjectNodes;
	
	public SimpleStringMaybeParser()
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
			parseXmlMaybe(o, actualNode);
		}
		catch (Exception e)
		{
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
		
		return headNode;
	}
	
	private void parseXmlMaybe(Object o, Element n) throws Exception
	{
		String s = (String) o;
		scanner.setScanString(s);
		
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
			stringNode.setValueClass(String.class);
			stringNode.setValue(key);
			stringNode.setKey(true);
			this.stringKeyVariables.put("key", stringNode);
			
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
		
		//parseValue val
		{
			Attribute valueAttrib = new Attribute(nodeForValue.getNameForAttribute());
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
			//keyRef de.wbg.dTDSL.impl.StringKeyImpl@3f6951ab (name: key, type: String)
			Node storedValue = this.stringKeyVariables.get("key");	
			if (storedValue == null)
			{
				throw new ParserException("Variable is not exsisting");
			}
			else
			{
				//Wert der gespeicherten Variable mit dem geparsten Wert ?berpr?fen
				String value = scanner.scanUpToString(">");
				if (!value.equals(String.valueOf(storedValue.getValue())))
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
		
			{ //maybe
				int scannerPosition = scanner.getPosition();
				Head maybeHead = new Head("none");
				maybeHead.setNodeNumber(n.getNodeNumber());
				maybeHead.setAttributeNumber(n.getAttributeNumber());
				try 
				{
					parseXmlMaybeOptionMaybe(maybeHead);
					
					for (Element el : maybeHead.getChildren())
					{
						n.addChild(el);
						el.setParent(n);
						maybeHead.removeChild(el);
					}
					
					n.setNodeNumber(maybeHead.getNodeNumber());
					n.setAttributeNumber(maybeHead.getAttributeNumber());
				}
				catch (Exception e)
				{
					throw e;
				}
			}
				
	}
		
	private void parseXmlMaybeOptionMaybe(Element n) throws Exception
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
			stringNode.setValueClass(String.class);
			stringNode.setValue(key);
			stringNode.setKey(true);
			this.stringKeyVariables.put("key", stringNode);
			
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
		
		//parseValue val
		{
			Attribute valueAttrib = new Attribute(nodeForValue.getNameForAttribute());
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
			//keyRef de.wbg.dTDSL.impl.StringKeyImpl@437dab06 (name: key, type: String)
			Node storedValue = this.stringKeyVariables.get("key");	
			if (storedValue == null)
			{
				throw new ParserException("Variable is not exsisting");
			}
			else
			{
				//Wert der gespeicherten Variable mit dem geparsten Wert ?berpr?fen
				String value = scanner.scanUpToString(">");
				if (!value.equals(String.valueOf(storedValue.getValue())))
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
	private void parseStringXmlMaybeMaybe(Element n) throws Exception
	{
		
	}
}