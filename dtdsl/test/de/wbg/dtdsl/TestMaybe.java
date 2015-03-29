package de.wbg.dtdsl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.wbg.dtdsl.testhelper.SimpleKeyValue;

public class TestMaybe {

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
//		assertTrue("childOfChildOfO: should be \"value\", but is " + attrib1.getType(), attrib1.getType().equals("value"));
		assertEquals(attrib1.getType(), new Integer(1).getClass());
		assertTrue("childOfChildOfO: value should be \"1\", but is " + attrib1.getValue(), attrib1.getValue().equals( 1));
		
		assertTrue("childOfChildOfO: wrong parent", attrib0.getParent() == childOfO);
		assertTrue("childOfChildOfO: attribute name should be \"i\", but is " + attrib0.getName(), attrib0.getName() == "s");
//		assertTrue("childOfChildOfO: should be \"value\", but is ", attrib0.getType().equals("value"));
		assertEquals(attrib0.getType(), new String("").getClass());
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
		assertEquals("attribute2: value should be \"2\", but is " + attribute2.getValue(), attribute2.getValue(), 1);
		
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
		assertEquals("wrong attrib", 2, headNodeNodeAttrib1.getValue());
		assertEquals("wrong attrib", "s", headNodeNodeAttrib2.getName());
		assertEquals("wrong attrib", "zwei", headNodeNodeAttrib2.getValue());
		
		skv.setNext(null);
		head = parser.parse(skv);
		
		headNode = head.getNodeByName("HEAD.node0");
		headNodeNode = head.getNodeByName("HEAD.node0.node0");
		assertNotNull(headNode);
		assertNull(headNodeNode);
	}
	
}
