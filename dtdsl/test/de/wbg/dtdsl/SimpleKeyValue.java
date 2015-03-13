package de.wbg.dtdsl;

public class SimpleKeyValue {

	private String s;
	private int i;
	
	public SimpleKeyValue next;
	
	public void setI(int i) {
		this.i = i;
	}
	
	public int getI() {
		return i;
	}
	
	public void setS(String s) {
		this.s = s;
	}
	
	public String getS() {
		return s;
	}
	
	public SimpleKeyValue getNext() {
		return next;
	}
	
	public void setNext(SimpleKeyValue next) {
		this.next = next;
	}
}
