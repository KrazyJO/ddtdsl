package de.wbg.ddtdsl.testhelper;

public class ThesisClassA {

	private ThesisClassB brother;
	private int objectNumber;
	
	public ThesisClassA()
	{
		this.objectNumber = 1;
	}
	
	public ThesisClassB getBrother() {
		return brother;
	}
	
	public void setBrother(ThesisClassB brother) {
		this.brother = brother;
	}
	
	public int getObjectNumber() {
		return objectNumber;
	}
	
	public void setObjectNumber(int objectNumber) {
		this.objectNumber = objectNumber;
	}
}
