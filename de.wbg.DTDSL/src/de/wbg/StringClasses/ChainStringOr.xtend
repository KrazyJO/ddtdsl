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
			ArrayList<Head> parsedOptions = new ArrayList<Head>();
			«FOR o: i.option» 
			if (!optionFound)
			{
				try
				{
					Head optionHead = new Head("OPTIONHEAD");
					parse«(i.eContainer as StringDescription).name»Option«o.name.toFirstUpper»(optionHead);
					optionFound = true;
					
					parsedOptions.add(optionHead);
				}
				catch (ParserException e)
				{
					optionFound = false;
					scanner.resetToPosition(oldStringPosition);
				}
			}
			
			«ENDFOR»
			
			//get the head form parsedOptions with max length
			int optionIndex = -1;
			int optionIndexLength = -1;
			for (int i = 0; i < parsedOptions.size(); i++)
			{
				Element el = parsedOptions.get(i);
				if (el.getTotalLength() > optionIndexLength)
				{
					optionIndex = i;
					optionIndexLength = el.getTotalLength();
				}
			}
		
			if (optionIndex >= 0 && optionIndexLength > 0)
			{
				Element el = parsedOptions.get(optionIndex);
				for (Element element : el.getChildren())
				{
					n.addChild(element);
					element.setParent(n);
					el.removeChild(element);
				}
			}
			else
			{
«««				throw new ParserException("No valid option found");
				throw new ParserException("no possible or-option found in StringDescription \"«getDescriptionName(i.eContainer)»\"");
			}
				
			if (!optionFound)
			{
				throw new ParserException("no possible or option found in stringobject «getDescriptionName(i.eContainer)»");
			}
			}
				'''
			return true;
		}
		return false;
	}
	
	
}