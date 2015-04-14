package de.wbg.StringClasses

import de.wbg.dTDSL.StringComplex
import de.wbg.dTDSL.StringDescription
import de.wbg.dTDSL.StringDescriptionInner
import de.wbg.generator.DTDSLGenerator

class ChainStringMany extends ChainString {
	
	new(DTDSLGenerator g) {
		super(g)
	}
	
	override handle(int index, StringDescriptionInner i) 
	{
		if (i instanceof StringComplex)
		{
			if (i.many != null)
			{
				var StringDescription stringDescription;
				var Object o = i.eContainer
				while (!(o instanceof StringDescription))
				{
					o = i.eContainer
				}
				stringDescription = o as StringDescription
				var ret = '''	{ //many
			boolean runLoop = true;
			int scannerPosition;
			while (runLoop)
			{
				scannerPosition = scanner.getPosition();
				try
				{
					Head manyHead = new Head("none");
					manyHead.setNodeNumber(n.getNodeNumber());
					manyHead.setAttributeNumber(n.getAttributeNumber());
					
					parse«stringDescription.name»Option«i.name.name.toFirstUpper»(manyHead);
					
					for (Element el : manyHead.getChildren())
					{
						n.addChild(el);
						el.setParent(n);
					}
					
					n.setNodeNumber(manyHead.getNodeNumber());
					n.setAttributeNumber(manyHead.getAttributeNumber());
				}
				catch (Exception e)
				{
					runLoop = false;
					scanner.resetToPosition(scannerPosition);
				}
			}
		}
		'''
				
				
				
				this.returnValue = ret
				return true;
			}
		}
		
		return false;
	}
	
}