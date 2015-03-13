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
	
}
