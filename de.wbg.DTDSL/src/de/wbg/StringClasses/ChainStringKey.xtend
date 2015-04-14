package de.wbg.StringClasses

import de.wbg.dTDSL.StringDescription
import de.wbg.dTDSL.StringDescriptionInner
import de.wbg.dTDSL.StringKey
import de.wbg.dTDSL.StringOverRead
import de.wbg.generator.DTDSLGenerator
import de.wbg.dTDSL.StringDescriptionInVariable
import de.wbg.dTDSL.StringComplex

class ChainStringKey extends ChainString {
	
	new(DTDSLGenerator g) {
		super(g)
	}
	
	override handle(int index, StringDescriptionInner i) 
	{
		if (i instanceof StringKey)
		{
			this.returnValue = '''		//parseKey «if (i.name != null) {generator.needStringKeyStore = true; i.name}»
		{
			Node stringNode = new Node(n.getNameForNode());
«««			«if (index == d.description.size-1) 
			«if (index == (getDescriptionSize(i.eContainer)-1))
				{'''String key = scanner.scanUpToSpace();'''} 
			else 
			{
//				var temp = d.description.get(index+1);
				var temp = getDescriptionObjectGet(i.eContainer, index+1);
				if (temp instanceof StringOverRead)
				{
					
					if (i.type != "String")
					{
						'''«i.type» key = scanner.scanUpToStringAs«i.type.toFirstUpper»("«temp.overRead»");'''
							
					}
					else
					{
						'''String key = scanner.scanUpToString("«temp.overRead»");'''
					}
//					'''String key = scanner.scanUpToString("«temp.overRead»");'''
				}
				else if (temp instanceof StringDescriptionInVariable)
				{
					var next = temp.eContents.get(0);
					if (next != null && next instanceof StringOverRead)
					{
						'''String key = scanner.scanUpToString("«(next as StringOverRead).overRead»")'''	
					}
				}
				else if (temp == null)
				{
					'''String key = scanner.scanUpToEnd();'''
				}
				else 
				{
					'''//this case is not implemented yet -> scan key, no next -> «temp.class»'''
				}
			}
				»
			stringNode.setValueClass(«i.type».class);
			stringNode.setValue(key);
			stringNode.setKey(true);
			«IF i.name != null»
			this.stringKeyVariables.put("«i.name»", String.valueOf(key));
			«ENDIF»
			
			stringNode.setParent(n);
			n.addChild(stringNode);
			nodeForValue = stringNode;
		}
		
			'''
			
			return true;
		}
		return false;
	}
	
}