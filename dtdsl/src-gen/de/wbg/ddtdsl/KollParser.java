package de.wbg.ddtdsl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.reflect.Array;
import java.util.HashMap;

class KollParser {
	
	private Head headNode;
	private Element actualNode;
	private SimpleScanner scanner;
	private HashMap<String, Node> stringKeyVariables;
	private HashMap<String, String> stringValueVariables;
	private ArrayList<Integer> visited;
	private HashMap<Integer, Node> allObjectNodes;
	
	public KollParser()
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
			parseContainerClass(o, actualNode);
		}
		catch (Exception e)
		{
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
		
		return headNode;
	}
	
	private void parseContainerClass(Object o, Element n) throws Exception
	{
	
		Node newNode = new Node(n.getNameForNode());
		newNode.setName("ContainerClass");
		newNode.setOriginalHashCode(this.visited.get(this.visited.size()-1));
		this.allObjectNodes.put(this.visited.get(this.visited.size()-1) ,newNode);
		newNode.setParent(n);
		n.addChild(newNode);
		//{Element copy = n.copy();
		try 
		{
		Field f = o.getClass().getDeclaredField("numbers");
		f.setAccessible(true);
		Object next = (Object) f.get(o);
		Head manyHead = new Head("MANYHEAD");
		
		if (next.getClass().isArray())
		{
			for (int index = 0; index < Array.getLength(next); index++)
			{
				parseManyContainerClassAttributeNumbers(Array.get(next ,index), manyHead);
			}
		}
		else if (next instanceof ArrayList)
		{
			ArrayList al = (ArrayList)next;
			for (int index = 0; index < al.size(); index++)
			{
				Object obj = al.get(index);
				parseManyContainerClassAttributeNumbers(obj, manyHead);
			}
		}
		else if (next instanceof LinkedList)
		{
			LinkedList al = (LinkedList)next;
			for (int index = 0; index < al.size(); index++)
			{
				Object obj = al.get(index);
				parseManyContainerClassAttributeNumbers(obj, manyHead);
			}
		}
		else if (next instanceof HashMap)
			{
				HashMap hashMap = (HashMap) next;
				
				for (Object entry : hashMap.keySet())
				{
					Object valueForEntry = hashMap.get(entry);
					
					//entry is primitiv
					//=> Node with key -> Attribute with value
					Node node = new Node(manyHead.getNameForNode());
					node.setOriginalHashCode(this.visited.get(this.visited.size()-1));
					this.allObjectNodes.put(this.visited.get(this.visited.size()-1) ,newNode);
					node.setKey(true);
					node.setValue(String.valueOf(entry));
					node.setName(entry.getClass().toString().replace("class ", ""));
					Attribute attrib = new Attribute(node.getNameForAttribute());
					attrib.setName("numbers");
					attrib.setValue(hashMap.get(entry));
					attrib.setType(hashMap.get(entry).getClass());
					
					node.addChild(attrib);
					attrib.setParent(node);
					
					manyHead.addChild(node);
					node.setParent(manyHead);
				}
			}
		
		for (Element el: manyHead.getChildren())
		{
			newNode.addChild(el);
			el.setParent(newNode);
		}
		if (newNode.getTotalLength() == 1)
		{
			//remove newNode
			newNode.setParent(null);
			n.removeChild(newNode);
		}
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
		 	Node parent = new Node(n.getId());
			parent.setNodeNumber(n.getNodeNumber());
			parent.setAttributeNumber(n.getAttributeNumber());
			parseContainerClassStringClass(o, parent);
			
			for (Element ch : parent.getChildren())
			{
				ch.setParent(n);
				n.addChild(ch);
				n.increaseNodeNumber();
				newNode.setNext(ch);
			}
			
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
		parseContainerClassAttributeObject(o, newNode);
		}
		catch (ParserException e)
		{
			System.err.println(e.getMessage());
			newNode.setParent(null);
			n.removeChild(newNode);
		}
		
		actualNode = n;
	
}
		
	public void parseManyContainerClassAttributeNumbers(Object o, Element n) throws Exception
	{
		Attribute valueNode = new Attribute("attribute" + n.increaseAttributeNumber());
		valueNode.setType(o.getClass());
	
		valueNode.setName("numbers");
		valueNode.setValue(o);
		
		valueNode.setParent(n);
		n.getChildren().add(valueNode);
		//many
	}
	public void parseContainerClassStringClass(Object o, Element n) throws Exception
	{
		//Next: 
		//kein code: f
		try {
			Field f = o.getClass().getDeclaredField("f"); //NoSuchFieldException
			f.setAccessible(true);
			Object next = (Object) f.get(o); //IllegalAccessException
			
			int nextVisit = System.identityHashCode(next);
			if (this.visited.contains(nextVisit))
			{
				//complete parser circle
				Node actNode = this.allObjectNodes.get(this.visited.get(this.visited.size()-1));
				Node circleNode = this.allObjectNodes.get(nextVisit);
				actNode.setNext(circleNode);
				circleNode.setPrevious(actNode);
				return;
			}
			else
			{
				this.visited.add(nextVisit);
			}
		
			parseStringClass(next, n);
			actualNode = n;
		}
		catch (NoSuchFieldException e)
		{
			throw new ParserException("could not find field \"f\" in StringClass");
		}
		catch (SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			throw new ParserException("Error while parsing f");
		}
		
			}
		
	public void parseContainerClassAttributeObject(Object o, Element n) throws Exception
	{
		//Attribute
		//inner == null
		int oldAttributeNumber = n.getAttributeNumber();
		try {
			
			Field f = o.getClass().getDeclaredField("object"); //NoSuchFieldException
			f.setAccessible(true);
			Object iWantThis = f.get(o); //IllegalAccessException
		
			Attribute valueNode = new Attribute("attribute" + n.increaseAttributeNumber());
		
			valueNode.setName("object");
			valueNode.setValue(iWantThis);
			valueNode.setType(iWantThis.getClass());
			
			valueNode.setParent(n);
			n.getChildren().add(valueNode);
			
		}
		catch (NoSuchFieldException e)
		{
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("could not find field \"object\" in ContainerClass");
		}
		catch ( SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			//e.printStackTrace();
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("Error while parsing: object");
		}
	}
	
	private void parseStringClass(Object o, Element n) throws Exception
	{
	
		Node newNode = new Node(n.getNameForNode());
		newNode.setName("StringClass");
		newNode.setOriginalHashCode(this.visited.get(this.visited.size()-1));
		this.allObjectNodes.put(this.visited.get(this.visited.size()-1) ,newNode);
		newNode.setParent(n);
		n.addChild(newNode);
		//{Element copy = n.copy();
		try 
		{
		parseStringClassAttributeParseString(o, newNode);
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
		 	Node parent = new Node(n.getId());
			parent.setNodeNumber(n.getNodeNumber());
			parent.setAttributeNumber(n.getAttributeNumber());
			parseStringClassContainerClass(o, parent);
			
			for (Element ch : parent.getChildren())
			{
				ch.setParent(n);
				n.addChild(ch);
				n.increaseNodeNumber();
				newNode.setNext(ch);
			}
			
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
		parseStringClassAttributeObject(o, newNode);
		}
		catch (ParserException e)
		{
			System.err.println(e.getMessage());
			newNode.setParent(null);
			n.removeChild(newNode);
		}
		
		actualNode = n;
	
}
		
	public void parseStringClassAttributeParseString(Object o, Element n) throws Exception
	{
		//Attribute
		//inner == null
		int oldAttributeNumber = n.getAttributeNumber();
		try {
			
			Field f = o.getClass().getDeclaredField("parseString"); //NoSuchFieldException
			f.setAccessible(true);
			Object iWantThis = f.get(o); //IllegalAccessException
		
			Attribute valueNode = new Attribute("attribute" + n.increaseAttributeNumber());
		
			valueNode.setName("parseString");
			valueNode.setValue(iWantThis);
			valueNode.setType(iWantThis.getClass());
			
			valueNode.setParent(n);
			n.getChildren().add(valueNode);
			
			parseStringToParse(iWantThis, valueNode);
		}
		catch (NoSuchFieldException e)
		{
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("could not find field \"parseString\" in StringClass");
		}
		catch ( SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			//e.printStackTrace();
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("Error while parsing: parseString");
		}
	}
	
	public void parseStringClassContainerClass(Object o, Element n) throws Exception
	{
		//Next: 
		//kein code: f
		try {
			Field f = o.getClass().getDeclaredField("f"); //NoSuchFieldException
			f.setAccessible(true);
			Object next = (Object) f.get(o); //IllegalAccessException
			
			int nextVisit = System.identityHashCode(next);
			if (this.visited.contains(nextVisit))
			{
				//complete parser circle
				Node actNode = this.allObjectNodes.get(this.visited.get(this.visited.size()-1));
				Node circleNode = this.allObjectNodes.get(nextVisit);
				actNode.setNext(circleNode);
				circleNode.setPrevious(actNode);
				return;
			}
			else
			{
				this.visited.add(nextVisit);
			}
		
			parseContainerClass(next, n);
			actualNode = n;
		}
		catch (NoSuchFieldException e)
		{
			throw new ParserException("could not find field \"f\" in ContainerClass");
		}
		catch (SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			throw new ParserException("Error while parsing f");
		}
		
			}
		
	public void parseStringClassAttributeObject(Object o, Element n) throws Exception
	{
		//Attribute
		//inner == null
		int oldAttributeNumber = n.getAttributeNumber();
		try {
			
			Field f = o.getClass().getDeclaredField("object"); //NoSuchFieldException
			f.setAccessible(true);
			Object iWantThis = f.get(o); //IllegalAccessException
		
			Attribute valueNode = new Attribute("attribute" + n.increaseAttributeNumber());
		
			valueNode.setName("object");
			valueNode.setValue(iWantThis);
			valueNode.setType(iWantThis.getClass());
			
			valueNode.setParent(n);
			n.getChildren().add(valueNode);
			
		}
		catch (NoSuchFieldException e)
		{
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("could not find field \"object\" in StringClass");
		}
		catch ( SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			//e.printStackTrace();
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("Error while parsing: object");
		}
	}
	
	private void parseStringToParse(Object o, Element n) throws Exception
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
		
		//parseValue 
		{
			nodeForValue = this.stringKeyVariables.get("key");
			
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
			//keyRef de.wbg.dTDSL.impl.StringKeyImpl@7c4dfc16 (name: key, type: String)
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
		
		//overread <
		if (scanner.hasNext("<"))
		{
			scanner.skip("<");
		}
		else
		{
			throw new ParserException("Error while parsing String in  while overreading \"<\"");
		}
		
		//parseKey innerKey
		{
			Node stringNode = new Node(n.getNameForNode());
			String key = scanner.scanUpToString(">");
			stringNode.setValueClass(String.class);
			stringNode.setValue(key);
			stringNode.setKey(true);
			this.stringKeyVariables.put("innerKey", stringNode);
			
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
			nodeForValue = this.stringKeyVariables.get("innerKey");
			
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
			//keyRef de.wbg.dTDSL.impl.StringKeyImpl@30bb003a (name: innerKey, type: String)
			Node storedValue = this.stringKeyVariables.get("innerKey");	
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
					
					parseStringToParseOptionXml(manyHead);
					
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
		//overread <
		if (scanner.hasNext("<"))
		{
			scanner.skip("<");
		}
		else
		{
			throw new ParserException("Error while parsing String in  while overreading \"<\"");
		}
		
		//parseKey key3
		{
			Node stringNode = new Node(n.getNameForNode());
			String key = scanner.scanUpToString(">");
			stringNode.setValueClass(String.class);
			stringNode.setValue(key);
			stringNode.setKey(true);
			this.stringKeyVariables.put("key3", stringNode);
			
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
			nodeForValue = this.stringKeyVariables.get("key3");
			
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
			//keyRef de.wbg.dTDSL.impl.StringKeyImpl@59571106 (name: key3, type: String)
			Node storedValue = this.stringKeyVariables.get("key3");	
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
		
	private void parseStringToParseOptionXml(Element n) throws Exception
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
		
		{
			//keyRef de.wbg.dTDSL.impl.StringKeyImpl@30bb003a (name: innerKey, type: String)
			Node storedValue = this.stringKeyVariables.get("innerKey");	
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
		
		//parseValue val
		{
			nodeForValue = this.stringKeyVariables.get("innerKey");
			
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
			//keyRef de.wbg.dTDSL.impl.StringKeyImpl@30bb003a (name: innerKey, type: String)
			Node storedValue = this.stringKeyVariables.get("innerKey");	
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
	private static String getInstance(Object o)
	{
		if (o instanceof Object[])
		{
			return "Array";
		}
		else if (o instanceof ArrayList)
		{
			return "ArrayList";
		}
		else if (o instanceof HashMap)
		{
			return "HashMap";
		}
		else if (o instanceof LinkedList)
		{
			return "LinkedList";
		}
		else 
		{
			return "unknown";
		}
	}
		
}