package de.wbg.dtdsl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import de.wbg.dtdsl.testhelper.SimpleArrayAttributeI;
import de.wbg.dtdsl.testhelper.SimpleArrayListAttributeI;
import de.wbg.dtdsl.testhelper.SimpleLinkedListAttributeI;

public class TestMany {

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
		assertEquals("wrong attribute value", 0, attrib0.getValue());
		assertEquals("wrong attribute name", "array", attrib1.getName());
		assertEquals("wrong attribute value", 1, attrib1.getValue());
		assertEquals("wrong attribute name", "array", attrib2.getName());
		assertEquals("wrong attribute value", 2, attrib2.getValue());
		assertEquals("wrong attribute name", "array", attrib3.getName());
		assertEquals("wrong attribute value", 3, attrib3.getValue());
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
		assertEquals("wrong attribute value", 0, attrib0.getValue());
		assertEquals("wrong attribute name", "array", attrib1.getName());
		assertEquals("wrong attribute value", 1, attrib1.getValue());
		assertEquals("wrong attribute name", "array", attrib2.getName());
		assertEquals("wrong attribute value", 2, attrib2.getValue());
		assertEquals("wrong attribute name", "array", attrib3.getName());
		assertEquals("wrong attribute value", 3, attrib3.getValue());
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
		assertEquals("wrong attribute value", 0, attrib0.getValue());
		assertEquals("wrong attribute name", "array", attrib1.getName());
		assertEquals("wrong attribute value", 1, attrib1.getValue());
		assertEquals("wrong attribute name", "array", attrib2.getName());
		assertEquals("wrong attribute value", 2, attrib2.getValue());
		assertEquals("wrong attribute name", "array", attrib3.getName());
		assertEquals("wrong attribute value", 3, attrib3.getValue());
	}
	
}
