package de.wbg.ddtdsl.testhelper;
import de.wbg.dtdsl.Attribute;
import de.wbg.dtdsl.Head;
import de.wbg.dtdsl.Element;
import de.wbg.dtdsl.Node;


public class AST2Json {

	private String rValue;
	
	public String parse(Head h)
	{
		this.rValue = "";
		String temp = "";
		int index = 0;
		for (Element el : h.getChildren()) {
			temp = "";
			if (el instanceof Attribute)
			{
				temp += parseChild((Attribute)el);	
			}
			else
			{
				temp += parseChild((Node)el);
			}
			this.rValue += temp;
			index++;
			if (index < h.getChildren().size())
			{
				this.rValue += ", ";
			}
		}
		
		return "" + this.rValue + "";
	}
	
	public String parseChild(Attribute child)
	{
		String rValue = "\"Attribute\" : ";
		//value
		rValue += "{\"Name\" : " + "\"" + child.getName() +"\", ";
		System.out.println("name: " + child.getName());
		int index = 0;
		if (child.getChildren().size() > 0)
		{
			//String in Key-Value aufgeschlüsselt
			String tmp;
			for (Element el : child.getChildren())
			{
				tmp = parseStringKeyValue((Node)el);
				System.out.println("tmp: " + tmp);
//				if (tmp != "")
//				{
					rValue += "\"" + "Value" + "\" : " + tmp;
//				}
				index++;
				if (index < child.getChildren().size() && tmp != "" )
				{
					rValue += ", ";
				}	
			}
			
		}
		else
		{
			//einfacher primitiver Datentyp
			rValue += "\"" + "Value" + "\" : " + "\"" + String.valueOf(child.getValue()) + "\"";
		}
		
		
		//type
		rValue += ", \"type\" : " + "\"" + child.getType().toString() + "\"";
		return "{" + rValue + "}";
	}
	
	public String parseStringKeyValue(Node child)
	{
		//String-Key
		String rValue = "{\"Key\" : \""+ child.getValue() + "\"";
		int index = 0;
		if (child.getChildren().size()>1)
		{
			rValue += ", \"Value\" :  [";
			for (Element el : child.getChildren())
			{
				Attribute attrib = (Attribute)el;
				rValue += "\"" + String.valueOf(attrib.getValue())+ "\"" ; 
				index++;
				if (index < child.getChildren().size())
				{
					rValue += ", ";
				}
			}
			
			rValue += "] ";	
		}
		else
		{
			rValue += ", \"Value\" : \"" + ((Attribute)child.getChildren().get(0)).getValue() + "\""; 
		}
		
		
		return rValue + "}";
	}
	
	public String parseChild(Node child)
	{
		String rValue = "";
		rValue += "{\"" + child.getName() + "\" : ";
		String temp;
		int index = 0;
		for (Element el : child.getChildren()) {
			temp = "";
			if (el instanceof Attribute)
			{
				temp += parseChild((Attribute)el);	
			}
			else
			{
				temp += parseChild((Node)el);
			}
			rValue += temp;
			index++;
			if (index < child.getChildren().size())
			{
				rValue += ", ";
			}
		}
		if (child.getNext() != null)
		{
			rValue += ", \"next\" : " + child.getNext().getOriginalHashCode() ;
		}
		rValue += ", \"HashCode\" : " + child.getOriginalHashCode() + "}";
		return rValue + "}";
	}
}
