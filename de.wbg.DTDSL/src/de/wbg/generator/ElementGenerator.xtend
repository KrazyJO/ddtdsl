package de.wbg.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class ElementGenerator implements IGenerator{
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		println("ownGenerator")
//		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	

}