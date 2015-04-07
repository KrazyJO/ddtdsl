package de.wbg.StringClasses

import de.wbg.dTDSL.StringDescription
import de.wbg.dTDSL.StringDescriptionInner
import de.wbg.dTDSL.StringKey
import de.wbg.dTDSL.StringOverRead
import de.wbg.generator.DTDSLGenerator

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
					'''String key = scanner.scanUpToString("«temp.overRead»");'''
				}
				else
				{
					'''//this case is not implemented yet -> scan key, no next'''	
				}
			}
				»
			stringNode.setValue(key);
			stringNode.setKey(true);
			«IF i.name != null»
			this.stringKeyVariables.put("«i.name»", key);
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