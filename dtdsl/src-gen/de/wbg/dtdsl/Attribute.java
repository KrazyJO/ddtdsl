package de.wbg.dtdsl;

class Attribute extends Element
{
	
	private String name;
	private Object value;
	private Class type;
	
	public Attribute(String name, Object value, Class type, String id)
	{
		super(id);
		this.name = name;
		this.value = value;
		this.type = type;
	}
	
	@Override
	public Element copy()
	{
		Attribute rAttribute = new Attribute(this.getId());
		rAttribute.setChildren(this.getChildren());
		rAttribute.setParent(this.getParent());
		rAttribute.setNodeNumber(this.getNodeNumber());
		rAttribute.setAttributeNumber(this.getAttributeNumber());
		rAttribute.setName(this.getName());
		rAttribute.setValue(this.getValue());
		rAttribute.setType(this.getType());
		
		return rAttribute;
	}
	
	public Attribute(String id)
	{
		super(id);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String value) 
	{
		this.name = value;
	}
	
	public Object getValue()
	{
		return this.value;
	}
	
	public void setValue(Object value) 
	{
		this.value = value;
	}
	
	public Class getType()
	{
		return this.type;
	}
	
	public void setType(Class value) 
	{
		this.type = value;
	}
}
