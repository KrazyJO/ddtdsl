/*
 * generated by Xtext
 */
package de.wbg.ui.contentassist

import de.wbg.ui.contentassist.AbstractDTDSLProposalProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.Assignment
import de.wbg.dTDSL.ObjectDescription
import org.eclipse.xtext.RuleCall

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to customize content assistant
 */
class DTDSLProposalProvider extends AbstractDTDSLProposalProvider {
	
	override public void completeObjectNext_ObjectDesription(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor)
	{
		if (model != null)
		{
			var descriptions = model.eResource.allContents.toIterable.filter(ObjectDescription)
			for (d: descriptions)
			{
				var proposal = createCompletionProposal(d.name, d.name + " : ObjectDescription", assignment.image, context)
				acceptor.accept(proposal)
			}
		}
	}
	
	override public void completeObjectNode_Inner(
		EObject model, 
		Assignment assignment, ContentAssistContext context, 
		ICompletionProposalAcceptor acceptor  )
	{
		if (model != null)
		{
			var descriptions = model.eResource.allContents.toIterable.filter(ObjectDescription)
			for (d: descriptions)
			{
				var proposal = createCompletionProposal(d.name, d.name + 
				" : ObjectDescription", assignment.image, context)
				acceptor.accept(proposal)
			}
		}
	}
	
//	override public void completeDTDSL_ObjDescription(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
////		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
//		if (model != null)
//		{
//			
//		}
//	}
}
