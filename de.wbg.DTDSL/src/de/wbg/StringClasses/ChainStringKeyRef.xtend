package de.wbg.StringClasses

import de.wbg.generator.DTDSLGenerator
import de.wbg.dTDSL.StringDescription
import de.wbg.dTDSL.StringDescriptionInner
import de.wbg.dTDSL.StringOverRead
import de.wbg.dTDSL.StringKey

class ChainStringKeyRef extends ChainString {
	
	new(DTDSLGenerator g) {
		super(g)
	}
	
	override handle(int index, StringDescriptionInner i) {
		if (i.keyRef != null)
		{
			var keyContainer = generator.keyContainer
			var StringKey keyDescription = keyContainer.get(i.keyRef.name) as StringKey
			var type = keyDescription.type
			
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
					if (type != null)
					{
						'''«type» value = scanner.scanUpToSpace();'''	
					}
					else
					{
						'''String value = scanner.scanUpToSpace();'''
					}
					
				} 
				else 
				{
//					var temp = d.description.get(index+1);
					var temp = getDescriptionObjectGet(i.eContainer, index+1);
					if (temp instanceof StringOverRead)
					{
						if (type != "String")
						{
							'''«type» value = scanner.scanUpToStringAs«type.toFirstUpper»("«temp.overRead»");'''	
						}
						else
						{
							'''String value = scanner.scanUpToString("«temp.overRead»");'''
						}
					}
					else
					{
						'''//this case is not implemented yet -> scan value, no next'''	
					}
				}
			»
				«IF type != "String"»
				if (value != («type»)storedValue.getValue())
				«ELSE»
				if (!value.equals(String.valueOf(storedValue.getValue())))
				«ENDIF»
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