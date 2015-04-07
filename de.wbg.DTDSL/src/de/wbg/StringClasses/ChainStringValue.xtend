package de.wbg.StringClasses

import de.wbg.generator.DTDSLGenerator
import de.wbg.dTDSL.StringDescription
import de.wbg.dTDSL.StringDescriptionInner
import de.wbg.dTDSL.StringValue
import de.wbg.dTDSL.StringOverRead

class ChainStringValue extends ChainString {
	
	new(DTDSLGenerator g) {
		super(g)
	}
	
	override handle(int index, StringDescriptionInner i) {
		if (i instanceof StringValue)
			{
				this.returnValue = '''		//parseValue «if (i.name != null) {this.generator.needStringValueStore = true; i.name}»
		{
			Attribute valueAttrib = new Attribute(n.getNameForAttribute());
			valueAttrib.setType(String.class);
			//parse Value
			«if (index == (getDescriptionSize(i.eContainer)-1)) 
				{'''String value = scanner.scanUpToSpace();'''} 
			else 
			{
				var temp = getDescriptionObjectGet(i.eContainer, index+1);
				
				if (temp instanceof StringOverRead)
				{
					'''String value = scanner.scanUpToString("«temp.overRead»");'''
				}
				else
				{
					'''//this case is not implemented yet -> scan value, no next'''	
				}
			}
			»
			valueAttrib.setValue(value);
			valueAttrib.setParent(nodeForValue);
			nodeForValue.addChild(valueAttrib);
		}
				'''
				
				return true;
			}
			
			return false;
	}
	
}