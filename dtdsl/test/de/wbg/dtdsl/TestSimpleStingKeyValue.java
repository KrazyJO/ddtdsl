package de.wbg.dtdsl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
	public void testSimpleStringOr()
	{
		String jsonString = "{ key : value }";
		String xmlString = "<el>val</el>";
		
		SimpleStringOrParser parser = new SimpleStringOrParser();
		Head jsonHead = parser.parse(jsonString);
		Head xmlHead = parser.parse(xmlString);
		
		Node xmlKey = xmlHead.getNodeByName("HEAD.node0");
		Attribute xmlValue = xmlKey.getAttributeByName("node0.attribute0");
		assertEquals("node should be key", true, xmlKey.isKey());
		assertEquals("wrong key", "el" ,xmlKey.getValue());
		assertEquals("wrong attribute", "val", xmlValue.getValue());
		 
		Node jsonKey = jsonHead.getNodeByName("HEAD.node0");
		Attribute josnValue = jsonKey.getAttributeByName("node0.attribute0");
		
		assertEquals("node should be key", true, jsonKey.isKey());
		assertEquals("wrong key", "key" ,jsonKey.getValue());
		assertEquals("wrong attribute", "value", josnValue.getValue());
	}
	
	@Test
	public void testSimpleStringMaybe()
	{
		String xmlString1 = 
				  "<el>val0</el>";
		
		String xmlString2 = 
				  "<el>val0</el>"
				+ "<el1>val2</el1>";
		
		SimpleStringMaybeParser parser = new SimpleStringMaybeParser();
		Head head1 = parser.parse(xmlString1);
		Head head2 = parser.parse(xmlString2);
		
		Node head1Node0 = head1.getNodeByName("HEAD.node0");
		Attribute head1Attrib0 = head1Node0.getAttributeByName("node0.attribute0");
		
		assertEquals("Node is not key", true, head1Node0.isKey());
		assertEquals("wrong node value", "el", head1Node0.getValue());
		assertEquals("wrong attribute value", "val0", head1Attrib0.getValue());
		
		Node head2Node0 = head2.getNodeByName("HEAD.node0");
		Attribute head2Attrib0 = head1Node0.getAttributeByName("node0.attribute0");
		
		assertEquals("Node is not key", true, head2Node0.isKey());
		assertEquals("wrong node value", "el", head2Node0.getValue());
		assertEquals("wrong attribute value", "val0", head2Attrib0.getValue());
		
		Node head2Node1 = head2.getNodeByName("HEAD.node1");
		Attribute head2Attribute1 = head2Node1.getAttributeByName("node1.attribute0");
		assertEquals("wrong node", "el1", head2Node1.getValue());
		assertEquals("wrong attribute", "val2", head2Attribute1.getValue());
	}
	
	@Test
	public void testSimpleXMLStringArray()
	{
		String xmlString = 
				  "<el>val0</el>"
				+ "<el>val1</el>"
				+ "<el>val2</el>"
				+ "<el>val3</el>";
		SimpleStringManyParser parser = new SimpleStringManyParser();
		Head head = parser.parse(xmlString);
		
		assertEquals("Head doesnt have the right size", 9, head.getTotalLength());
		
		Node node0 = head.getNodeByName("HEAD.node0");
		assertEquals("node should be key", true, node0.isKey());
		assertEquals("node has wrong value", "el", node0.getValue());
		Node node1 = head.getNodeByName("HEAD.node1");
		assertEquals("node should be key", true, node1.isKey());
		assertEquals("node has wrong value", "el", node1.getValue());
		Node node2 = head.getNodeByName("HEAD.node2");
		assertEquals("node should be key", true, node2.isKey());
		assertEquals("node has wrong value", "el", node2.getValue());
		Node node3 = head.getNodeByName("HEAD.node3");
		assertEquals("node should be key", true, node3.isKey());
		assertEquals("node has wrong value", "el", node3.getValue());
		
		Attribute node0attrib = node0.getAttributeByName("node0.attribute0");
		assertEquals("wrong attribute value", "val0", node0attrib.getValue());
		Attribute node1attrib = node1.getAttributeByName("node1.attribute0");
		assertEquals("wrong attribute value", "val1", node1attrib.getValue());
		Attribute node2attrib = node2.getAttributeByName("node2.attribute0");
		assertEquals("wrong attribute value", "val2", node2attrib.getValue());
		Attribute node3attrib = node3.getAttributeByName("node3.attribute0");
		assertEquals("wrong attribute value", "val3", node3attrib.getValue());
	}
	
	@Test
	public void testScanInt()
	{
		String parserString = "<1.2>123</1.2>";
		SimpleStringScanNotString parser = new SimpleStringScanNotString();
		Head head = parser.parse(parserString);
		
		Node node = head.getNodeByName("HEAD.node0");
		assertNotNull(node);
		Attribute attrib = node.getAttributeByName("node0.attribute0");
		assertNotNull(attrib);
		assertEquals("attribute type should be int.class", int.class, attrib.getType());
		assertEquals("attribute value should be 123 as int", 123, attrib.getValue());
//		Attribute attrib = node.getAttributeByName("node0.attribute0");
		
	}
	
	@Test
	public void testSimpleStringJsonArray()
	{
		String parserString = "[1,2,3]";
		SimpleStringJsonArrayParser parser = new SimpleStringJsonArrayParser();
		Head head = parser.parse(parserString);
		
	}
}
