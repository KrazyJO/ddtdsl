package de.wbg.extra

import de.wbg.dTDSL.ObjectAttribute
import de.wbg.dTDSL.ObjectDescription
import de.wbg.dTDSL.ObjectDescriptionInner
import de.wbg.dTDSL.ObjectMaybe
import de.wbg.dTDSL.ObjectMaybeInner

class ObjectMaybeAttribute extends ChainMaybe {
	
	override handle(ObjectMaybeInner inner, ObjectDescription d, ObjectDescriptionInner i) {
		
		if (i instanceof ObjectMaybe) 
		{
		
			if (inner instanceof ObjectAttribute)
			{
				
				this.returnValue = 
'''Element maybeHead = new Element("MAYBEHEAD");
Object temp = o;
try
{
	parseMaybe«d.name.toFirstUpper»Attribute«inner.attributes.toFirstUpper »(temp, maybeHead);
	for (Element child: maybeHead.getChildren())
	{
		«i.argument».addChild(child);
		child.setParent(«i.argument»);
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
				return false
			}
				
			}
			
			
			true
		
	}
	
	
}