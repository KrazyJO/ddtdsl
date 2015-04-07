package de.wbg.StringClasses;

import de.wbg.StringClasses.ChainString;
import de.wbg.dTDSL.StringDescription;
import de.wbg.dTDSL.StringDescriptionInVariable;
import de.wbg.dTDSL.StringDescriptionInner;
import de.wbg.dTDSL.StringOr;
import de.wbg.generator.DTDSLGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ChainStringOr extends ChainString {
  public ChainStringOr(final DTDSLGenerator g) {
    super(g);
  }
  
  public boolean handle(final int index, final StringDescriptionInner i) {
    if ((i instanceof StringOr)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("int oldStringPosition = this.scanner.getPosition();");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("boolean optionFound = false;");
      _builder.newLine();
      {
        EList<StringDescriptionInVariable> _option = ((StringOr)i).getOption();
        for(final StringDescriptionInVariable o : _option) {
          _builder.append("\t\t\t");
          _builder.append("if (!optionFound)");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("{");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("\t");
          _builder.append("try");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("\t");
          _builder.append("{");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("\t\t");
          _builder.append("Head optionHead = new Head(\"OPTIONHEAD\");");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("\t\t");
          _builder.append("parse");
          EObject _eContainer = ((StringOr)i).eContainer();
          String _name = ((StringDescription) _eContainer).getName();
          _builder.append(_name, "\t\t\t\t\t");
          _builder.append("Option");
          String _name_1 = o.getName();
          _builder.append(_name_1, "\t\t\t\t\t");
          _builder.append("(optionHead);");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t");
          _builder.append("\t\t");
          _builder.append("optionFound = true;");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("\t");
          _builder.append("catch (ParserException e)");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("\t");
          _builder.append("{");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("\t\t");
          _builder.append("optionFound = false;");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("\t\t");
          _builder.append("scanner.resetToPosition(oldStringPosition);");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.newLine();
        }
      }
      _builder.append("\t\t\t");
      _builder.append("if (!optionFound)");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("throw new ParserException(\"no possible option found in stringobject ");
      EObject _eContainer_1 = ((StringOr)i).eContainer();
      String _descriptionName = this.getDescriptionName(_eContainer_1);
      _builder.append(_descriptionName, "\t\t\t\t");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      this.setReturnValue(_builder);
      return true;
    }
    return false;
  }
}
