package de.wbg.dtdsl;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;

import org.junit.Test;



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
		assertTrue("childOfChildOfO: should be \"value\", but is ", attrib1.getType().equals("value"));
		assertTrue("childOfChildOfO: value should be \"1\", but is " + attrib1.getValue(), attrib1.getValue().equals( "1"));
		
		assertTrue("childOfChildOfO: wrong parent", attrib0.getParent() == childOfO);
		assertTrue("childOfChildOfO: attribute name should be \"i\", but is " + attrib0.getName(), attrib0.getName() == "s");
		assertTrue("childOfChildOfO: should be \"value\", but is ", attrib0.getType().equals("value"));
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
		assertTrue("attribute2: value should be \"2\", but is " + attribute2.getValue(), attribute2.getValue().equals( "1"));
		
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
		assertTrue("attribute2: value should be \"2\", but is " + attribute2.getValue(), attribute2.getValue().equals( "2"));
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
		assertEquals("attrib2: wrong value", attrib2.getValue(), "2");
		
	}
	
	@Test
	public void testSimpleMaybe()
	{
		SimpleMaybeAttributeParser parser = new SimpleMaybeAttributeParser();
		SimpleKeyValue skv = new SimpleKeyValue();
		skv.setI(1);
		skv.setS("eins");
		
		SimpleKeyValue skv2 = new SimpleKeyValue();
		skv2.setI(2);
		skv2.setS("zwei");
		skv.setNext(skv2);
		
		Head o = parser.parse(skv);
		Node childOfO = (Node)o.getChildren().get(0); //key
		Attribute attrib1 = (Attribute)childOfO.getChildren().get(1); //value
		Attribute attrib0 = (Attribute)childOfO.getChildren().get(0); //value
		
		assertTrue("head should have 1 child, but has: " + o.getChildren().size(), o.getChildren().size() == 1);
		assertTrue("child of o: wrong parent", ((Head)childOfO.getParent()) == o);
		assertEquals("child of o: wrong number of children", 2, childOfO.size());
		
		assertTrue("childOfChildOfO: wrong parent", attrib1.getParent() == childOfO);
		assertTrue("childOfChildOfO: attribute name should be \"i\", but is " + attrib1.getName(), attrib1.getName() == "i");
		assertTrue("childOfChildOfO: should be \"value\", but is ", attrib1.getType().equals("value"));
		assertTrue("childOfChildOfO: value should be \"1\", but is " + attrib1.getValue(), attrib1.getValue().equals( "1"));
		
		assertTrue("childOfChildOfO: wrong parent", attrib0.getParent() == childOfO);
		assertTrue("childOfChildOfO: attribute name should be \"i\", but is " + attrib0.getName(), attrib0.getName() == "s");
		assertTrue("childOfChildOfO: should be \"value\", but is ", attrib0.getType().equals("value"));
		assertTrue("childOfChildOfO: value should be \"1\", but is " + attrib0.getValue(), attrib0.getValue().equals( "eins"));
	}
	
	@Test
	public void testSimpleMaybeNext()
	{
		SimpleKeyValue skv = new SimpleKeyValue();
		skv.setI(1);
		skv.setS("eins");
		
		SimpleKeyValue skv2 = new SimpleKeyValue();
		skv2.setI(2);
		skv2.setS("zwei");
		skv.setNext(skv2);
		
		SimpleMaybeNextParser p = new SimpleMaybeNextParser();
		Head o = p.parse(skv);
		
		Node next = (Node)o.getChildren().get(0);
		Attribute attribute1 = (Attribute)next.getChildren().get(0);
		Attribute attribute2 = (Attribute)next.getChildren().get(1);
		
		assertEquals("head has wrong number of children: ", 2, o.getChildren().size());
		assertEquals("next should have 2 attributes", 2, next.size());
		assertEquals("next: wrong parent", next.getParent(), o);
		
		assertEquals("attribute1: wrong parent", attribute1.getParent(), next);
		assertEquals("attribute1: attribute name should be \"s\"", attribute1.getName(), "s");
		assertEquals("attribute1: value should be \"eins\", but is " + attribute1.getValue(), attribute1.getValue(), "eins");
		
		assertEquals("attribute2: wrong parent", attribute2.getParent(), next);
		assertEquals("attribute2: attribute name should be \"i\"", attribute2.getName(), "i");
		assertEquals("attribute2: value should be \"2\", but is " + attribute2.getValue(), attribute2.getValue(), "1");
		
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
		assertTrue("attribute2: value should be \"2\", but is " + attribute2.getValue(), attribute2.getValue().equals( "2"));
		
		skv.setNext(null);
		Head o2 = p.parse(skv);
		
		assertEquals("Head should have 1 child", 1, o2.size()); //node => attrib1 attrib2
		Node node1 = (Node)o.getElementByName("HEAD.node0");
		assertEquals("wrong number of chrildren", 2, node1.size());
	}
	
	@Test
	public void testSimpleMaybeNode()
	{
		SimpleKeyValue skv = new SimpleKeyValue();
		skv.setI(1);
		skv.setS("eins");
		
		SimpleKeyValue skv2 = new SimpleKeyValue();
		skv2.setI(2);
		skv2.setS("zwei");
		skv.setNext(skv2);
		
		SimpleMaybeNode parser = new SimpleMaybeNode();
		Head head = parser.parse(skv);
		
		Node headNode = (Node)head.getElementByName("HEAD.node0");
		Attribute headNodeAttrib1 = (Attribute) headNode.getElementByName("node0.attribute0");
		Attribute headNodeAttrib2 = (Attribute) headNode.getElementByName("node0.attribute1");
		Node headNodeNode = (Node) headNode.getElementByName("node0.node0");
		Attribute headNodeNodeAttrib1 = (Attribute) headNodeNode.getElementByName("node0.attribute0");
		Attribute headNodeNodeAttrib2 = (Attribute) headNodeNode.getElementByName("node0.attribute1");
		
		assertNotNull(headNode);
		assertNotNull(headNodeAttrib1);
		assertNotNull(headNodeAttrib2);
		assertNotNull(headNodeNode);
		assertNotNull(headNodeNodeAttrib1);
		assertNotNull(headNodeNodeAttrib2);
		assertEquals("wrong attrib", "i", headNodeNodeAttrib1.getName());
		assertEquals("wrong attrib", "2", headNodeNodeAttrib1.getValue());
		assertEquals("wrong attrib", "s", headNodeNodeAttrib2.getName());
		assertEquals("wrong attrib", "zwei", headNodeNodeAttrib2.getValue());
		
		skv.setNext(null);
		head = parser.parse(skv);
		
		headNode = head.getNodeByName("HEAD.node0");
		headNodeNode = head.getNodeByName("HEAD.node0.node0");
		assertNotNull(headNode);
		assertNull(headNodeNode);
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
		assertEquals(attribute1.getValue(), "1");
		assertEquals(attribute2.getName(), "s");
		assertEquals(attribute2.getValue(), "zwei");
		assertEquals(attribute3.getName(), "i");
		assertEquals(attribute3.getValue(), "2");
	}
	
	@Test
	public void testSimpleArrayNext()
	{
		SimpleArray array = new SimpleArray();
		SimpleArrayParser parser = new SimpleArrayParser();
		
		Head head = parser.parse(array);
		
		//all nodes should be hanging on head-node
		Node node0 = head.getNodeByName("HEAD.node0");
		Node node1 = head.getNodeByName("HEAD.node1");
		Node node2 = head.getNodeByName("HEAD.node2");
		Node node3 = head.getNodeByName("HEAD.node3");
		
		assertNotNull(node0);
		assertNotNull(node1);
		assertNotNull(node2);
		assertNotNull(node3);
		
		Attribute attribute0 = node0.getAttributeByName("node0.attribute0");
		Attribute attribute1 = node0.getAttributeByName("node0.attribute1");
		Attribute attribute2 = node1.getAttributeByName("node1.attribute0");
		Attribute attribute3 = node1.getAttributeByName("node1.attribute1");
		Attribute attribute4 = node2.getAttributeByName("node2.attribute0");
		Attribute attribute5 = node2.getAttributeByName("node2.attribute1");
		Attribute attribute6 = node3.getAttributeByName("node3.attribute0");
		Attribute attribute7 = node3.getAttributeByName("node3.attribute1");
		
		assertNotNull(attribute0);
		assertEquals("wrong attribute", "i", attribute0.getName());
		assertEquals("wrong attribute", "0", attribute0.getValue());
		assertNotNull(attribute1);
		assertEquals("wrong attribute", "s", attribute1.getName());
		assertEquals("wrong attribute", "null", attribute1.getValue());
		assertNotNull(attribute2);
		assertEquals("wrong attribute", "i", attribute2.getName());
		assertEquals("wrong attribute", "1", attribute2.getValue());
		assertNotNull(attribute3);
		assertEquals("wrong attribute", "s", attribute3.getName());
		assertEquals("wrong attribute", "eins", attribute3.getValue());
		assertNotNull(attribute4);
		assertEquals("wrong attribute", "i", attribute4.getName());
		assertEquals("wrong attribute", "2", attribute4.getValue());
		assertNotNull(attribute5);
		assertEquals("wrong attribute", "s", attribute5.getName());
		assertEquals("wrong attribute", "zwei", attribute5.getValue());
		assertNotNull(attribute6);
		assertEquals("wrong attribute", "i", attribute6.getName());
		assertEquals("wrong attribute", "3", attribute6.getValue());
		assertNotNull(attribute7);
		assertEquals("wrong attribute", "s", attribute7.getName());
		assertEquals("wrong attribute", "drei", attribute7.getValue());
	}
	
	@Test
	public void testSimpleArrayListNext()
	{
		SimpleArrayListKeyValue array = new SimpleArrayListKeyValue();
		SimpleArrayParser parser = new SimpleArrayParser();
		
		Head head = parser.parse(array);
		
		//all nodes should be hanging on head-node
		Node node0 = head.getNodeByName("HEAD.node0");
		Node node1 = head.getNodeByName("HEAD.node1");
		Node node2 = head.getNodeByName("HEAD.node2");
		Node node3 = head.getNodeByName("HEAD.node3");
		
		assertNotNull(node0);
		assertNotNull(node1);
		assertNotNull(node2);
		assertNotNull(node3);
		
		Attribute attribute0 = node0.getAttributeByName("node0.attribute0");
		Attribute attribute1 = node0.getAttributeByName("node0.attribute1");
		Attribute attribute2 = node1.getAttributeByName("node1.attribute0");
		Attribute attribute3 = node1.getAttributeByName("node1.attribute1");
		Attribute attribute4 = node2.getAttributeByName("node2.attribute0");
		Attribute attribute5 = node2.getAttributeByName("node2.attribute1");
		Attribute attribute6 = node3.getAttributeByName("node3.attribute0");
		Attribute attribute7 = node3.getAttributeByName("node3.attribute1");
		
		assertNotNull(attribute0);
		assertEquals("wrong attribute", "i", attribute0.getName());
		assertEquals("wrong attribute", "0", attribute0.getValue());
		assertNotNull(attribute1);
		assertEquals("wrong attribute", "s", attribute1.getName());
		assertEquals("wrong attribute", "null", attribute1.getValue());
		assertNotNull(attribute2);
		assertEquals("wrong attribute", "i", attribute2.getName());
		assertEquals("wrong attribute", "1", attribute2.getValue());
		assertNotNull(attribute3);
		assertEquals("wrong attribute", "s", attribute3.getName());
		assertEquals("wrong attribute", "eins", attribute3.getValue());
		assertNotNull(attribute4);
		assertEquals("wrong attribute", "i", attribute4.getName());
		assertEquals("wrong attribute", "2", attribute4.getValue());
		assertNotNull(attribute5);
		assertEquals("wrong attribute", "s", attribute5.getName());
		assertEquals("wrong attribute", "zwei", attribute5.getValue());
		assertNotNull(attribute6);
		assertEquals("wrong attribute", "i", attribute6.getName());
		assertEquals("wrong attribute", "3", attribute6.getValue());
		assertNotNull(attribute7);
		assertEquals("wrong attribute", "s", attribute7.getName());
		assertEquals("wrong attribute", "drei", attribute7.getValue());
	}
	
	@Test
	public void testSimpleLinkedListNext()
	{
		SimpleLinkedList array = new SimpleLinkedList();
		SimpleArrayParser parser = new SimpleArrayParser();
		
		Head head = parser.parse(array);
		
		//all nodes should be hanging on head-node
		Node node0 = head.getNodeByName("HEAD.node0");
		Node node1 = head.getNodeByName("HEAD.node1");
		Node node2 = head.getNodeByName("HEAD.node2");
		Node node3 = head.getNodeByName("HEAD.node3");
		
		assertNotNull(node0);
		assertNotNull(node1);
		assertNotNull(node2);
		assertNotNull(node3);
		
		Attribute attribute0 = node0.getAttributeByName("node0.attribute0");
		Attribute attribute1 = node0.getAttributeByName("node0.attribute1");
		Attribute attribute2 = node1.getAttributeByName("node1.attribute0");
		Attribute attribute3 = node1.getAttributeByName("node1.attribute1");
		Attribute attribute4 = node2.getAttributeByName("node2.attribute0");
		Attribute attribute5 = node2.getAttributeByName("node2.attribute1");
		Attribute attribute6 = node3.getAttributeByName("node3.attribute0");
		Attribute attribute7 = node3.getAttributeByName("node3.attribute1");
		
		assertNotNull(attribute0);
		assertEquals("wrong attribute", "i", attribute0.getName());
		assertEquals("wrong attribute", "0", attribute0.getValue());
		assertNotNull(attribute1);
		assertEquals("wrong attribute", "s", attribute1.getName());
		assertEquals("wrong attribute", "null", attribute1.getValue());
		assertNotNull(attribute2);
		assertEquals("wrong attribute", "i", attribute2.getName());
		assertEquals("wrong attribute", "1", attribute2.getValue());
		assertNotNull(attribute3);
		assertEquals("wrong attribute", "s", attribute3.getName());
		assertEquals("wrong attribute", "eins", attribute3.getValue());
		assertNotNull(attribute4);
		assertEquals("wrong attribute", "i", attribute4.getName());
		assertEquals("wrong attribute", "2", attribute4.getValue());
		assertNotNull(attribute5);
		assertEquals("wrong attribute", "s", attribute5.getName());
		assertEquals("wrong attribute", "zwei", attribute5.getValue());
		assertNotNull(attribute6);
		assertEquals("wrong attribute", "i", attribute6.getName());
		assertEquals("wrong attribute", "3", attribute6.getValue());
		assertNotNull(attribute7);
		assertEquals("wrong attribute", "s", attribute7.getName());
		assertEquals("wrong attribute", "drei", attribute7.getValue());
	}
	
	@Test
	public void testSimpleArrayNode()
	{
		SimpleArray array = new SimpleArray();
		SimpleArrayNodeParser parser = new SimpleArrayNodeParser();
		
		Head head = parser.parse(array);
		
		//all nodes should be hanging on head-node
		Node node0 = head.getNodeByName("HEAD.node0.node0");
		Node node1 = head.getNodeByName("HEAD.node0.node1");
		Node node2 = head.getNodeByName("HEAD.node0.node2");
		Node node3 = head.getNodeByName("HEAD.node0.node3");
		
		assertNotNull(node0);
		assertNotNull(node1);
		assertNotNull(node2);
		assertNotNull(node3);
		
		Attribute attribute0 = node0.getAttributeByName("node0.attribute0");
		Attribute attribute1 = node0.getAttributeByName("node0.attribute1");
		Attribute attribute2 = node1.getAttributeByName("node1.attribute0");
		Attribute attribute3 = node1.getAttributeByName("node1.attribute1");
		Attribute attribute4 = node2.getAttributeByName("node2.attribute0");
		Attribute attribute5 = node2.getAttributeByName("node2.attribute1");
		Attribute attribute6 = node3.getAttributeByName("node3.attribute0");
		Attribute attribute7 = node3.getAttributeByName("node3.attribute1");
		
		assertNotNull(attribute0);
		assertEquals("wrong attribute", "i", attribute0.getName());
		assertEquals("wrong attribute", "0", attribute0.getValue());
		assertNotNull(attribute1);
		assertEquals("wrong attribute", "s", attribute1.getName());
		assertEquals("wrong attribute", "null", attribute1.getValue());
		assertNotNull(attribute2);
		assertEquals("wrong attribute", "i", attribute2.getName());
		assertEquals("wrong attribute", "1", attribute2.getValue());
		assertNotNull(attribute3);
		assertEquals("wrong attribute", "s", attribute3.getName());
		assertEquals("wrong attribute", "eins", attribute3.getValue());
		assertNotNull(attribute4);
		assertEquals("wrong attribute", "i", attribute4.getName());
		assertEquals("wrong attribute", "2", attribute4.getValue());
		assertNotNull(attribute5);
		assertEquals("wrong attribute", "s", attribute5.getName());
		assertEquals("wrong attribute", "zwei", attribute5.getValue());
		assertNotNull(attribute6);
		assertEquals("wrong attribute", "i", attribute6.getName());
		assertEquals("wrong attribute", "3", attribute6.getValue());
		assertNotNull(attribute7);
		assertEquals("wrong attribute", "s", attribute7.getName());
		assertEquals("wrong attribute", "drei", attribute7.getValue());
	}
	
	@Test
	public void testSimpleArrayListNode()
	{
		SimpleArrayListKeyValue array = new SimpleArrayListKeyValue();
		SimpleArrayNodeParser parser = new SimpleArrayNodeParser();
		
		Head head = parser.parse(array);
		
		//all nodes should be hanging on head-node
		Node node0 = head.getNodeByName("HEAD.node0.node0");
		Node node1 = head.getNodeByName("HEAD.node0.node1");
		Node node2 = head.getNodeByName("HEAD.node0.node2");
		Node node3 = head.getNodeByName("HEAD.node0.node3");
		
		assertNotNull(node0);
		assertNotNull(node1);
		assertNotNull(node2);
		assertNotNull(node3);
		
		Attribute attribute0 = node0.getAttributeByName("node0.attribute0");
		Attribute attribute1 = node0.getAttributeByName("node0.attribute1");
		Attribute attribute2 = node1.getAttributeByName("node1.attribute0");
		Attribute attribute3 = node1.getAttributeByName("node1.attribute1");
		Attribute attribute4 = node2.getAttributeByName("node2.attribute0");
		Attribute attribute5 = node2.getAttributeByName("node2.attribute1");
		Attribute attribute6 = node3.getAttributeByName("node3.attribute0");
		Attribute attribute7 = node3.getAttributeByName("node3.attribute1");
		
		assertNotNull(attribute0);
		assertEquals("wrong attribute", "i", attribute0.getName());
		assertEquals("wrong attribute", "0", attribute0.getValue());
		assertNotNull(attribute1);
		assertEquals("wrong attribute", "s", attribute1.getName());
		assertEquals("wrong attribute", "null", attribute1.getValue());
		assertNotNull(attribute2);
		assertEquals("wrong attribute", "i", attribute2.getName());
		assertEquals("wrong attribute", "1", attribute2.getValue());
		assertNotNull(attribute3);
		assertEquals("wrong attribute", "s", attribute3.getName());
		assertEquals("wrong attribute", "eins", attribute3.getValue());
		assertNotNull(attribute4);
		assertEquals("wrong attribute", "i", attribute4.getName());
		assertEquals("wrong attribute", "2", attribute4.getValue());
		assertNotNull(attribute5);
		assertEquals("wrong attribute", "s", attribute5.getName());
		assertEquals("wrong attribute", "zwei", attribute5.getValue());
		assertNotNull(attribute6);
		assertEquals("wrong attribute", "i", attribute6.getName());
		assertEquals("wrong attribute", "3", attribute6.getValue());
		assertNotNull(attribute7);
		assertEquals("wrong attribute", "s", attribute7.getName());
		assertEquals("wrong attribute", "drei", attribute7.getValue());
	}
	
	@Test
	public void testSimpleLinkedListNode()
	{
		SimpleLinkedList array = new SimpleLinkedList();
		SimpleArrayNodeParser parser = new SimpleArrayNodeParser();
		
		Head head = parser.parse(array);
		
		//all nodes should be hanging on head-node
		Node node0 = head.getNodeByName("HEAD.node0.node0");
		Node node1 = head.getNodeByName("HEAD.node0.node1");
		Node node2 = head.getNodeByName("HEAD.node0.node2");
		Node node3 = head.getNodeByName("HEAD.node0.node3");
		
		assertNotNull(node0);
		assertNotNull(node1);
		assertNotNull(node2);
		assertNotNull(node3);
		
		Attribute attribute0 = node0.getAttributeByName("node0.attribute0");
		Attribute attribute1 = node0.getAttributeByName("node0.attribute1");
		Attribute attribute2 = node1.getAttributeByName("node1.attribute0");
		Attribute attribute3 = node1.getAttributeByName("node1.attribute1");
		Attribute attribute4 = node2.getAttributeByName("node2.attribute0");
		Attribute attribute5 = node2.getAttributeByName("node2.attribute1");
		Attribute attribute6 = node3.getAttributeByName("node3.attribute0");
		Attribute attribute7 = node3.getAttributeByName("node3.attribute1");
		
		assertNotNull(attribute0);
		assertEquals("wrong attribute", "i", attribute0.getName());
		assertEquals("wrong attribute", "0", attribute0.getValue());
		assertNotNull(attribute1);
		assertEquals("wrong attribute", "s", attribute1.getName());
		assertEquals("wrong attribute", "null", attribute1.getValue());
		assertNotNull(attribute2);
		assertEquals("wrong attribute", "i", attribute2.getName());
		assertEquals("wrong attribute", "1", attribute2.getValue());
		assertNotNull(attribute3);
		assertEquals("wrong attribute", "s", attribute3.getName());
		assertEquals("wrong attribute", "eins", attribute3.getValue());
		assertNotNull(attribute4);
		assertEquals("wrong attribute", "i", attribute4.getName());
		assertEquals("wrong attribute", "2", attribute4.getValue());
		assertNotNull(attribute5);
		assertEquals("wrong attribute", "s", attribute5.getName());
		assertEquals("wrong attribute", "zwei", attribute5.getValue());
		assertNotNull(attribute6);
		assertEquals("wrong attribute", "i", attribute6.getName());
		assertEquals("wrong attribute", "3", attribute6.getValue());
		assertNotNull(attribute7);
		assertEquals("wrong attribute", "s", attribute7.getName());
		assertEquals("wrong attribute", "drei", attribute7.getValue());
	}
	
	@Test
	public void testSimpleManyArrayAttribute()
	{
		SimpleArrayAttributeI array = new SimpleArrayAttributeI();
		
		SimpleManyAttributeParser parser = new SimpleManyAttributeParser();
		Head head = parser.parse(array);
		
		Node node0 = head.getNodeByName("HEAD.node0");
		Attribute attrib0 = node0.getAttributeByName("node0.attribute0");
		Attribute attrib1 = node0.getAttributeByName("node0.attribute1");
		Attribute attrib2 = node0.getAttributeByName("node0.attribute2");
		Attribute attrib3 = node0.getAttributeByName("node0.attribute3");
		
		assertNotNull(node0);
		assertNotNull(attrib0);
		assertNotNull(attrib1);
		assertNotNull(attrib2);
		assertNotNull(attrib3);
		
		assertEquals("wrong attribute name", "array", attrib0.getName());
		assertEquals("wrong attribute value", "0", attrib0.getValue());
		assertEquals("wrong attribute name", "array", attrib1.getName());
		assertEquals("wrong attribute value", "1", attrib1.getValue());
		assertEquals("wrong attribute name", "array", attrib2.getName());
		assertEquals("wrong attribute value", "2", attrib2.getValue());
		assertEquals("wrong attribute name", "array", attrib3.getName());
		assertEquals("wrong attribute value", "3", attrib3.getValue());
	}
	
	@Test
	public void testSimpleManyArrayListAttribute()
	{
		SimpleArrayListAttributeI array = new SimpleArrayListAttributeI();
		
		SimpleManyAttributeParser parser = new SimpleManyAttributeParser();
		Head head = parser.parse(array);
		
		Node node0 = head.getNodeByName("HEAD.node0");
		Attribute attrib0 = node0.getAttributeByName("node0.attribute0");
		Attribute attrib1 = node0.getAttributeByName("node0.attribute1");
		Attribute attrib2 = node0.getAttributeByName("node0.attribute2");
		Attribute attrib3 = node0.getAttributeByName("node0.attribute3");
		
		assertNotNull(node0);
		assertNotNull(attrib0);
		assertNotNull(attrib1);
		assertNotNull(attrib2);
		assertNotNull(attrib3);
		
		assertEquals("wrong number of attributes", 4, node0.size());
		
		assertEquals("wrong attribute name", "array", attrib0.getName());
		assertEquals("wrong attribute value", "0", attrib0.getValue());
		assertEquals("wrong attribute name", "array", attrib1.getName());
		assertEquals("wrong attribute value", "1", attrib1.getValue());
		assertEquals("wrong attribute name", "array", attrib2.getName());
		assertEquals("wrong attribute value", "2", attrib2.getValue());
		assertEquals("wrong attribute name", "array", attrib3.getName());
		assertEquals("wrong attribute value", "3", attrib3.getValue());
	}
	
	@Test
	public void testSimpleManyLinkedListAttribute()
	{
		SimpleLinkedListAttributeI array = new SimpleLinkedListAttributeI();
		
		SimpleManyAttributeParser parser = new SimpleManyAttributeParser();
		Head head = parser.parse(array);
		
		Node node0 = head.getNodeByName("HEAD.node0");
		Attribute attrib0 = node0.getAttributeByName("node0.attribute0");
		Attribute attrib1 = node0.getAttributeByName("node0.attribute1");
		Attribute attrib2 = node0.getAttributeByName("node0.attribute2");
		Attribute attrib3 = node0.getAttributeByName("node0.attribute3");
		
		assertNotNull(node0);
		assertNotNull(attrib0);
		assertNotNull(attrib1);
		assertNotNull(attrib2);
		assertNotNull(attrib3);
		
		assertEquals("wrong attribute name", "array", attrib0.getName());
		assertEquals("wrong attribute value", "0", attrib0.getValue());
		assertEquals("wrong attribute name", "array", attrib1.getName());
		assertEquals("wrong attribute value", "1", attrib1.getValue());
		assertEquals("wrong attribute name", "array", attrib2.getName());
		assertEquals("wrong attribute value", "2", attrib2.getValue());
		assertEquals("wrong attribute name", "array", attrib3.getName());
		assertEquals("wrong attribute value", "3", attrib3.getValue());
	}
	
	@Test
	public void testSimpleHashMap()
	{
		SimpleHashMap hashMap = new SimpleHashMap();
		SimpleHashMapParser parser = new SimpleHashMapParser();
		
		Head head = parser.parse(hashMap);
		Node node0 = head.getNodeByName("HEAD.node0"); //Kopf der HashMap
		assertNotNull(node0);
		
		Node entry0 = node0.getNodeByName("node0.node0");
		Node entry1 = node0.getNodeByName("node0.node1");
		Node entry2 = node0.getNodeByName("node0.node2");
		Node entry3 = node0.getNodeByName("node0.node3");
		
		assertNotNull(entry0);
		assertTrue("expected node is key", entry0.isKey());
		assertEquals("expected other key", "null", entry0.getValue());
		assertNotNull(entry1);
		assertTrue("expected node is key", entry1.isKey());
		assertEquals("expected other key", "eins", entry1.getValue());
		assertNotNull(entry2);
		assertTrue("expected node is key", entry2.isKey());
		assertEquals("expected other key", "zwei", entry2.getValue());
		assertNotNull(entry3);
		assertTrue("expected node is key", entry3.isKey());
		assertEquals("expected other key", "drei", entry3.getValue());
		
		Attribute value0 = entry0.getAttributeByName("node0.attribute0");
		Attribute value1 = entry1.getAttributeByName("node1.attribute0");
		Attribute value2 = entry2.getAttributeByName("node2.attribute0");
		Attribute value3 = entry3.getAttributeByName("node3.attribute0");
		
		assertNotNull(value0);
		assertEquals("exprected other value name", "value", value0.getName());
		assertEquals("expected other value", "0", value0.getValue());
		assertNotNull(value1);
		assertEquals("exprected other value name", "value", value1.getName());
		assertEquals("expected other value", "1", value1.getValue());
		assertNotNull(value2);
		assertEquals("exprected other value name", "value", value2.getName());
		assertEquals("expected other value", "2", value2.getValue());
		assertNotNull(value3);
		assertEquals("exprected other value name", "value", value3.getName());
		assertEquals("expected other value", "3", value3.getValue());
	}
}
