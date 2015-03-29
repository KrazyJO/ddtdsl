package de.wbg.dtdsl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

import de.wbg.dtdsl.testhelper.SimpleArray;
import de.wbg.dtdsl.testhelper.SimpleArrayAttributeI;
import de.wbg.dtdsl.testhelper.SimpleArrayListAttributeI;
import de.wbg.dtdsl.testhelper.SimpleArrayListKeyValue;
import de.wbg.dtdsl.testhelper.SimpleHashMapWithPrimitivValue;
import de.wbg.dtdsl.testhelper.SimpleHashMapWithSimpleValue;
import de.wbg.dtdsl.testhelper.SimpleKeyValue;
import de.wbg.dtdsl.testhelper.SimpleLinkedList;
import de.wbg.dtdsl.testhelper.SimpleLinkedListAttributeI;



public class TestClass {

	@Test
	public void testSimpleKeyValue() {
		SimpleKeyValue skv = new SimpleKeyValue();
		skv.setI(1);
		skv.setS("eins");
		
		SimpleParser p = new SimpleParser();
		Head o = p.parse(skv);
		Node childOfO = (Node)o.getChildren().get(0); //key
		Attribute attrib1 = (Attribute)childOfO.getChildren().get(1); //value
		Attribute attrib0 = (Attribute)childOfO.getChildren().get(0); //value
		
		assertTrue("head should have 1 child, but has: " + o.getChildren().size(), o.getChildren().size() == 1);
		assertTrue("child of o: wrong parent", ((Head)childOfO.getParent()) == o);
		assertEquals("child of o: wrong number of children", 2, childOfO.size());
		
		assertTrue("childOfChildOfO: wrong parent", attrib1.getParent() == childOfO);
		assertTrue("childOfChildOfO: attribute name should be \"i\", but is " + attrib1.getName(), attrib1.getName() == "i");
		assertEquals(attrib1.getType(), Integer.class);
		assertTrue("childOfChildOfO: value should be \"1\", but is " + attrib1.getValue(), attrib1.getValue().equals( 1));
		
		assertTrue("childOfChildOfO: wrong parent", attrib0.getParent() == childOfO);
		assertTrue("childOfChildOfO: attribute name should be \"i\", but is " + attrib0.getName(), attrib0.getName() == "s");
		assertEquals(attrib0.getType(), String.class);
		assertTrue("childOfChildOfO: value should be \"1\", but is " + attrib0.getValue(), attrib0.getValue().equals( "eins"));
	}
	
	
	@Test
	public void testSimpleNext()
	{
		SimpleKeyValue skv = new SimpleKeyValue();
		skv.setI(1);
		skv.setS("eins");
		
		SimpleKeyValue skv2 = new SimpleKeyValue();
		skv2.setI(2);
		skv2.setS("zwei");
		skv.setNext(skv2);
		
		SimpleNextParser p = new SimpleNextParser();
		Head o = p.parse(skv);
		
		Node next = (Node)o.getChildren().get(0);
		Attribute attribute1 = (Attribute)next.getChildren().get(0);
		Attribute attribute2 = (Attribute)next.getChildren().get(1);
		
		assertEquals("head has wrong number of children: ", 2, o.getChildren().size());
		assertEquals("next should have 2 attributes", 2, next.size());
		assertTrue("next: wrong parent", next.getParent() == o);
		
		assertTrue("attribute1: wrong parent", attribute1.getParent() == next);
		assertTrue("attribute1: attribute name should be \"s\"", attribute1.getName() == "s");
		assertTrue("attribute1: value should be \"eins\", but is " + attribute1.getValue(), attribute1.getValue().equals( "eins"));
		
		assertTrue("attribute2: wrong parent", attribute2.getParent() == next);
		assertTrue("attribute2: attribute name should be \"i\"", attribute2.getName() == "i");
		assertTrue("attribute2: value should be 1, but is " + attribute2.getValue(), attribute2.getValue().equals( 1));
		
		next = (Node)o.getChildren().get(1);
		attribute1 = (Attribute)next.getChildren().get(0);
		attribute2 = (Attribute)next.getChildren().get(1);
		
		assertEquals("next should have 2 attributes", 2, next.size());
		assertTrue("next: wrong parent", next.getParent() == o);
		
		assertTrue("attribute1: wrong parent", attribute1.getParent() == next);
		assertTrue("attribute1: attribute name should be \"s\"", attribute1.getName() == "s");
		assertTrue("attribute1: value should be \"zwei\", but is " + attribute1.getValue(), attribute1.getValue().equals( "zwei"));
		
		assertTrue("attribute2: wrong parent", attribute2.getParent() == next);
		assertTrue("attribute2: attribute name should be \"i\", but is " + attribute2.getName(), attribute2.getName() == "i");
		assertTrue("attribute2: value should be 2, but is " + attribute2.getValue(), attribute2.getValue().equals( 2));
	}
	
	@Test
	public void testTotalLength()
	{
		SimpleKeyValue skv = new SimpleKeyValue();
		skv.setI(1);
		skv.setS("eins");
		
		SimpleKeyValue skv2 = new SimpleKeyValue();
		skv2.setI(2);
		skv2.setS("zwei");
		skv.setNext(skv2);
		
		SimpleNextParser p = new SimpleNextParser();
		Head o = p.parse(skv);
		
		int totalLength = o.getTotalLength();
		
		assertEquals("not the right number of children returned", 7, totalLength);
	}
	
	@Test
	public void testGetElementByName()
	{
		SimpleKeyValue skv = new SimpleKeyValue();
		skv.setI(1);
		skv.setS("eins");
		
		SimpleParser p = new SimpleParser();
		Head o = p.parse(skv);
		
		Element getElement = o.getElementByName("HEAD.node0");
		assertNotNull("HEAD.node0 should exsit", getElement);
		
		Attribute getAttribute = (Attribute)o.getElementByName("HEAD.node0.attribute0");
		assertEquals("getElementByName gave wrong element", getAttribute, o.getChildren().get(0).getChildren().get(0));
		
		Attribute getAttribute2 = (Attribute)o.getElementByName("HEAD.node0.attribute1");
		assertEquals("getElementByName gave wrong element", getAttribute2, o.getChildren().get(0).getChildren().get(1));
	}
	
	@Test
	public void testSimpleNode()
	{
		SimpleKeyValue skv = new SimpleKeyValue();
		skv.setI(1);
		skv.setS("eins");
		
		SimpleKeyValue skv2 = new SimpleKeyValue();
		skv2.setI(2);
		skv2.setS("zwei");
		skv.setNext(skv2);
		
		SimpleNodeParser parser = new SimpleNodeParser();
		Head head = parser.parse(skv);
		
		Node node2 = (Node)head.getElementByName("HEAD.node0.node0");
		Attribute attrib1 = (Attribute)head.getElementByName("HEAD.node0.node0.attribute0");
		Attribute attrib2 = (Attribute)head.getElementByName("HEAD.node0.node0.attribute1");

		assertNotNull("node2 should exsit", node2);
		assertEquals("wrong node", head.getChildren().get(0).getChildren().get(2), node2);
		assertEquals("attrib1: wrong name", attrib1.getName(), "s");
		assertEquals("attrib1: wrong value", attrib1.getValue(), "zwei");
		assertEquals("attrib2: wrong name", attrib2.getName(), "i");
		assertEquals("attrib2: wrong value", attrib2.getValue(), 2);
		
	}

	@Test
	public void testGetNodeAndAttributeByName()
	{
		SimpleKeyValue skv = new SimpleKeyValue();
		skv.setI(1);
		skv.setS("eins");
		
		SimpleKeyValue skv2 = new SimpleKeyValue();
		skv2.setI(2);
		skv2.setS("zwei");
		skv.setNext(skv2);
		
		SimpleNextParser parser = new SimpleNextParser();
		Head head = parser.parse(skv);
		
		Node node0 = head.getNodeByName("HEAD.node0");
		Node node1 = head.getNodeByName("HEAD.node1");
		Attribute attribute0 = node0.getAttributeByName("node0.attribute0");
		Attribute attribute1 = node0.getAttributeByName("node0.attribute1");
		Attribute attribute2= node1.getAttributeByName("node1.attribute0");
		Attribute attribute3 = node1.getAttributeByName("node1.attribute1");
		
		assertNotNull(attribute0);
		assertNotNull(attribute1);
		assertNotNull(attribute2);
		assertNotNull(attribute3);
		assertEquals(attribute0.getName(), "s");
		assertEquals(attribute0.getValue(), "eins");
		assertEquals(attribute1.getName(), "i");
		assertEquals(attribute1.getValue(), 1);
		assertEquals(attribute2.getName(), "s");
		assertEquals(attribute2.getValue(), "zwei");
		assertEquals(attribute3.getName(), "i");
		assertEquals(attribute3.getValue(), 2);
	}
}
