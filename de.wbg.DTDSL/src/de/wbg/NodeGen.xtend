package de.wbg

class NodeGen {
	
	def generateNode() 
	{
				'''
package de.wbg.dtdsl;

public class Node extends Element{

	private String name;
	private String value;
	private boolean key;
	
«««	private Node parent;
«««	private ArrayList<Node> children;
	
	public Node(String id)
	{
		//children = new ArrayList<Node>();
		super(id);
	}
	
	@Override
	public Element copy()
	{
		//TODO deep copy
		Node rNode = new Node(this.getId());
		rNode.setChildren(this.getChildren());
		rNode.setParent(this.getParent());
		rNode.setNodeNumber(this.getNodeNumber());
		rNode.setAttributeNumber(this.getNodeNumber());
		rNode.setName(this.getName());
		rNode.setValue(this.getValue());
		rNode.setKey(this.isKey());
		return rNode;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isKey()
	{
		return key;
	}
	
	public void setKey(boolean key) {
		this.key = key;
	}
	
	public String getValue()
	{
		return value;
	}
	
«««	public void addChildren(Node child)
«««	{
«««		this.children.add(child);
«««	}
«««	
«««	public ArrayList<Node> getChildren()
«««	{
«««		return this.children;
«««	}
	
«««	public void setParent(Node parent) {
«««		this.parent = parent;
«««	}
«««	
«««	public Node getParent() {
«««		return parent;
«««	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
		'''
	}
	
	def CharSequence generateAttribute()
	{
		'''
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
		'''
	}
	
	def CharSequence generateHead()
	{
		'''
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
		'''
	}
	
	def CharSequence generateElement()
	{
		'''
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
			private int originalHashCode;
			
			public Element(String id)
			{
				this.children = new ArrayList<Element>();
				this.id = id;
				this.nodeNumber = 0;
				this.attributeNumber = 0;
			}
			
			public int getOriginalHashCode()
			{
				return this.originalHashCode;
			}
			
			public void setOriginalHashCode(int value)
			{
				this.originalHashCode = value;
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
		'''
	}
}