package de.wbg.StringClasses

import de.wbg.generator.DTDSLGenerator
import de.wbg.dTDSL.StringDescription
import de.wbg.dTDSL.StringDescriptionInner
import de.wbg.dTDSL.StringOverRead

class ChainStringKeyRef extends ChainString {
	
	new(DTDSLGenerator g) {
		super(g)
	}
	
	override handle(int index, StringDescriptionInner i) {
		if (i.keyRef != null)
		{
			this.returnValue = '''		{
			//keyRef «i.keyRef»
			Node storedValue = this.stringKeyVariables.get("«i.keyRef.name»");	
			if (storedValue == null)
			{
				throw new ParserException("Variable is not exsisting");
			}
			else
			{
				//Wert der gespeicherten Variable mit dem geparsten Wert überprüfen
«««				«if (index == d.description.size-1)
				«if (index == getDescriptionSize(i.eContainer)-1) 
				{
					'''String value = scanner.scanUpToSpace();'''
				} 
				else 
				{
//					var temp = d.description.get(index+1);
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
				if (!value.equals(storedValue.getValue()))
				{
					throw new ParserException("Different key values are not allowed at this context");
				}
			}
		}
	
			'''
			return true;
		}
		return false;
	}
	
}