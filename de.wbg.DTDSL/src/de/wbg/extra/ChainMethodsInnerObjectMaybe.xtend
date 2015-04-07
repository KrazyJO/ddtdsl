package de.wbg.extra

import de.wbg.dTDSL.ObjectAttribute
import de.wbg.dTDSL.ObjectDescription
import de.wbg.dTDSL.ObjectDescriptionInner
import de.wbg.dTDSL.ObjectMaybe
import de.wbg.dTDSL.ObjectNext
import de.wbg.dTDSL.ObjectNode
import de.wbg.generator.DTDSLGenerator

class ChainMethodsInnerObjectMaybe extends ChainMethodsInner {
	
	var DTDSLGenerator generator
	
	new(DTDSLGenerator g) {
		this.generator = g
	}
	
	override handle(ObjectDescription d, ObjectDescriptionInner i) 
	{
		
		if (i instanceof ObjectMaybe)
		{
			if (i.description != null)
			{
				var inner = i.description;
				if (inner instanceof ObjectAttribute)
				{
					this.returnValue = '''	public void parseMaybe«d.name.toFirstUpper»Attribute«inner.attributes.toFirstUpper »(Object o, Element n) throws Exception
	{
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
					this.returnValue = '''	public void parseMaybe«d.name.toFirstUpper»«inner.attributes.toFirstUpper»(Object o, Element n) throws Exception
	{
				'''
				}
				
				if (i.description != null)
				{
					var innerDescription = i.description
					if (innerDescription instanceof ObjectNode) 
					{
//						innerDescription.compile
						this.returnValue = this.returnValue + '''''' + this.generator.compile(innerDescription);
					}
					else if (innerDescription instanceof ObjectAttribute)
					{
//						innerDescription.compile
						this.returnValue = this.returnValue + '''''' + this.generator.compile(innerDescription);
					}
					else if (innerDescription instanceof ObjectNext)
					{
//						innerDescription.compile
						this.returnValue = this.returnValue + '''''' + this.generator.compile(innerDescription);
					}	
					
				}
					
				
				this.returnValue = this.returnValue + '''		///maybe
	}
				'''	
			}
		}
		else
		{
			return false
		}
		
		true
	}
	
}