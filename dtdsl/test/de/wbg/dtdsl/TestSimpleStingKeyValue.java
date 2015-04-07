package de.wbg.dtdsl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSimpleStingKeyValue {

	@Test
	public void testSimpleJSONString()
	{
		String jsonString = "{ key : value }";
		SimpleStringJson parser = new SimpleStringJson();
		Head head = parser.parse(jsonString);
		
		Node key = head.getNodeByName("HEAD.node0");
		Attribute value = key.getAttributeByName("node0.attribute0");
		
		assertEquals("node should be key", true, key.isKey());
		assertEquals("wrong key", "key" ,key.getValue());
		assertEquals("wrong attribute", "value", value.getValue());
	}
	
	@Test
	public void testSimpleXMLString()
	{
		String xmlString = "<el>val</el>";
		SimpleStringXML parser = new SimpleStringXML();
		Head head = parser.parse(xmlString);
		
		Node key = head.getNodeByName("HEAD.node0");
		Attribute value = key.getAttributeByName("node0.attribute0");
		
		assertEquals("node should be key", true, key.isKey());
		assertEquals("wrong key", "el" ,key.getValue());
		assertEquals("wrong attribute", "val", value.getValue());
	}
	
	@Test
	public void testSimpleXMLStringArray()
	{
		String xmlString = 
				  "<el>val0</el>"
				+ "<el>val1</el>"
				+ "<el>val2</el>"
				+ "<el>val3</el>";
	}
}
