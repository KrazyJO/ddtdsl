package de.wbg.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.wbg.dTDSL.DTDSL;
import de.wbg.dTDSL.DTDSLPackage;
import de.wbg.dTDSL.JavaCodeOrID;
import de.wbg.dTDSL.Keyword;
import de.wbg.dTDSL.ObjectAttribute;
import de.wbg.dTDSL.ObjectChoice;
import de.wbg.dTDSL.ObjectDescription;
import de.wbg.dTDSL.ObjectMany;
import de.wbg.dTDSL.ObjectMaybe;
import de.wbg.dTDSL.ObjectNext;
import de.wbg.dTDSL.ObjectNode;
import de.wbg.dTDSL.StartPoint;
import de.wbg.dTDSL.StringDescription;
import de.wbg.services.DTDSLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DTDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DTDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DTDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DTDSLPackage.DTDSL:
				if(context == grammarAccess.getDTDSLRule()) {
					sequence_DTDSL(context, (DTDSL) semanticObject); 
					return; 
				}
				else break;
			case DTDSLPackage.JAVA_CODE_OR_ID:
				if(context == grammarAccess.getJavaCodeOrIDRule()) {
					sequence_JavaCodeOrID(context, (JavaCodeOrID) semanticObject); 
					return; 
				}
				else break;
			case DTDSLPackage.KEYWORD:
				if(context == grammarAccess.getKeywordRule()) {
					sequence_Keyword(context, (Keyword) semanticObject); 
					return; 
				}
				else break;
			case DTDSLPackage.OBJECT_ATTRIBUTE:
				if(context == grammarAccess.getObjectAttributeRule() ||
				   context == grammarAccess.getObjectDescriptionInnerRule() ||
				   context == grammarAccess.getObjectMaybeInnerRule()) {
					sequence_ObjectAttribute(context, (ObjectAttribute) semanticObject); 
					return; 
				}
				else break;
			case DTDSLPackage.OBJECT_CHOICE:
				if(context == grammarAccess.getObjectChoiceRule() ||
				   context == grammarAccess.getObjectDescriptionInnerRule()) {
					sequence_ObjectChoice(context, (ObjectChoice) semanticObject); 
					return; 
				}
				else break;
			case DTDSLPackage.OBJECT_DESCRIPTION:
				if(context == grammarAccess.getAbstractRule() ||
				   context == grammarAccess.getObjectDescriptionRule()) {
					sequence_ObjectDescription(context, (ObjectDescription) semanticObject); 
					return; 
				}
				else break;
			case DTDSLPackage.OBJECT_MANY:
				if(context == grammarAccess.getObjectDescriptionInnerRule() ||
				   context == grammarAccess.getObjectManyRule()) {
					sequence_ObjectMany(context, (ObjectMany) semanticObject); 
					return; 
				}
				else break;
			case DTDSLPackage.OBJECT_MAYBE:
				if(context == grammarAccess.getObjectDescriptionInnerRule() ||
				   context == grammarAccess.getObjectMaybeRule()) {
					sequence_ObjectMaybe(context, (ObjectMaybe) semanticObject); 
					return; 
				}
				else break;
			case DTDSLPackage.OBJECT_NEXT:
				if(context == grammarAccess.getObjectDescriptionInnerRule() ||
				   context == grammarAccess.getObjectMaybeInnerRule() ||
				   context == grammarAccess.getObjectNextRule()) {
					sequence_ObjectNext(context, (ObjectNext) semanticObject); 
					return; 
				}
				else break;
			case DTDSLPackage.OBJECT_NODE:
				if(context == grammarAccess.getObjectDescriptionInnerRule() ||
				   context == grammarAccess.getObjectMaybeInnerRule() ||
				   context == grammarAccess.getObjectNodeRule()) {
					sequence_ObjectNode(context, (ObjectNode) semanticObject); 
					return; 
				}
				else break;
			case DTDSLPackage.START_POINT:
				if(context == grammarAccess.getStartPointRule()) {
					sequence_StartPoint(context, (StartPoint) semanticObject); 
					return; 
				}
				else break;
			case DTDSLPackage.STRING_DESCRIPTION:
				if(context == grammarAccess.getAbstractRule() ||
				   context == grammarAccess.getStringDescriptionRule()) {
					sequence_StringDescription(context, (StringDescription) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (parserName=STRING (type='javaObject' | type='string') objDescription+=Abstract* start=StartPoint)
	 */
	protected void sequence_DTDSL(EObject context, DTDSL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (code=STRING | id=ID)
	 */
	protected void sequence_JavaCodeOrID(EObject context, JavaCodeOrID semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Key' | name='Value' | name=ID)
	 */
	protected void sequence_Keyword(EObject context, Keyword semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attributes=ID stringMethode=[StringDescription|ID]?)
	 */
	protected void sequence_ObjectAttribute(EObject context, ObjectAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (options+=ObjectMaybeInner options+=ObjectMaybeInner*)
	 */
	protected void sequence_ObjectChoice(EObject context, ObjectChoice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description+=ObjectDescriptionInner*)
	 */
	protected void sequence_ObjectDescription(EObject context, ObjectDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     option=ObjectMaybeInner
	 */
	protected void sequence_ObjectMany(EObject context, ObjectMany semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DTDSLPackage.Literals.OBJECT_MANY__OPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DTDSLPackage.Literals.OBJECT_MANY__OPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getObjectManyAccess().getOptionObjectMaybeInnerParserRuleCall_0_0(), semanticObject.getOption());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (option=[ObjectDescription|ID] | description=ObjectMaybeInner)
	 */
	protected void sequence_ObjectMaybe(EObject context, ObjectMaybe semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attribute=JavaCodeOrID objectDesription=[ObjectDescription|ID])
	 */
	protected void sequence_ObjectNext(EObject context, ObjectNext semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DTDSLPackage.Literals.OBJECT_NEXT__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DTDSLPackage.Literals.OBJECT_NEXT__ATTRIBUTE));
			if(transientValues.isValueTransient(semanticObject, DTDSLPackage.Literals.OBJECT_NEXT__OBJECT_DESRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DTDSLPackage.Literals.OBJECT_NEXT__OBJECT_DESRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getObjectNextAccess().getAttributeJavaCodeOrIDParserRuleCall_1_0(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getObjectNextAccess().getObjectDesriptionObjectDescriptionIDTerminalRuleCall_3_0_1(), semanticObject.getObjectDesription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (attributes=ID inner=[ObjectDescription|ID])
	 */
	protected void sequence_ObjectNode(EObject context, ObjectNode semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DTDSLPackage.Literals.OBJECT_NODE__ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DTDSLPackage.Literals.OBJECT_NODE__ATTRIBUTES));
			if(transientValues.isValueTransient(semanticObject, DTDSLPackage.Literals.OBJECT_NODE__INNER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DTDSLPackage.Literals.OBJECT_NODE__INNER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getObjectNodeAccess().getAttributesIDTerminalRuleCall_1_0(), semanticObject.getAttributes());
		feeder.accept(grammarAccess.getObjectNodeAccess().getInnerObjectDescriptionIDTerminalRuleCall_3_0_1(), semanticObject.getInner());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (begin=[ObjectDescription|ID] | begin=[StringDescription|ID])
	 */
	protected void sequence_StartPoint(EObject context, StartPoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description+=StringDescriptionInner*)
	 */
	protected void sequence_StringDescription(EObject context, StringDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
