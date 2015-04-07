package de.wbg.StringClasses

import de.wbg.dTDSL.StringDescriptionInner
import de.wbg.dTDSL.StringDescription
import de.wbg.generator.DTDSLGenerator
import de.wbg.dTDSL.StringDescriptionInVariable

abstract class ChainString {

	new(DTDSLGenerator g) {
		this.generator = g; 
	}
	
	var CharSequence returnValue = '''''';
	var DTDSLGenerator generator;
	
	abstract def boolean handle(int index, StringDescriptionInner i);
	
	def void setReturnValue(CharSequence value)
	{
		this.returnValue = value;
	}
	
	def CharSequence getReturnValue()
	{
		this.returnValue;
	}
	
	def void setGenerator(DTDSLGenerator value)
	{
		this.generator = value;
	}
	
	def DTDSLGenerator getGenerator() 
	{
		return this.generator;
	}
	
	def String getDescriptionName(Object d)
	{
		if (d instanceof StringDescription)
		{
			return d.name
		}
		if (d instanceof StringDescriptionInVariable)
		{
			return d.name
		}
	}
	
	def int getDescriptionSize(Object d)
	{
		if (d instanceof StringDescription)
		{
			return d.description.size
		} 
		else if (d instanceof StringDescriptionInVariable)
		{
			return d.description.size
		}
		else
		{
			println("size du depp: " + d)
			return 0
		}
		
//		return 0
	}
	
	def StringDescriptionInner getDescriptionObjectGet(Object d, int index)
	{
		if (d instanceof StringDescription)
		{
			return d.description.get(index)
		} 
		else if (d instanceof StringDescriptionInVariable)
		{
			return d.description.get(index)
		}
		else 
		{
			println("null du depp: " + d.class)
			return null;
		}
	}
}