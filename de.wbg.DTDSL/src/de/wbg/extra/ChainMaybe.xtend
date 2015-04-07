package de.wbg.extra

import de.wbg.dTDSL.ObjectAttribute
import de.wbg.dTDSL.ObjectDescription
import de.wbg.dTDSL.ObjectDescriptionInner
import de.wbg.dTDSL.ObjectMaybeInner
import de.wbg.dTDSL.ObjectNext

abstract class ChainMaybe {
	
	var CharSequence returnValue = '''''';
	
	def ChainX()
	{
		
	}
	
	abstract def boolean handle(ObjectMaybeInner inner, ObjectDescription d, ObjectDescriptionInner i);
	
	def void setReturnValue(CharSequence value)
	{
		returnValue = value;
	}
	
	def CharSequence getReturnValue()
	{
		this.returnValue;
	}
	
	def CharSequence getArgument(ObjectDescriptionInner d)
	{
		if (d instanceof ObjectNext)
		{
			'''n'''
		}
		else if (d instanceof ObjectAttribute)
		{
			'''newNode'''
		} 
		else
		{
			'''newNode'''
		}
	}
	
}