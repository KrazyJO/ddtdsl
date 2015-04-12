/*
* generated by Xtext
*/
package de.wbg.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.wbg.services.DTDSLGrammarAccess;

public class DTDSLParser extends AbstractContentAssistParser {
	
	@Inject
	private DTDSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.wbg.ui.contentassist.antlr.internal.InternalDTDSLParser createParser() {
		de.wbg.ui.contentassist.antlr.internal.InternalDTDSLParser result = new de.wbg.ui.contentassist.antlr.internal.InternalDTDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStartPointAccess().getAlternatives(), "rule__StartPoint__Alternatives");
					put(grammarAccess.getAbstractAccess().getAlternatives(), "rule__Abstract__Alternatives");
					put(grammarAccess.getStringDescriptionInnerAccess().getAlternatives(), "rule__StringDescriptionInner__Alternatives");
					put(grammarAccess.getStringComplexAccess().getAlternatives_1(), "rule__StringComplex__Alternatives_1");
					put(grammarAccess.getObjectDescriptionInnerAccess().getAlternatives_0(), "rule__ObjectDescriptionInner__Alternatives_0");
					put(grammarAccess.getJavaCodeOrIDAccess().getAlternatives(), "rule__JavaCodeOrID__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getObjectMaybeAccess().getAlternatives(), "rule__ObjectMaybe__Alternatives");
					put(grammarAccess.getObjectMaybeInnerAccess().getAlternatives(), "rule__ObjectMaybeInner__Alternatives");
					put(grammarAccess.getDTDSLAccess().getGroup(), "rule__DTDSL__Group__0");
					put(grammarAccess.getStartPointAccess().getGroup_0(), "rule__StartPoint__Group_0__0");
					put(grammarAccess.getStartPointAccess().getGroup_1(), "rule__StartPoint__Group_1__0");
					put(grammarAccess.getStringDescriptionAccess().getGroup(), "rule__StringDescription__Group__0");
					put(grammarAccess.getStringKeyAccess().getGroup(), "rule__StringKey__Group__0");
					put(grammarAccess.getStringKeyAccess().getGroup_1(), "rule__StringKey__Group_1__0");
					put(grammarAccess.getStringValueAccess().getGroup(), "rule__StringValue__Group__0");
					put(grammarAccess.getStringValueAccess().getGroup_1(), "rule__StringValue__Group_1__0");
					put(grammarAccess.getStringValueAccess().getGroup_5(), "rule__StringValue__Group_5__0");
					put(grammarAccess.getStringOrAccess().getGroup(), "rule__StringOr__Group__0");
					put(grammarAccess.getStringOrAccess().getGroup_4(), "rule__StringOr__Group_4__0");
					put(grammarAccess.getStringDescriptionInVariableAccess().getGroup(), "rule__StringDescriptionInVariable__Group__0");
					put(grammarAccess.getStringComplexAccess().getGroup(), "rule__StringComplex__Group__0");
					put(grammarAccess.getObjectDescriptionAccess().getGroup(), "rule__ObjectDescription__Group__0");
					put(grammarAccess.getObjectDescriptionInnerAccess().getGroup(), "rule__ObjectDescriptionInner__Group__0");
					put(grammarAccess.getObjectAttributeAccess().getGroup(), "rule__ObjectAttribute__Group__0");
					put(grammarAccess.getObjectAttributeAccess().getGroup_2(), "rule__ObjectAttribute__Group_2__0");
					put(grammarAccess.getObjectNodeAccess().getGroup(), "rule__ObjectNode__Group__0");
					put(grammarAccess.getObjectNextAccess().getGroup(), "rule__ObjectNext__Group__0");
					put(grammarAccess.getJavaCodeOrIDAccess().getGroup_0(), "rule__JavaCodeOrID__Group_0__0");
					put(grammarAccess.getObjectManyAccess().getGroup(), "rule__ObjectMany__Group__0");
					put(grammarAccess.getObjectChoiceAccess().getGroup(), "rule__ObjectChoice__Group__0");
					put(grammarAccess.getObjectChoiceAccess().getGroup_2(), "rule__ObjectChoice__Group_2__0");
					put(grammarAccess.getObjectMaybeAccess().getGroup_1(), "rule__ObjectMaybe__Group_1__0");
					put(grammarAccess.getDTDSLAccess().getParserNameAssignment_2(), "rule__DTDSL__ParserNameAssignment_2");
					put(grammarAccess.getDTDSLAccess().getObjDescriptionAssignment_4(), "rule__DTDSL__ObjDescriptionAssignment_4");
					put(grammarAccess.getDTDSLAccess().getStartAssignment_5(), "rule__DTDSL__StartAssignment_5");
					put(grammarAccess.getStartPointAccess().getBeginAssignment_0_2(), "rule__StartPoint__BeginAssignment_0_2");
					put(grammarAccess.getStartPointAccess().getBeginAssignment_1_0(), "rule__StartPoint__BeginAssignment_1_0");
					put(grammarAccess.getStringDescriptionAccess().getNameAssignment_1(), "rule__StringDescription__NameAssignment_1");
					put(grammarAccess.getStringDescriptionAccess().getDescriptionAssignment_4(), "rule__StringDescription__DescriptionAssignment_4");
					put(grammarAccess.getStringDescriptionInnerAccess().getKeyRefAssignment_3(), "rule__StringDescriptionInner__KeyRefAssignment_3");
					put(grammarAccess.getStringOverReadAccess().getOverReadAssignment(), "rule__StringOverRead__OverReadAssignment");
					put(grammarAccess.getStringKeyAccess().getNameAssignment_1_0(), "rule__StringKey__NameAssignment_1_0");
					put(grammarAccess.getStringKeyAccess().getTypeAssignment_4(), "rule__StringKey__TypeAssignment_4");
					put(grammarAccess.getStringValueAccess().getNameAssignment_1_0(), "rule__StringValue__NameAssignment_1_0");
					put(grammarAccess.getStringValueAccess().getTypeAssignment_4(), "rule__StringValue__TypeAssignment_4");
					put(grammarAccess.getStringValueAccess().getToKeyAssignment_5_1(), "rule__StringValue__ToKeyAssignment_5_1");
					put(grammarAccess.getStringOrAccess().getOptionAssignment_3(), "rule__StringOr__OptionAssignment_3");
					put(grammarAccess.getStringOrAccess().getOptionAssignment_4_1(), "rule__StringOr__OptionAssignment_4_1");
					put(grammarAccess.getStringDescriptionInVariableAccess().getNameAssignment_0(), "rule__StringDescriptionInVariable__NameAssignment_0");
					put(grammarAccess.getStringDescriptionInVariableAccess().getDescriptionAssignment_3(), "rule__StringDescriptionInVariable__DescriptionAssignment_3");
					put(grammarAccess.getStringComplexAccess().getNameAssignment_0(), "rule__StringComplex__NameAssignment_0");
					put(grammarAccess.getStringComplexAccess().getManyAssignment_1_0(), "rule__StringComplex__ManyAssignment_1_0");
					put(grammarAccess.getStringComplexAccess().getMaybeAssignment_1_1(), "rule__StringComplex__MaybeAssignment_1_1");
					put(grammarAccess.getObjectDescriptionAccess().getNameAssignment_1(), "rule__ObjectDescription__NameAssignment_1");
					put(grammarAccess.getObjectDescriptionAccess().getDescriptionAssignment_4(), "rule__ObjectDescription__DescriptionAssignment_4");
					put(grammarAccess.getObjectAttributeAccess().getAttributesAssignment_1(), "rule__ObjectAttribute__AttributesAssignment_1");
					put(grammarAccess.getObjectAttributeAccess().getStringMethodeAssignment_2_1(), "rule__ObjectAttribute__StringMethodeAssignment_2_1");
					put(grammarAccess.getObjectNodeAccess().getAttributesAssignment_1(), "rule__ObjectNode__AttributesAssignment_1");
					put(grammarAccess.getObjectNodeAccess().getInnerAssignment_3(), "rule__ObjectNode__InnerAssignment_3");
					put(grammarAccess.getObjectNextAccess().getAttributeAssignment_1(), "rule__ObjectNext__AttributeAssignment_1");
					put(grammarAccess.getObjectNextAccess().getObjectDesriptionAssignment_3(), "rule__ObjectNext__ObjectDesriptionAssignment_3");
					put(grammarAccess.getJavaCodeOrIDAccess().getCodeAssignment_0_2(), "rule__JavaCodeOrID__CodeAssignment_0_2");
					put(grammarAccess.getJavaCodeOrIDAccess().getIdAssignment_1(), "rule__JavaCodeOrID__IdAssignment_1");
					put(grammarAccess.getObjectManyAccess().getOptionAssignment_0(), "rule__ObjectMany__OptionAssignment_0");
					put(grammarAccess.getObjectChoiceAccess().getOptionsAssignment_1(), "rule__ObjectChoice__OptionsAssignment_1");
					put(grammarAccess.getObjectChoiceAccess().getOptionsAssignment_2_1(), "rule__ObjectChoice__OptionsAssignment_2_1");
					put(grammarAccess.getObjectMaybeAccess().getOptionAssignment_0(), "rule__ObjectMaybe__OptionAssignment_0");
					put(grammarAccess.getObjectMaybeAccess().getDescriptionAssignment_1_0(), "rule__ObjectMaybe__DescriptionAssignment_1_0");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.wbg.ui.contentassist.antlr.internal.InternalDTDSLParser typedParser = (de.wbg.ui.contentassist.antlr.internal.InternalDTDSLParser) parser;
			typedParser.entryRuleDTDSL();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DTDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DTDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
