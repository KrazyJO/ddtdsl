package de.wbg.StringClasses

import de.wbg.generator.DTDSLGenerator
import de.wbg.dTDSL.StringDescriptionInner
import de.wbg.dTDSL.StringComplex
import java.util.LinkedList
import de.wbg.dTDSL.StringDescription
import de.wbg.dTDSL.StringDescriptionInVariable

class ChainStringMaybe extends ChainString{
	
	var LinkedList<ChainString> handlerList;
	
	new(DTDSLGenerator g) {
		super(g)
	}
	
	override handle(int index, StringDescriptionInner i) 
	{
		if (i instanceof StringComplex)
		{
			if (i.maybe != null)
			{
				var StringDescription stringDescription = this.goUpToStringDescription(i)
				this.initMessageHandler
				var ret = '''			{ //maybe
				int scannerPosition = scanner.getPosition();
				Head maybeHead = new Head("none");
				maybeHead.setNodeNumber(n.getNodeNumber());
				maybeHead.setAttributeNumber(n.getAttributeNumber());
				try 
				{
					parse«stringDescription.name»Option«i.name.name.toFirstUpper»(maybeHead);
					
					for (Element el : maybeHead.getChildren())
					{
						n.addChild(el);
						el.setParent(n);
						maybeHead.removeChild(el);
					}
					
					n.setNodeNumber(maybeHead.getNodeNumber());
					n.setAttributeNumber(maybeHead.getAttributeNumber());
				}
				catch (Exception e)
				{
«««					scanner.resetToPosition(scannerPosition);
					throw e;
				}
			}
				
				'''
				
				this.returnValue = ret
				return true;
			}
		}
			
		return false;
	}
	
	def void initMessageHandler()
	{
		this.handlerList = new LinkedList<ChainString>
		this.handlerList.add(new ChainStringKey(this.generator))
		this.handlerList.add(new ChainStringKeyRef(this.generator))
		this.handlerList.add(new ChainStringReadOver(this.generator))
		this.handlerList.add(new ChainStringValue(this.generator))
		this.handlerList.add(new ChainStringOr(this.generator))
		this.handlerList.add(new ChainStringMaybe(this.generator));
	}
	
	def StringDescription goUpToStringDescription(Object o)
	{
		if (o instanceof StringDescription)
		{
			return (o as StringDescription)	
		}
		else if (o instanceof StringDescriptionInVariable)
		{
			return this.goUpToStringDescription((o as StringDescriptionInVariable).eContainer)
		}		
		else if (o instanceof StringDescriptionInner)
		{
			return this.goUpToStringDescription((o as StringDescriptionInner).eContainer)
		}
	}
	
}