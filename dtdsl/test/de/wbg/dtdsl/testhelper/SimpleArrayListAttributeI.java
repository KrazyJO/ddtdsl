package de.wbg.dtdsl.testhelper;

import java.util.ArrayList;

public class SimpleArrayListAttributeI {

	private ArrayList<Integer> array;
	
	public SimpleArrayListAttributeI()
	{
		this.array = new ArrayList<Integer>();
		this.array.add(0);
		this.array.add(1);
		this.array.add(2);
		this.array.add(3);
	}
}
