package de.wbg.dtdsl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;		

class SimpleStringXML {
	
	private Head headNode;
	private Element actualNode;
	private SimpleScanner scanner;
	private HashMap<String, String> stringKeyVariables;
	private HashMap<String, String> stringValueVariables;
	private ArrayList<Integer> visited;
	
	public SimpleStringXML()
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
			parseSimpleKeyValue(o, actualNode);
		}
		catch (Exception e)
		{
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
		
		return headNode;
	}
	
	private void parseSimpleKeyValue(Object o, Element n) throws Exception
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
			throw new ParserException("Error while parsing String in SimpleKeyValue while overreading \"<\"");
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
			throw new ParserException("Error while parsing String in SimpleKeyValue while overreading \">\"");
		}
		
		//parseValue val
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
			throw new ParserException("Error while parsing String in SimpleKeyValue while overreading \"</\"");
		}
		
		{
			//keyRef de.wbg.dTDSL.impl.StringKeyImpl@1c5c2b83 (name: key, type: String)
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
			throw new ParserException("Error while parsing String in SimpleKeyValue while overreading \">\"");
		}
		
	}
}
		
