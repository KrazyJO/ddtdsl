package de.wbg.dtdsl.testhelper;

import java.util.HashMap;

public class SimpleHashMapWithSimpleValue {
	
	HashMap<String, SimpleValue> children;
	
	public SimpleHashMapWithSimpleValue()
	{
		SimpleValue val0 = new SimpleValue();
		val0.setValue(0);
		
		SimpleValue val1 = new SimpleValue();
		val1.setValue(1);
		
		SimpleValue val2 = new SimpleValue();
		val2.setValue(2);
		
		SimpleValue val3 = new SimpleValue();
		val3.setValue(3);
		
		this.children = new HashMap<>();
		this.children.put("null", val0);
		this.children.put("eins", val1);
		this.children.put("zwei", val2);
		this.children.put("drei", val3);
	}
	
	
	
}
