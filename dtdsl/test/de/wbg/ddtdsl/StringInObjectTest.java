package de.wbg.ddtdsl;

import org.junit.Assert;
import org.junit.Test;

import de.wbg.ddtdsl.testhelper.SimpleObject;
import de.wbg.ddtdsl.Attribute;
import de.wbg.ddtdsl.Head;
import de.wbg.ddtdsl.Node;

public class StringInObjectTest {

	
	@Test
	public void testStringInObject()
	{
		SimpleObject o = new SimpleObject();
		
		SimpleObjectIntoStringParser parser = new SimpleObjectIntoStringParser();
		Head head = parser.parse(o);
		
		Node node = head.getNodeByName("HEAD.node0");
		Attribute attrib = node.getAttributeByName("node0.attribute0");
		Node stringNode = attrib.getNodeByName("attribute0.node0"); //String - key
		Attribute stringAttrib = stringNode.getAttributeByName("node0.attribute0"); //String - value
		
		Assert.assertEquals("wrong attribute", "stringToTest", attrib.getName());
		Assert.assertEquals("wrong string key", "thisIsTheKey", stringNode.getValue());
		Assert.assertEquals("wrong string value", "thisIsTheValue", stringAttrib.getValue());
	}
}
