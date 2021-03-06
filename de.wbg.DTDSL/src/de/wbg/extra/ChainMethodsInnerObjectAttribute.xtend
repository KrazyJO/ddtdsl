package de.wbg.extra

import de.wbg.dTDSL.ObjectDescription
import de.wbg.dTDSL.ObjectDescriptionInner
import de.wbg.dTDSL.ObjectAttribute

class ChainMethodsInnerObjectAttribute extends ChainMethodsInner {
		
	override handle(ObjectDescription d, ObjectDescriptionInner i) 
	{
		
		if (i instanceof ObjectAttribute)
		{
			this.returnValue = '''	public void parse«d.name.toFirstUpper»Attribute«i.attributes.toFirstUpper »(Object o, Element n) throws Exception
	{
			'''
			
			this.returnValue  = this.returnValue + '''		//Attribute
		'''
		
//			if (i.inner == null) {
				this.returnValue  = this.returnValue + '''		//inner == null
				'''
				
			
				this.returnValue  = this.returnValue + '''		int oldAttributeNumber = n.getAttributeNumber();
		try {
			
			Field f = o.getClass().getDeclaredField("«i.attributes»"); //NoSuchFieldException
			f.setAccessible(true);
			Object iWantThis = f.get(o); //IllegalAccessException
		
			Attribute valueNode = new Attribute("attribute" + n.increaseAttributeNumber());
		
			valueNode.setName("«i.attributes»");
			valueNode.setValue(iWantThis);
			valueNode.setType(iWantThis.getClass());
			
			valueNode.setParent(n);
			n.getChildren().add(valueNode);
			
			«if (i.stringMethode != null)
			{
				'''parse«i.stringMethode.name.toFirstUpper»(iWantThis, valueNode);'''
			}»
		}
		catch (NoSuchFieldException e)
		{
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("could not find field \"«i.attributes»\" in «d.name»");
		}
		catch ( SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			//e.printStackTrace();
			n.setAttributeNumber(oldAttributeNumber);
			throw new ParserException("Error while parsing: «i.attributes»");
		}
	}
	
	'''
		}
		else
		{
			return false
		}
		
		true
	}
	
}