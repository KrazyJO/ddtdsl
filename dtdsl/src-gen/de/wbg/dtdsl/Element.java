package de.wbg.dtdsl;

import java.util.ArrayList;

class Element
{
	
	private ArrayList<Element> children;
	private Element parent;
	private final String id;
	private int nodeNumber;
	private int attributeNumber;
	private Element next;
	private Element previous;
	
	public Element(String id)
	{
		this.children = new ArrayList<Element>();
		this.id = id;
		this.nodeNumber = 0;
		this.attributeNumber = 0;
	}
	
	public Node getNodeByName(String name)
	{
		int indexDot = name.lastIndexOf(".");
		String sub;
		if (indexDot > 0)
		{
			sub = name.substring(indexDot+1, name.length()-1);
		}
		else
		{
			sub = name;
		}
		
		if (!sub.startsWith("node"))
		{
			return null;
		}
		return ((Node) this.getElementByName(name));
	}
	
	public Attribute getAttributeByName(String name)
	{
		int indexDot = name.lastIndexOf(".");
		String sub;
		if (indexDot > 0)
		{
			sub = name.substring(indexDot+1, name.length()-1);
		}
		else
		{
			sub = name;
		}
		
		if (!sub.startsWith("attribute"))
		{
			return null;
		}
		
		return ((Attribute) this.getElementByName(name));
	}
	
	public Element getElementByName(String name)
	{
		int index = name.indexOf(".");	
		if (index >= 0) 
		{
			Element rValue;
			String thisName = name.substring(0, index);
			
			if (!thisName.equals(this.id))
			{
				return null;
			}
			
			String childName = name.substring(index+1, name.length());
			for (Element e: this.getChildren())
			{
				if ((rValue = e.getElementByName(childName)) != null)				
				{
					return rValue;
				}
			}
		}
		else if (name.equals(this.id))
		{
			return this;
		}
		
		return null;
	}
	
	public int getNodeNumber()
	{
		return this.nodeNumber;
	}
	
	public void setNodeNumber(int num)
	{
		this.nodeNumber = num;
	}
	
	public int increaseNodeNumber()
	{
		return this.nodeNumber++;
	}
	
	public int getAttributeNumber()
	{
		return this.attributeNumber;
	}
	
	public void setAttributeNumber(int num)
	{
		this.attributeNumber = num;
	}
	
	public int increaseAttributeNumber()
	{
		return this.attributeNumber++;
	}
	
	public String getNameForAttribute()
	{
		return "attribute"+this.attributeNumber++;
	}
	
	public String getNameForNode()
	{
		return "node"+this.nodeNumber++;
	}
	
	public ArrayList<Element> getChildren()
	{
		return this.children;
	}
	
	public int size()
	{
		return this.children.size();
	}
	
	public boolean addChild(Element node)
	{
		return this.getChildren().add(node);
	}
	
	public boolean removeChild(Element node)
	{
		return this.getChildren().remove(node);
	}
	
	public Element get(int i)
	{
		return this.getChildren().get(i);
	}
	
	public void setChildren(ArrayList<Element> value)
	{
		this.children = value;
	}
	
	public Element getParent()
	{
		return this.parent;
	}
	
	public void setParent(Element node)
	{
		this.parent = node;
	}
	
	public String getId()
	{
		return this.id;
	}
	
	public void setNext(Element value)
	{
		this.next = value;
		if (value.getPrevious() != this)
		{
			value.setPrevious(this);	
		}
		
	}
	
	public Element getNext()
	{
		return this.next;
	}
	
	public void setPrevious(Element value)
	{
		this.previous = value;
		if (value.getNext() != this)
		{
			value.setNext(this);
		}
	}
	
	public Element getPrevious()
	{
		return this.previous;
	}
	
	public int getTotalLength()
	{
		int i = 0;
		for (Element e: this.children)
		{
			i += e.getTotalLength();
		}
		
		return i + 1;
	}
	
	public Element copy()
	{
		return null;
	}
}
