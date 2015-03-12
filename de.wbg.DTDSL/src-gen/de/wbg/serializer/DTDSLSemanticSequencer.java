package de.wbg.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.wbg.dTDSL.Choice;
import de.wbg.dTDSL.DTDSL;
import de.wbg.dTDSL.DTDSLPackage;
import de.wbg.dTDSL.JavaCodeOrID;
import de.wbg.dTDSL.Keyword;
import de.wbg.dTDSL.Many;
import de.wbg.dTDSL.Maybe;
import de.wbg.dTDSL.ObjectAttribute;
import de.wbg.dTDSL.ObjectDescription;
import de.wbg.dTDSL.ObjectNext;
import de.wbg.dTDSL.StartPoint;
import de.wbg.dTDSL.importStatement;
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
			case DTDSLPackage.CHOICE:
				if(context == grammarAccess.getAbstractRule() ||
				   context == grammarAccess.getChoiceRule()) {
					sequence_Choice(context, (Choice) semanticObject); 
					return; 
				}
				else break;
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
			case DTDSLPackage.MANY:
				if(context == grammarAccess.getAbstractRule() ||
				   context == grammarAccess.getManyRule()) {
					sequence_Many(context, (Many) semanticObject); 
					return; 
				}
				else break;
			case DTDSLPackage.MAYBE:
				if(context == grammarAccess.getMaybeRule()) {
					sequence_Maybe(context, (Maybe) semanticObject); 
					return; 
				}
				else break;
			case DTDSLPackage.OBJECT_ATTRIBUTE:
				if(context == grammarAccess.getObjectAttributeRule() ||
				   context == grammarAccess.getObjectDescriptionInnerRule()) {
					sequence_ObjectAttribute(context, (ObjectAttribute) semanticObject); 
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
			case DTDSLPackage.OBJECT_NEXT:
				if(context == grammarAccess.getObjectDescriptionInnerRule() ||
				   context == grammarAccess.getObjectNextRule()) {
					sequence_ObjectNext(context, (ObjectNext) semanticObject); 
					return; 
				}
				else break;
			case DTDSLPackage.START_POINT:
				if(context == grammarAccess.getStartPointRule()) {
					sequence_StartPoint(context, (StartPoint) semanticObject); 
					return; 
				}
				else break;
			case DTDSLPackage.IMPORT_STATEMENT:
				if(context == grammarAccess.getImportStatementRule()) {
					sequence_importStatement(context, (importStatement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (options+=Keyword options+=Keyword*)
	 */
	protected void sequence_Choice(EObject context, Choice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parserName=STRING (type='javaObject' | type='string') objDescription+=Abstract* imports+=importStatement* start=StartPoint)
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
	 *     (description+=ObjectDescriptionInner*)
	 */
	protected void sequence_Many(EObject context, Many semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (object=Abstract | id=[ObjectDescription|ID])
	 */
	protected void sequence_Maybe(EObject context, Maybe semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attributes=ID ((types=Type keyword=Keyword) | inner=[ObjectDescription|ID]))
	 */
	protected void sequence_ObjectAttribute(EObject context, ObjectAttribute semanticObject) {
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
	 *     begin=[ObjectDescription|ID]
	 */
	protected void sequence_StartPoint(EObject context, StartPoint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DTDSLPackage.Literals.START_POINT__BEGIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DTDSLPackage.Literals.START_POINT__BEGIN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStartPointAccess().getBeginObjectDescriptionIDTerminalRuleCall_2_0_1(), semanticObject.getBegin());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importClass=ID
	 */
	protected void sequence_importStatement(EObject context, importStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DTDSLPackage.Literals.IMPORT_STATEMENT__IMPORT_CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DTDSLPackage.Literals.IMPORT_STATEMENT__IMPORT_CLASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportStatementAccess().getImportClassIDTerminalRuleCall_1_0(), semanticObject.getImportClass());
		feeder.finish();
	}
}
