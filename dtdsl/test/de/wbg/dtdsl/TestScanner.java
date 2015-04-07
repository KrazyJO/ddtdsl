package de.wbg.dtdsl;

import static org.junit.Assert.fail;

import java.util.HashMap;

import org.junit.Test;

public class TestScanner {

	SimpleScanner scanner = new SimpleScanner();
	HashMap<String, String> stringKeyVariables = new HashMap<String, String>();
	
	@Test
	public void testScanner()
	{
		String stringJsonString = "{blupp:blapp}";
		String xmlString = "<el>val</el>";
		Head head = new Head("HEAD");
		
		try {
			this.parseSimpleKeyValue(xmlString, head);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
			fail();
		}
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
		
		//parseValue 
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
			//keyRef de.wbg.dTDSL.impl.StringKeyImpl@1bbd285b (name: key, type: String)
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
