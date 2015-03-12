package de.wbg

class NodeGen {
	
	def generateNode() 
	{
				'''
package de.wbg.dtdsl;
				
import java.util.LinkedList;


public class Node {

	private String name;
	private String value;
	private boolean key;
	
	private Node parent;
	private LinkedList<Node> children;
	
	public Node()
	{
		children = new LinkedList<Node>();
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
	
	public void addChildren(Node child)
	{
		this.children.add(child);
	}
	
	public LinkedList<Node> getChildren()
	{
		return this.children;
	}
	
	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	public Node getParent() {
		return parent;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
		'''
	}
	
}