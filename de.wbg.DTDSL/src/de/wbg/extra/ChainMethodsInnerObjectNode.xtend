package de.wbg.extra

import de.wbg.dTDSL.ObjectDescription
import de.wbg.dTDSL.ObjectDescriptionInner
import de.wbg.dTDSL.ObjectNode

class ChainMethodsInnerObjectNode extends ChainMethodsInner
{
	
	override handle(ObjectDescription d, ObjectDescriptionInner i) 
	{
		
		if (i instanceof ObjectNode)
		{
			this.returnValue = '''	public void parse«d.name.toFirstUpper»«i.attributes.toFirstUpper»(Object o, Element n) throws Exception
	{
			'''
			
			
			this.returnValue = this.returnValue + ''' //Node
		'''
		
		this.returnValue = this.returnValue + '''
		try
		{
			Field f = o.getClass().getDeclaredField("«i.attributes»");
			f.setAccessible(true);
			Object next = (Object) f.get(o);
			
			int nextVisit = System.identityHashCode(next);
			if (this.visited.contains(nextVisit))
			{
				return;
			}
			else
			{
				this.visited.add(nextVisit);
			}
			
			parse«i.inner.name.toFirstUpper»(next, n);
		}
		catch(NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			throw new ParserException("Error while parsing «i.attributes» in «i»");
		}
		catch (ParserException e)
		{
			throw e;
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