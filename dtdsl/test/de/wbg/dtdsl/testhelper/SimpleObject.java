package de.wbg.dtdsl.testhelper;

public class SimpleObject {

	private String stringToTest;
	
	public SimpleObject()
	{
		this.stringToTest = "<thisIsTheKey>thisIsTheValue</thisIsTheKey>";
	}
	
	public String getStringToTest()
	{
		return this.stringToTest;
	}
	
	public void setStringToTest(String stringToTest) 
	{
		this.stringToTest = stringToTest;
	}
}
