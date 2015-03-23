package de.wbg.dtdsl;

import java.util.HashMap;

public class SimpleHashMap {
	
	HashMap<String, SimpleValue> children;
	
	public SimpleHashMap()
	{
		SimpleValue val0 = new SimpleValue();
		val0.setValue(0);
		
		SimpleValue val1 = new SimpleValue();
		val0.setValue(1);
		
		SimpleValue val2 = new SimpleValue();
		val0.setValue(2);
		
		SimpleValue val3 = new SimpleValue();
		val0.setValue(3);
		
		this.children = new HashMap<>();
		this.children.put("null", val0);
		this.children.put("eins", val1);
		this.children.put("zwei", val2);
		this.children.put("drei", val3);
	}
	
	
	
}
