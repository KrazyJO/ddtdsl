package de.wbg.dtdsl;

import java.util.LinkedList;

public class SimpleLinkedListAttributeI {

private LinkedList<Integer> array;
	
	public SimpleLinkedListAttributeI()
	{
		this.array = new LinkedList<Integer>();
		this.array.add(0);
		this.array.add(1);
		this.array.add(2);
		this.array.add(3);
	}
	
}
