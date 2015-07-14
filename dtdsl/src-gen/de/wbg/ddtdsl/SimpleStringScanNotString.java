package de.wbg.ddtdsl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

class SimpleStringScanNotString {
	
	private Head headNode;
	private Element actualNode;
	private Element prev;
	private SimpleScanner scanner;
	private HashMap<String, Node> stringKeyVariables;
	private HashMap<String, String> stringValueVariables;
	private ArrayList<Integer> visited;
	private HashMap<Integer, Node> allObjectNodes;
	
	public SimpleStringScanNotString()
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
			parseDesc(o, actualNode);
		}
		catch (Exception e)
		{
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
		
		return headNode;
	}
	
	private void parseDesc(Object o, Element n) throws Exception
	{
		String s = (String) o;
		scanner.setScanString(s);
		
		Node nodeForValue = new Node("none");
		
	{ //many
			boolean runLoop = true;
			int scannerPosition;
			while (runLoop)
			{
				scannerPosition = scanner.getPosition();
				try
				{
					Head manyHead = new Head("none");
					manyHead.setNodeNumber(n.getNodeNumber());
					manyHead.setAttributeNumber(n.getAttributeNumber());
					
					parseDescOptionDes(manyHead);
					
					for (Element el : manyHead.getChildren())
					{
						n.addChild(el);
						el.setParent(n);
					}
					
					n.setNodeNumber(manyHead.getNodeNumber());
					n.setAttributeNumber(manyHead.getAttributeNumber());
				}
				catch (Exception e)
				{
					runLoop = false;
					scanner.resetToPosition(scannerPosition);
				}
			}
		}
	}
		
	private void parseDescOptionDes(Element n) throws Exception
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
			double key = scanner.scanUpToStringAsDouble(">");
			stringNode.setValueClass(double.class);
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
		
		//parseValue 
		{
			Attribute valueAttrib = new Attribute(nodeForValue.getNameForAttribute());
			valueAttrib.setType(int.class);
			//parse Value
			int value = scanner.scanUpToStringAsInt("</");
			
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
			//keyRef de.wbg.dTDSL.impl.StringKeyImpl@6d8d560 (name: key, type: double)
			Node storedValue = this.stringKeyVariables.get("key");	
			if (storedValue == null)
			{
				throw new ParserException("Variable is not exsisting");
			}
			else
			{
				//Wert der gespeicherten Variable mit dem geparsten Wert überprüfen
				double value = scanner.scanUpToStringAsDouble(">");
				if (value != (double)storedValue.getValue())
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