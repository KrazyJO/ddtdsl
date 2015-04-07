package de.wbg.StringClasses

import de.wbg.dTDSL.StringDescription
import de.wbg.dTDSL.StringDescriptionInner
import de.wbg.dTDSL.StringOverRead
import de.wbg.generator.DTDSLGenerator

class ChainStringReadOver extends ChainString {
	
	new(DTDSLGenerator g) {
		super(g)
	}
	
	override handle(int index, StringDescriptionInner i) {
		if (i instanceof StringOverRead)
		{
			this.returnValue = '''		//overread «i.overRead»
		if (scanner.hasNext("«i.overRead»"))
		{
			scanner.skip("«i.overRead»");
		}
		else
		{
			throw new ParserException("Error while parsing String in «descriptionName» while overreading \"«i.overRead»\"");
		}
		
			'''
			
			return true;
		}
		
		return false;
	}
	
}