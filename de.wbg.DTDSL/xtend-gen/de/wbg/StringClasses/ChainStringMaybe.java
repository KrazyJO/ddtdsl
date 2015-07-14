package de.wbg.StringClasses;

import com.google.common.base.Objects;
import de.wbg.StringClasses.ChainString;
import de.wbg.StringClasses.ChainStringKey;
import de.wbg.StringClasses.ChainStringKeyRef;
import de.wbg.StringClasses.ChainStringOr;
import de.wbg.StringClasses.ChainStringReadOver;
import de.wbg.StringClasses.ChainStringValue;
import de.wbg.dTDSL.StringComplex;
import de.wbg.dTDSL.StringDescription;
import de.wbg.dTDSL.StringDescriptionInVariable;
import de.wbg.dTDSL.StringDescriptionInner;
import de.wbg.generator.DTDSLGenerator;
import java.util.LinkedList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ChainStringMaybe extends ChainString {
  private LinkedList<ChainString> handlerList;
  
  public ChainStringMaybe(final DTDSLGenerator g) {
    super(g);
  }
  
  @Override
  public boolean handle(final int index, final StringDescriptionInner i) {
    if ((i instanceof StringComplex)) {
      String _maybe = ((StringComplex)i).getMaybe();
      boolean _notEquals = (!Objects.equal(_maybe, null));
      if (_notEquals) {
        StringDescription stringDescription = this.goUpToStringDescription(i);
        this.initMessageHandler();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\t\t\t");
        _builder.append("{ //maybe");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("int scannerPosition = scanner.getPosition();");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("Head maybeHead = new Head(\"none\");");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("maybeHead.setNodeNumber(n.getNodeNumber());");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("maybeHead.setAttributeNumber(n.getAttributeNumber());");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("try ");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("parse");
        String _name = stringDescription.getName();
        _builder.append(_name, "\t\t\t\t\t");
        _builder.append("Option");
        StringDescriptionInVariable _name_1 = ((StringComplex)i).getName();
        String _name_2 = _name_1.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_2);
        _builder.append(_firstUpper, "\t\t\t\t\t");
        _builder.append("(maybeHead);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("for (Element el : maybeHead.getChildren())");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t");
        _builder.append("n.addChild(el);");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t");
        _builder.append("el.setParent(n);");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t");
        _builder.append("maybeHead.removeChild(el);");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("n.setNodeNumber(maybeHead.getNodeNumber());");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("n.setAttributeNumber(maybeHead.getAttributeNumber());");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("catch (Exception e)");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("throw e;");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.newLine();
        String ret = _builder.toString();
        this.setReturnValue(ret);
        return true;
      }
    }
    return false;
  }
  
  public void initMessageHandler() {
    LinkedList<ChainString> _linkedList = new LinkedList<ChainString>();
    this.handlerList = _linkedList;
    DTDSLGenerator _generator = this.getGenerator();
    ChainStringKey _chainStringKey = new ChainStringKey(_generator);
    this.handlerList.add(_chainStringKey);
    DTDSLGenerator _generator_1 = this.getGenerator();
    ChainStringKeyRef _chainStringKeyRef = new ChainStringKeyRef(_generator_1);
    this.handlerList.add(_chainStringKeyRef);
    DTDSLGenerator _generator_2 = this.getGenerator();
    ChainStringReadOver _chainStringReadOver = new ChainStringReadOver(_generator_2);
    this.handlerList.add(_chainStringReadOver);
    DTDSLGenerator _generator_3 = this.getGenerator();
    ChainStringValue _chainStringValue = new ChainStringValue(_generator_3);
    this.handlerList.add(_chainStringValue);
    DTDSLGenerator _generator_4 = this.getGenerator();
    ChainStringOr _chainStringOr = new ChainStringOr(_generator_4);
    this.handlerList.add(_chainStringOr);
    DTDSLGenerator _generator_5 = this.getGenerator();
    ChainStringMaybe _chainStringMaybe = new ChainStringMaybe(_generator_5);
    this.handlerList.add(_chainStringMaybe);
  }
  
  public StringDescription goUpToStringDescription(final Object o) {
    if ((o instanceof StringDescription)) {
      return ((StringDescription) o);
    } else {
      if ((o instanceof StringDescriptionInVariable)) {
        EObject _eContainer = ((StringDescriptionInVariable) o).eContainer();
        return this.goUpToStringDescription(_eContainer);
      } else {
        if ((o instanceof StringDescriptionInner)) {
          EObject _eContainer_1 = ((StringDescriptionInner) o).eContainer();
          return this.goUpToStringDescription(_eContainer_1);
        }
      }
    }
    return null;
  }
}
