package de.wbg.ddtdsl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

class SimpleStringJsonArrayParser {
	
	private Head headNode;
	private Element actualNode;
	private Element prev;
	private SimpleScanner scanner;
	private HashMap<String, Node> stringKeyVariables;
	private HashMap<String, String> stringValueVariables;
	private ArrayList<Integer> visited;
	private HashMap<Integer, Node> allObjectNodes;
	
	public SimpleStringJsonArrayParser()
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
			parseJsonArray(o, actualNode);
		}
		catch (Exception e)
		{
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
		
		return headNode;
	}
	
	private void parseJsonArray(Object o, Element n) throws Exception
	{
		String s = (String) o;
		scanner.setScanString(s);
		
		Node nodeForValue = new Node("none");
		
		//overread [
		if (scanner.hasNext("["))
		{
			scanner.skip("[");
		}
		else
		{
			throw new ParserException("Error while parsing String in  while overreading \"[\"");
		}
		
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
					
					parseJsonArrayOptionMany(manyHead);
					
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
		//overread ]
		if (scanner.hasNext("]"))
		{
			scanner.skip("]");
		}
		else
		{
			throw new ParserException("Error while parsing String in  while overreading \"]\"");
		}
		
	}
		
	private void parseJsonArrayOptionMany(Element n) throws Exception
	{
		Node nodeForValue = new Node("none");
		//parseValue 
		{
			Attribute valueAttrib = new Attribute(nodeForValue.getNameForAttribute());
			valueAttrib.setType(int.class);
			//parse Value
			String value = null;
			{
				int scannerPos = scanner.getPosition();
				try
				{
					value = scanner.scanUpToString(",");
				}
				catch (Exception e)
				{
					scanner.resetToPosition(scannerPos);
				}
			}
			
			
			valueAttrib.setValue(value);
			valueAttrib.setParent(nodeForValue);
			nodeForValue.addChild(valueAttrib);
		}
			{ //maybe
				int scannerPosition = scanner.getPosition();
				Head maybeHead = new Head("none");
				maybeHead.setNodeNumber(n.getNodeNumber());
				maybeHead.setAttributeNumber(n.getAttributeNumber());
				try 
				{
					parseJsonArrayOptionComma(maybeHead);
					
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
	private void parseJsonArrayOptionEnd(Element n) throws Exception
	{
		Node nodeForValue = new Node("none");
		//overread ]
		if (scanner.hasNext("]"))
		{
			scanner.skip("]");
		}
		else
		{
			throw new ParserException("Error while parsing String in  while overreading \"]\"");
		}
		
	}
	private void parseJsonArrayOptionComma(Element n) throws Exception
	{
		Node nodeForValue = new Node("none");
		//overread ,
		if (scanner.hasNext(","))
		{
			scanner.skip(",");
		}
		else
		{
			throw new ParserException("Error while parsing String in  while overreading \",\"");
		}
		
	}
	private void parseStringJsonArrayMaybe(Element n) throws Exception
	{
		
	}
}