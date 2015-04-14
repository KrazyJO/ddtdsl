package de.wbg.StringClasses

import de.wbg.dTDSL.StringComplex
import de.wbg.dTDSL.StringDescriptionInner
import de.wbg.dTDSL.StringOverRead
import de.wbg.dTDSL.StringValue
import de.wbg.generator.DTDSLGenerator
import de.wbg.dTDSL.StringDescriptionInVariable

class ChainStringValue extends ChainString {
	
	new(DTDSLGenerator g) {
		super(g)
	}
	
	override handle(int index, StringDescriptionInner i) {
		if (i instanceof StringValue)
			{
				this.returnValue = '''		//parseValue «if (i.name != null) {this.generator.needStringValueStore = true; i.name}»
		{
			Attribute valueAttrib = new Attribute(nodeForValue.getNameForAttribute());
			valueAttrib.setType(«i.type».class);
			//parse Value
			«if (index == (getDescriptionSize(i.eContainer)-1)) 
				{'''String value = scanner.scanUpToSpace();'''} 
			else 
			{
				var temp = getDescriptionObjectGet(i.eContainer, index+1);
				
				if (temp instanceof StringOverRead)
				{
					if (i.type != "String")
					{
						'''«i.type» value = scanner.scanUpToStringAs«i.type.toFirstUpper»("«temp.overRead»");'''	
					}
					else
					{
						'''String value = scanner.scanUpToString("«temp.overRead»");'''
					}
				}
				else if (temp instanceof StringComplex)
				{
					var next = this.getNextElementFromComplex(temp)
					if (next != null)
					{
						if (next == "")
						{
							'''String value = scanner.scanUpToSpace();'''
						}
						else
						{
							if (temp.maybe != null)
							{
								'''
								String value = null;
								{
									int scannerPos = scanner.getPosition();
									try
									{
										value = scanner.scanUpToString("«next»");
									}
									catch (Exception e)
									{
										scanner.resetToPosition(scannerPos);
									}
								}
								
								'''	
							}
							
						}
					}
					else
					{
						'''String value = scanner.scanUpToEnd();'''
					}
				}
				else
				{
					//ist das letzte stück im String
					
					'''//this case is not implemented yet -> scan value, no next'''	
				}
			}
			»
			if (value != null)
			{
				valueAttrib.setValue(value);
				valueAttrib.setParent(nodeForValue);
				nodeForValue.addChild(valueAttrib);
			}
			
		}
				'''
				
				return true;
			}
			
			return false;
	}
	
	def String getNextElementFromComplex(StringComplex c)
	{
		for (el: c.eResource.allContents.toIterable.filter(StringDescriptionInVariable))
		{
			if (el.name == c.name.name)
			{
				//im richtigen StringDescriptionInVariable
				var n = el.eContents.get(0)
				if (n != null && n instanceof StringOverRead)
				{
					return ((n as StringOverRead).overRead)
				}
				else if (n == null)
				{
					println("found null");
					return null
				}
				else
				{
					return ""
				}
			}
		}
		
		println("nicht das richtige dabei")
	}
	
}