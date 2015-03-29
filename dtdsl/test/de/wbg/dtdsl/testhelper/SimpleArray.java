package de.wbg.dtdsl.testhelper;

public class SimpleArray {
	
	private SimpleKeyValue[] children;
	
	public SimpleArray() {
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
		
		this.children = new SimpleKeyValue[4];
		this.children[0] = skv0;
		this.children[1] = skv1;
		this.children[2] = skv2;
		this.children[3] = skv3;
	}
}
