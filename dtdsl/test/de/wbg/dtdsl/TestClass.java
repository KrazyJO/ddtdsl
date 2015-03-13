package de.wbg.dtdsl;

import static org.junit.Assert.*;

import org.junit.Test;



public class TestClass {

	@Test
	public void test() {
		SimpleKeyValue skv = new SimpleKeyValue();
		skv.setI(1);
		skv.setS("eins");
		
		ObjectParser p = new ObjectParser();
		Node o = p.parse(skv);
		Node childOfO = o.getChildren().get(0); //key
		Node childOfChildOfO = childOfO.getChildren().get(0); //value
		
		assertTrue("head shouldnt be a key", !o.isKey());
		assertTrue("head should have 1 child, but has: " + o.getChildren().size(), o.getChildren().size() == 1);
		assertTrue("child of o: should be key", childOfO.isKey());
		assertTrue("child of o: attribute name should be \"s\"", childOfO.getName() == "s");
		assertTrue("child of o: wrong parent", childOfO.getParent() == o);
		
		assertTrue("childOfChildOfO: wrong parent", childOfChildOfO.getParent() == childOfO);
		assertTrue("childOfChildOfO: attribute name should be \"i\"", childOfChildOfO.getName() == "i");
		assertTrue("childOfChildOfO: should be value", !childOfChildOfO.isKey());
		assertTrue("childOfChildOfO: value should be \"1\", but is " + childOfChildOfO.getValue(), childOfChildOfO.getValue().equals( "1"));
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
		
		ObjectParser p = new ObjectParser();
		Node o = p.parse(skv);
		
		Node next = o.getChildren().get(1);
		Node childOfNext = next.getChildren().get(0);
		
		assertTrue("head should have 2 children, but has: " + o.getChildren().size(), o.getChildren().size() == 2);
		assertTrue("next: should be key", next.isKey());
		assertTrue("next: attribute name should be \"s\"", next.getName() == "s");
		assertTrue("next: attribute value should be \"zwei\"", next.getValue().equals("zwei"));
		assertTrue("next: wrong parent", next.getParent() == o);
		
		assertTrue("childOfNext: wrong parent", childOfNext.getParent() == next);
		assertTrue("childOfNext: attribute name should be \"i\"", childOfNext.getName() == "i");
		assertTrue("childOfNext: should be value", !childOfNext.isKey());
		assertTrue("childOfNext: value should be \"2\", but is " + childOfNext.getValue(), childOfNext.getValue().equals( "2"));
	}
}
