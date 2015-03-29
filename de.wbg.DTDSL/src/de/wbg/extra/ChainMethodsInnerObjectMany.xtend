package de.wbg.extra

import de.wbg.dTDSL.ObjectAttribute
import de.wbg.dTDSL.ObjectDescription
import de.wbg.dTDSL.ObjectDescriptionInner
import de.wbg.dTDSL.ObjectMany
import de.wbg.dTDSL.ObjectNext
import de.wbg.dTDSL.ObjectNode
import de.wbg.generator.DTDSLGenerator

class ChainMethodsInnerObjectMany extends ChainMethodsInner {

	var DTDSLGenerator generator
	
	new(DTDSLGenerator g) {
		this.generator = g
	}
	
	override handle(ObjectDescription d, ObjectDescriptionInner i) 
	{
		
		if (i instanceof ObjectMany)
		{
			this.generator.needGetInstanceGenerated = true;
			var inner = i.option
			if (inner instanceof ObjectAttribute)
			{
				this.returnValue = '''	public void parseMany«d.name.toFirstUpper»Attribute«inner.attributes.toFirstUpper»(Object o, Element n) throws Exception
	{
		Attribute valueNode = new Attribute("attribute" + n.increaseAttributeNumber());
«««		valueNode.setType("value");
		valueNode.setType(o.getClass());
	
		valueNode.setName("«inner.attributes»");
«««		valueNode.setValue(String.valueOf(o));
		valueNode.setValue(o);
«««		valueNode.setType("value");
		
		valueNode.setParent(n);
		n.getChildren().add(valueNode);
				'''	
			}
			else if (inner instanceof ObjectNext)
			{
				this.returnValue = '''	public void parse«d.name.toFirstUpper»«inner.objectDesription.name.toFirstUpper»(Object o, Element n) throws Exception
	{
				'''
			}
			else if (inner instanceof ObjectNode)
			{
				this.returnValue = '''	public void parseMany«d.name.toFirstUpper»«inner.attributes.toFirstUpper»(Object o, Element n) throws Exception
	{
				'''
			}

			//Methodenrumpf

			this.returnValue = this.returnValue + '''		//many
	}
		'''

		}
		else
		{
			return false
		}
		
		true
	}
	
}