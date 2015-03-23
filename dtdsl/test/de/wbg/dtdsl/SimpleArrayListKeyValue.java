package de.wbg.dtdsl;

import java.util.ArrayList;

public class SimpleArrayListKeyValue {

	private ArrayList<SimpleKeyValue> children;
	
	public SimpleArrayListKeyValue()
	{
		SimpleKeyValue skv0 = new SimpleKeyValue();
		skv0.setI(0);
		skv0.setS("null");

		SimpleKeyValue skv1 = new SimpleKeyValue();
		skv1.setI(1);
		skv1.setS("eins");
		
		SimpleKeyValue skv2 = new SimpleKeyValue();
		skv2.setI(2);
		skv2.setS("zwei");
		
		SimpleKeyValue skv3 = new SimpleKeyValue();
		skv3.setI(3);
		skv3.setS("drei");
		
		this.children = new ArrayList<>();
		this.children.add(skv0);
		this.children.add(skv1);
		this.children.add(skv2);
		this.children.add(skv3);
	}
	
	public ArrayList<SimpleKeyValue> getChildren() {
		return children;
	}
}
