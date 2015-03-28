package de.wbg.dtdsl;

class Attribute extends Element
{
	
	private String name;
	private String value;
	private String type;
	
	public Attribute(String name, String value, String type, String id)
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
	
	public String getValue()
	{
		return this.value;
	}
	
	public void setValue(String value) 
	{
		this.value = value;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public void setType(String value) 
	{
		this.type = value;
	}
}
