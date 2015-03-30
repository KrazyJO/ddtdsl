package de.wbg.dtdsl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

import de.wbg.dtdsl.testhelper.SimpleHashMapWithPrimitivValue;
import de.wbg.dtdsl.testhelper.SimpleHashMapWithSimpleValue;

public class TestHashMap {

	@Test
	public void testSimpleHashMapNode()
	{
		SimpleHashMapWithSimpleValue hashMap = new SimpleHashMapWithSimpleValue();
		SimpleHashMapNodeParser parser = new SimpleHashMapNodeParser();
		
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
		assertEquals("expected other value", 0, value0.getValue());
		assertNotNull(value1);
		assertEquals("exprected other value name", "value", value1.getName());
		assertEquals("expected other value", 1, value1.getValue());
		assertNotNull(value2);
		assertEquals("exprected other value name", "value", value2.getName());
		assertEquals("expected other value", 2, value2.getValue());
		assertNotNull(value3);
		assertEquals("exprected other value name", "value", value3.getName());
		assertEquals("expected other value", 3, value3.getValue());
	}
	
	@Test
	public void testSimpleHashMapNext()
	{
		SimpleHashMapWithSimpleValue hashMap = new SimpleHashMapWithSimpleValue();
		SimpleHashMapNextParser parser = new SimpleHashMapNextParser();
		
		Head head = parser.parse(hashMap);
//		Node node0 = head.getNodeByName("HEAD.node0"); //Kopf der HashMap
//		assertNotNull(node0);
		
		Node entry0 = head.getNodeByName("HEAD.node0");
		assertTrue("this node has no transition previous", entry0.getPrevious() == null);
		Node entry1 = head.getNodeByName("HEAD.node1");
		assertEquals("transition next should be set", entry1, entry0.getNext());
		assertEquals("transition previous should be set", entry0, entry1.getPrevious());
		Node entry2 = head.getNodeByName("HEAD.node2");
		assertEquals("transition next should be set", entry2, entry1.getNext());
		assertEquals("transition previous should be set", entry1, entry2.getPrevious());
		Node entry3 = head.getNodeByName("HEAD.node3");
		assertEquals("transition next should be set", entry3, entry2.getNext());
		assertEquals("transition previous should be set", entry2, entry3.getPrevious());
		assertTrue("this node shouldnt have a transition next", entry3.getNext() == null);
		
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
		assertEquals("expected other value", 0, value0.getValue());
		assertNotNull(value1);
		assertEquals("exprected other value name", "value", value1.getName());
		assertEquals("expected other value", 1, value1.getValue());
		assertNotNull(value2);
		assertEquals("exprected other value name", "value", value2.getName());
		assertEquals("expected other value", 2, value2.getValue());
		assertNotNull(value3);
		assertEquals("exprected other value name", "value", value3.getName());
		assertEquals("expected other value", 3, value3.getValue());
	}
	
	 @Test
	 public void testJSONSimpleLib()
	 {
		 String jsonString = "{\"key\":\"value\"}";
		 JSONParser parser = new JSONParser();
		 Object parsedObject;
		 try {
			parsedObject = parser.parse(jsonString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	 }
	 
	 @Test
	 public void testSimpleHashMapWithPrimitivValue()
	 {
		 SimpleHashMapWithPrimitivValue hashMap = new SimpleHashMapWithPrimitivValue();
		 JSONSimple parser = new JSONSimple();
		 Head head = parser.parse(hashMap);
	 }
	
}
