package de.wbg.StringClasses;

import com.google.common.base.Objects;
import de.wbg.StringClasses.ChainString;
import de.wbg.dTDSL.StringComplex;
import de.wbg.dTDSL.StringDescription;
import de.wbg.dTDSL.StringDescriptionInVariable;
import de.wbg.dTDSL.StringDescriptionInner;
import de.wbg.generator.DTDSLGenerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ChainStringMany extends ChainString {
  public ChainStringMany(final DTDSLGenerator g) {
    super(g);
  }
  
  public boolean handle(final int index, final StringDescriptionInner i) {
    if ((i instanceof StringComplex)) {
      String _many = ((StringComplex)i).getMany();
      boolean _notEquals = (!Objects.equal(_many, null));
      if (_notEquals) {
        StringDescription stringDescription = null;
        Object o = ((StringComplex)i).eContainer();
        while ((!(o instanceof StringDescription))) {
          EObject _eContainer = ((StringComplex)i).eContainer();
          o = _eContainer;
        }
        stringDescription = ((StringDescription) o);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\t");
        _builder.append("{ //many");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("boolean runLoop = true;");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("int scannerPosition;");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("while (runLoop)");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("scannerPosition = scanner.getPosition();");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("try");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("Head manyHead = new Head(\"none\");");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("manyHead.setNodeNumber(n.getNodeNumber());");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("manyHead.setAttributeNumber(n.getAttributeNumber());");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
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
        _builder.append("(manyHead);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("for (Element el : manyHead.getChildren())");
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
        _builder.append("\t\t\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("n.setNodeNumber(manyHead.getNodeNumber());");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("n.setAttributeNumber(manyHead.getAttributeNumber());");
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
        _builder.append("runLoop = false;");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("scanner.resetToPosition(scannerPosition);");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        String ret = _builder.toString();
        this.setReturnValue(ret);
        return true;
      }
    }
    return false;
  }
}
