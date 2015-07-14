package de.wbg.ddtdsl;

public class Node extends Element{

	private Class valueClass;
	private boolean key;
	
	public Node(String id)
	{
		//children = new ArrayList<Node>();
		super(id);
	}
	
	public void setValueClass(Class c)
	{
		this.valueClass = c;
	}
	
	public Class getValueClass()
	{
		return this.valueClass;
	}
	
	public boolean isKey()
	{
		return key;
	}
	
	public void setKey(boolean key) {
		this.key = key;
	}
}
