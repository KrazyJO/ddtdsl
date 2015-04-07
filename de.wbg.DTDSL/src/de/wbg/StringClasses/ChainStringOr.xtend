package de.wbg.StringClasses

import de.wbg.generator.DTDSLGenerator
import de.wbg.dTDSL.StringDescription
import de.wbg.dTDSL.StringDescriptionInner
import de.wbg.dTDSL.StringOr
import de.wbg.dTDSL.StringDescriptionInVariable

class ChainStringOr extends ChainString{
	
	new(DTDSLGenerator g) {
		super(g)
	}
	
	override handle(int index, StringDescriptionInner i) {
		if (i instanceof StringOr)
		{
			this.returnValue = '''		{
			int oldStringPosition = this.scanner.getPosition();
			boolean optionFound = false;
			«FOR o: i.option» 
			if (!optionFound)
			{
				try
				{
					Head optionHead = new Head("OPTIONHEAD");
					parse«(i.eContainer as StringDescription).name»Option«o.name»(optionHead);
					optionFound = true;
				}
				catch (ParserException e)
				{
					optionFound = false;
					scanner.resetToPosition(oldStringPosition);
				}
			}
			
			«ENDFOR»
			if (!optionFound)
			{
				throw new ParserException("no possible option found in stringobject «getDescriptionName(i.eContainer)»");
			}
		}
			'''
			return true;
		}
		return false;
	}
	
	
}