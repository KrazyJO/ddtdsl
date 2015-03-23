package de.wbg.extra

import de.wbg.dTDSL.ObjectDescription
import de.wbg.dTDSL.ObjectDescriptionInner

abstract class ChainMethodsInner 
{
	
	var CharSequence returnValue = ''''''
	
	abstract def boolean handle(ObjectDescription d, ObjectDescriptionInner i);
	
	def void setReturnValue(CharSequence value)
	{
		returnValue = value;
	}
	
	def CharSequence getReturnValue()
	{
		this.returnValue;
	}
	
	public def addToReturnValue(CharSequence c)
	{
		returnValue = returnValue + c.toString
	}
}