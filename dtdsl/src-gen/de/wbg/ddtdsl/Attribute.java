package de.wbg.ddtdsl;

public class Attribute extends Element
{
	
	public Attribute(String name, Object value, Class type, String id)
	{
		super(id);
		this.setName(name);
		this.setValue(value);
		this.setType(type);
	}
	
	public Attribute(String id)
	{
		super(id);
	}
}
