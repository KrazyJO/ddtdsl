package de.wbg.extra

import de.wbg.dTDSL.ObjectMaybeInner
import de.wbg.dTDSL.ObjectNode
import de.wbg.dTDSL.ObjectDescription
import de.wbg.dTDSL.ObjectDescriptionInner

class ObjectMaybeNode extends ChainMaybe{
	
	override handle(ObjectMaybeInner inner, ObjectDescription d, ObjectDescriptionInner i) {
		
		if (inner instanceof ObjectNode)
		{
			this.returnValue = 
'''
Element maybeHead = new Element("MAYBEHEAD");
Object temp = o;
try
{
	parseMaybe«d.name.toFirstUpper»«inner.attributes.toFirstUpper»(temp, maybeHead);
	for (Element child: maybeHead.getChildren())
	{
		newNode.addChild(child);
		child.setParent(newNode);
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