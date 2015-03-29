package de.wbg.dtdsl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import de.wbg.dtdsl.testhelper.SimpleArrayListKeyValue;

public class TestArrayList {

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
	
}
