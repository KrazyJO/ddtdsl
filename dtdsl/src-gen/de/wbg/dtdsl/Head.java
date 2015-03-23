package de.wbg.dtdsl;

class Head extends Element
{
	
	public Head(String id)
	{
		super(id);
	}
	
	@Override
	public Element copy()
	{
		return new Head("HEAD");
	}
}
