package de.wbg.dtdsl;

import static org.junit.Assert.*;

import org.junit.Test;

import de.wbg.dtdsl.testhelper.SimpleKeyValue;

public class TestCircles {

	@Test
	public void testCircle()
	{
		SimpleKeyValue skv0 = new SimpleKeyValue();
		skv0.setI(0);
		skv0.setS("null");
		
		SimpleKeyValue skv1 = new SimpleKeyValue();
		skv1.setI(1);
		skv1.setS("eins");
		
		skv0.setNext(skv1);
		
		SimpleKeyValue skv2 = new SimpleKeyValue();
		skv2.setI(2);
		skv2.setS("zwei");
		
		skv1.setNext(skv2);
		
		//do the circle
		skv2.setNext(skv0);
		
		SimpleCircleParser parser = new SimpleCircleParser();
		Head head = parser.parse(skv0);
		
		assertEquals("not the right size", 10, head.getTotalLength());
		
		Node node0 = head.getNodeByName("HEAD.node0");
		Node node1 = head.getNodeByName("HEAD.node1");
		Node node2 = head.getNodeByName("HEAD.node2");
		
		assertTrue("node0 shouldnt have transition previous", node0.getPrevious() == null);
		assertEquals("node0 should have transition next to node1", node1, node0.getNext());
		assertEquals("node1 should have transition previous to node0", node0, node1.getPrevious());
		assertEquals("node1 should have transition next to node2", node2, node1.getNext());
		assertEquals("node2 should have transition previous to node1", node1, node2.getPrevious());
		assertEquals("node1 should have transition next to node2", node2, node1.getNext());
		assertTrue("node2 shouldnt have transition next", node2.getNext() == null);
	}
	
}
