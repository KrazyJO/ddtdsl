package de.wbg.ddtdsl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

class SimpleStringOrParser {
	
	private Head headNode;
	private Element actualNode;
	private Element prev;
	private SimpleScanner scanner;
	private HashMap<String, Node> stringKeyVariables;
	private HashMap<String, String> stringValueVariables;
	private ArrayList<Integer> visited;
	private HashMap<Integer, Node> allObjectNodes;
	
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
		this.allObjectNodes = new HashMap<>();
		//model.start
		try {
			int nextVisit = System.identityHashCode(o);
			this.visited.add(nextVisit);
			parseOrtester(o, actualNode);
		}
		catch (Exception e)
		{
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
		
		return headNode;
	}
	
	private void parseOrtester(Object o, Element n) throws Exception
	{
		String s = (String) o;
		scanner.setScanString(s);
		
		Node nodeForValue = new Node("none");
		
		{
			int oldStringPosition = this.scanner.getPosition();
			boolean optionFound = false;
			ArrayList<Head> parsedOptions = new ArrayList<Head>();
			if (!optionFound)
			{
				try
				{
					Head optionHead = new Head("OPTIONHEAD");
					parseOrtesterOptionJson(optionHead);
					optionFound = true;
					
					parsedOptions.add(optionHead);
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
					parseOrtesterOptionXml(optionHead);
					optionFound = true;
					
					parsedOptions.add(optionHead);
				}
				catch (ParserException e)
				{
					optionFound = false;
					scanner.resetToPosition(oldStringPosition);
				}
			}
			
			
			//get the head form parsedOptions with max length
			int optionIndex = -1;
			int optionIndexLength = -1;
			for (int i = 0; i < parsedOptions.size(); i++)
			{
				Element el = parsedOptions.get(i);
				if (el.getTotalLength() > optionIndexLength)
				{
					optionIndex = i;
					optionIndexLength = el.getTotalLength();
				}
			}
		
			if (optionIndex >= 0 && optionIndexLength > 0)
			{
				Element el = parsedOptions.get(optionIndex);
				for (Element element : el.getChildren())
				{
					n.addChild(element);
					element.setParent(n);
					el.removeChild(element);
				}
			}
			else
			{
				throw new ParserException("no possible or-option found in StringDescription \"Ortester\"");
			}
				
			if (!optionFound)
			{
				throw new ParserException("no possible or option found in stringobject Ortester");
			}
			}
	}
		
	private void parseOrtesterOptionJson(Element n) throws Exception
	{
		Node nodeForValue = new Node("none");
		//overread {:
		if (scanner.hasNext("{:"))
		{
			scanner.skip("{:");
		}
		else
		{
			throw new ParserException("Error while parsing String in  while overreading \"{:\"");
		}
		
		//parseKey key
		{
			Node stringNode = new Node(n.getNameForNode());
			String key = scanner.scanUpToString(":");
			stringNode.setValueClass(String.class);
			stringNode.setValue(key);
			stringNode.setKey(true);
			this.stringKeyVariables.put("key", stringNode);
			
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
			Attribute valueAttrib = new Attribute(nodeForValue.getNameForAttribute());
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
	private void parseOrtesterOptionXml(Element n) throws Exception
	{
		Node nodeForValue = new Node("none");
		//overread <:
		if (scanner.hasNext("<:"))
		{
			scanner.skip("<:");
		}
		else
		{
			throw new ParserException("Error while parsing String in  while overreading \"<:\"");
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
		
		//parseValue value
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
			//keyRef de.wbg.dTDSL.impl.StringKeyImpl@4fa7e014 (name: key, type: String)
			Node storedValue = this.stringKeyVariables.get("key");	
			if (storedValue == null)
			{
				throw new ParserException("Variable is not exsisting");
			}
			else
			{
				//Wert der gespeicherten Variable mit dem geparsten Wert überprüfen
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
}