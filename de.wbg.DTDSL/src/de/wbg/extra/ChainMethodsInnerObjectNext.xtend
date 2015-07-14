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
			var ret = '''
			'''
			ret += '''
			try {
				Field f = o.getClass().getDeclaredField("«i.attribute.id»"); //NoSuchFieldException
				f.setAccessible(true);
				Object next = (Object) f.get(o); //IllegalAccessException
				
				int nextVisit = System.identityHashCode(next);
				if (this.visited.contains(nextVisit))
				{
					//complete parser circle
					Node actNode = this.allObjectNodes.get(this.visited.get(this.visited.size()-1));
					Node circleNode = this.allObjectNodes.get(nextVisit);
					actNode.setNext(circleNode);
					circleNode.setPrevious(actNode);
					return;
				}
				else
				{
					this.visited.add(nextVisit);
				}
			
				parse«i.objectDesription.name»(next, n);
				actualNode = n;
			}
			catch (NoSuchFieldException e)
			{
				throw new ParserException("could not find field \"«i.attribute.id»\" in «i.objectDesription.name»");
			}
			catch (SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
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