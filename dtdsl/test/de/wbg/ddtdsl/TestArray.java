package de.wbg.ddtdsl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.wbg.ddtdsl.testhelper.SimpleArray;
import de.wbg.ddtdsl.Attribute;
import de.wbg.ddtdsl.Head;
import de.wbg.ddtdsl.Node;

public class TestArray {

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
		assertTrue("node0 shouldnt have transition previous", node0.getPrevious() == null);
		assertNotNull(node1);
		assertEquals("node0 should have transition next to node1", node1, node0.getNext());
		assertEquals("node1 should have transition previous to node0", node0, node1.getPrevious());
		assertNotNull(node2);
		assertEquals("node1 should have transition next to node2", node2, node1.getNext());
		assertEquals("node2 should have transition previous to node1", node1, node2.getPrevious());
		assertNotNull(node3);
		assertEquals("node2 should have transition next to node3", node3, node2.getNext());
		assertEquals("node3 should have transition previous to node2", node2, node3.getPrevious());
		assertTrue("node3 shouldnt have transition next", node3.getNext() == null);
		
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
		assertEquals("wrong attribute", 0, attribute0.getValue());
		assertNotNull(attribute1);
		assertEquals("wrong attribute", "s", attribute1.getName());
		assertEquals("wrong attribute", "null", attribute1.getValue());
		assertNotNull(attribute2);
		assertEquals("wrong attribute", "i", attribute2.getName());
		assertEquals("wrong attribute", 1, attribute2.getValue());
		assertNotNull(attribute3);
		assertEquals("wrong attribute", "s", attribute3.getName());
		assertEquals("wrong attribute", "eins", attribute3.getValue());
		assertNotNull(attribute4);
		assertEquals("wrong attribute", "i", attribute4.getName());
		assertEquals("wrong attribute", 2, attribute4.getValue());
		assertNotNull(attribute5);
		assertEquals("wrong attribute", "s", attribute5.getName());
		assertEquals("wrong attribute", "zwei", attribute5.getValue());
		assertNotNull(attribute6);
		assertEquals("wrong attribute", "i", attribute6.getName());
		assertEquals("wrong attribute", 3, attribute6.getValue());
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
		assertEquals("wrong attribute", 0, attribute0.getValue());
		assertNotNull(attribute1);
		assertEquals("wrong attribute", "s", attribute1.getName());
		assertEquals("wrong attribute", "null", attribute1.getValue());
		assertNotNull(attribute2);
		assertEquals("wrong attribute", "i", attribute2.getName());
		assertEquals("wrong attribute", 1, attribute2.getValue());
		assertNotNull(attribute3);
		assertEquals("wrong attribute", "s", attribute3.getName());
		assertEquals("wrong attribute", "eins", attribute3.getValue());
		assertNotNull(attribute4);
		assertEquals("wrong attribute", "i", attribute4.getName());
		assertEquals("wrong attribute", 2, attribute4.getValue());
		assertNotNull(attribute5);
		assertEquals("wrong attribute", "s", attribute5.getName());
		assertEquals("wrong attribute", "zwei", attribute5.getValue());
		assertNotNull(attribute6);
		assertEquals("wrong attribute", "i", attribute6.getName());
		assertEquals("wrong attribute", 3, attribute6.getValue());
		assertNotNull(attribute7);
		assertEquals("wrong attribute", "s", attribute7.getName());
		assertEquals("wrong attribute", "drei", attribute7.getValue());
	}
	
}
