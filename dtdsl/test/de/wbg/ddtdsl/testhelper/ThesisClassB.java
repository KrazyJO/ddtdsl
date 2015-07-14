package de.wbg.ddtdsl.testhelper;

public class ThesisClassB {

	private int objectNumber;
	private ThesisClassA brother;
	private String xmlStructure;
	
	public ThesisClassB()
	{
		this.objectNumber = 2;
		String xmlVal = 
				"<testKey1>testVal1</testKey1>"+
				"<testKey2>testVal2</testKey2>"+
				"<testKey2>testVal3</testKey2>";
		this.xmlStructure = xmlVal;
		
	}
	
	public int getObjectNumber() {
		return objectNumber;
	}
	
	public void setObjectNumber(int objectNumber) {
		this.objectNumber = objectNumber;
	}
	
	public ThesisClassA getBrother() {
		return brother;
	}
	
	public void setBrother(ThesisClassA brother) {
		this.brother = brother;
	}
	
	public void setXmlStructure(String xmlStructure) {
		this.xmlStructure = xmlStructure;
	}
	
	public String getXmlStructure() {
		return xmlStructure;
	}
}
