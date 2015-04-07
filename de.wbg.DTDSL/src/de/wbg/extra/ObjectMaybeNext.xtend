package de.wbg.extra

import de.wbg.dTDSL.ObjectMaybeInner
import de.wbg.dTDSL.ObjectNext
import de.wbg.dTDSL.ObjectDescription
import de.wbg.dTDSL.ObjectDescriptionInner

class ObjectMaybeNext extends ChainMaybe {
	
	override handle(ObjectMaybeInner inner, ObjectDescription d, ObjectDescriptionInner i) {
		
		if (inner instanceof ObjectNext)
		{
			this. returnValue = 
			
		'''Element maybeHead = new Element("MAYBEHEAD");
maybeHead.setNodeNumber(n.getNodeNumber());
Object temp = o;
try
{
	parse«d.name.toFirstUpper»«inner.objectDesription.name.toFirstUpper»(temp, maybeHead);
	this.prev = newNode;
	for (Element child: maybeHead.getChildren())
	{
		n.addChild(child);
		child.setParent(n);
		if (this.prev != null)
		{
			this.prev.setNext(child);
		}
		this.prev = child;
	}
} 
catch (ParserException e) 
{
	//destroy reference
	maybeHead = null;
}'''
		}
		else
		{
			return false;
		}
		
		return true;
		
	}
	
}