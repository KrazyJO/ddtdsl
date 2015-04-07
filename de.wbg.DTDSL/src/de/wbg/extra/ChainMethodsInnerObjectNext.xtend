package de.wbg.extra

import de.wbg.dTDSL.ObjectDescription
import de.wbg.dTDSL.ObjectDescriptionInner
import de.wbg.dTDSL.ObjectNext

class ChainMethodsInnerObjectNext extends ChainMethodsInner {
	
	override handle(ObjectDescription d, ObjectDescriptionInner i) 
	{
		
		if (i instanceof ObjectNext)
		{
			this.returnValue = '''	public void parse«d.name.toFirstUpper»«i.objectDesription.name.toFirstUpper»(Object o, Element n) throws Exception
	{
			'''
			
			this.returnValue = this.returnValue + '''		//Next: 
		«if (i.attribute.code == null)
		{
			var ret = '''//kein code: «i.attribute.id»
			'''
			ret += '''
			try {
				Field f = o.getClass().getDeclaredField("«i.attribute.id»"); //NoSuchFieldException
				f.setAccessible(true);
				Object next = (Object) f.get(o); //IllegalAccessException
				
				int nextVisit = System.identityHashCode(next);
				if (this.visited.contains(nextVisit))
				{
					return;
				}
				else
				{
					this.visited.add(nextVisit);
				}
			
«««				this.prev = newNode;
			
				parse«i.objectDesription.name»(next, n);
				actualNode = n;
			}
			catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
			{
				throw new ParserException("Error while parsing «i.attribute.id»");
			}
			
	}

			'''
			ret
		}
		else
		{
			'''//code: «i.attribute.code»
	}'''
		}
		»
		'''	
			
		}
		else
		{
			return false
		}
		
		true
	}
	
}