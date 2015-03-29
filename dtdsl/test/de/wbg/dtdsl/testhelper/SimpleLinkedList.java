package de.wbg.dtdsl.testhelper;

import java.util.LinkedList;

public class SimpleLinkedList {

	private LinkedList<SimpleKeyValue> children;
	
	public SimpleLinkedList() 
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
		
		this.children = new LinkedList<>();
		this.children.add(skv0);
		this.children.add(skv1);
		this.children.add(skv2);
		this.children.add(skv3);
	}
}
