package de.wbg.StringClasses;

import com.google.common.base.Objects;
import de.wbg.StringClasses.ChainString;
import de.wbg.dTDSL.StringDescriptionInner;
import de.wbg.dTDSL.StringKey;
import de.wbg.dTDSL.StringOverRead;
import de.wbg.generator.DTDSLGenerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ChainStringKeyRef extends ChainString {
  public ChainStringKeyRef(final DTDSLGenerator g) {
    super(g);
  }
  
  public boolean handle(final int index, final StringDescriptionInner i) {
    StringKey _keyRef = i.getKeyRef();
    boolean _notEquals = (!Objects.equal(_keyRef, null));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("//keyRef ");
      StringKey _keyRef_1 = i.getKeyRef();
      _builder.append(_keyRef_1, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("Node storedValue = this.stringKeyVariables.get(\"");
      StringKey _keyRef_2 = i.getKeyRef();
      String _name = _keyRef_2.getName();
      _builder.append(_name, "\t\t\t");
      _builder.append("\");\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("if (storedValue == null)");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("throw new ParserException(\"Variable is not exsisting\");");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("else");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("//Wert der gespeicherten Variable mit dem geparsten Wert überprüfen");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      CharSequence _xifexpression = null;
      EObject _eContainer = i.eContainer();
      int _descriptionSize = this.getDescriptionSize(_eContainer);
      int _minus = (_descriptionSize - 1);
      boolean _equals = (index == _minus);
      if (_equals) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("String value = scanner.scanUpToSpace();");
        _xifexpression = _builder_1;
      } else {
        CharSequence _xblockexpression = null;
        {
          EObject _eContainer_1 = i.eContainer();
          StringDescriptionInner temp = this.getDescriptionObjectGet(_eContainer_1, (index + 1));
          CharSequence _xifexpression_1 = null;
          if ((temp instanceof StringOverRead)) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("String value = scanner.scanUpToString(\"");
            String _overRead = ((StringOverRead)temp).getOverRead();
            _builder_2.append(_overRead, "");
            _builder_2.append("\");");
            _xifexpression_1 = _builder_2;
          } else {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("//this case is not implemented yet -> scan value, no next");
            _xifexpression_1 = _builder_3;
          }
          _xblockexpression = _xifexpression_1;
        }
        _xifexpression = _xblockexpression;
      }
      _builder.append(_xifexpression, "\t\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      _builder.append("if (!value.equals(storedValue.getValue()))");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("throw new ParserException(\"Different key values are not allowed at this context\");");
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
      _builder.append("\t");
      _builder.newLine();
      this.setReturnValue(_builder);
      return true;
    }
    return false;
  }
}
