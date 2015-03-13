package de.wbg

class NodeGen {
	
	def generateNode() 
	{
				'''
package de.wbg.dtdsl;
				
import java.util.LinkedList;


public class Node extends Element{

	private String name;
	private String value;
	private boolean key;
	
	private Node parent;
«««	private LinkedList<Node> children;
	
	public Node()
	{
		//children = new LinkedList<Node>();
		super();
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
«««	public LinkedList<Node> getChildren()
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
	
	def generateAttribute()
	{
		'''
		package de.wbg.dtdsl;
		
		class Attribute extends Element
		{
			
			private String name;
			private String value;
			private String type;
			
			public Attribute(String name, String value, String type)
			{
				this.name = name;
				this.value = value;
				this.type = type;
			}
			
			public Attribute()
			{
				
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
		'''
	}
	
	def generateHead()
	{
		'''
		package de.wbg.dtdsl;
		
		class Head extends Element
		{
			
		}
		'''
	}
	
	def generateElement()
	{
		'''
		package de.wbg.dtdsl;
		
		import java.util.LinkedList;
		
		class Element
		{
			
			private LinkedList<Element> children;
			private Element parent;
			
			public Element()
			{
				this.children = new LinkedList();
			}
			
			public LinkedList<Element> getChildren()
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
			
			public Element getParent()
			{
				return this.parent;
			}
			
			public void setParent(Element node)
			{
				this.parent = node;
			}
		}
		'''
	}
}