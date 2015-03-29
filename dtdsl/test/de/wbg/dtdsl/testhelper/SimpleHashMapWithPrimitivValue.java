package de.wbg.dtdsl.testhelper;

import java.util.HashMap;

public class SimpleHashMapWithPrimitivValue {

	private HashMap<String, Integer> children;
	
	public SimpleHashMapWithPrimitivValue() 
	{
		this.children = new HashMap<>();
		this.children.put("null", 0);
		this.children.put("eins", 1);
		this.children.put("zwei", 2);
		this.children.put("drei", 3);
	}
	
}
