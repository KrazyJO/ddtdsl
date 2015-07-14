package de.wbg.StringClasses;

import com.google.common.base.Objects;
import de.wbg.StringClasses.ChainString;
import de.wbg.dTDSL.StringDescriptionInner;
import de.wbg.dTDSL.StringKey;
import de.wbg.dTDSL.StringOverRead;
import de.wbg.generator.DTDSLGenerator;
import java.util.HashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ChainStringKeyRef extends ChainString {
  public ChainStringKeyRef(final DTDSLGenerator g) {
    super(g);
  }
  
  @Override
  public boolean handle(final int index, final StringDescriptionInner i) {
    StringKey _keyRef = i.getKeyRef();
    boolean _notEquals = (!Objects.equal(_keyRef, null));
    if (_notEquals) {
      DTDSLGenerator _generator = this.getGenerator();
      HashMap<String, Object> keyContainer = _generator.getKeyContainer();
      StringKey _keyRef_1 = i.getKeyRef();
      String _name = _keyRef_1.getName();
      Object _get = keyContainer.get(_name);
      StringKey keyDescription = ((StringKey) _get);
      String type = keyDescription.getType();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("//keyRef ");
      StringKey _keyRef_2 = i.getKeyRef();
      _builder.append(_keyRef_2, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("Node storedValue = this.stringKeyVariables.get(\"");
      StringKey _keyRef_3 = i.getKeyRef();
      String _name_1 = _keyRef_3.getName();
      _builder.append(_name_1, "\t\t\t");
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
        CharSequence _xifexpression_1 = null;
        boolean _notEquals_1 = (!Objects.equal(type, null));
        if (_notEquals_1) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(type, "");
          _builder_1.append(" value = scanner.scanUpToSpace();");
          _xifexpression_1 = _builder_1;
        } else {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("String value = scanner.scanUpToSpace();");
          _xifexpression_1 = _builder_2;
        }
        _xifexpression = _xifexpression_1;
      } else {
        CharSequence _xblockexpression = null;
        {
          EObject _eContainer_1 = i.eContainer();
          StringDescriptionInner temp = this.getDescriptionObjectGet(_eContainer_1, (index + 1));
          CharSequence _xifexpression_2 = null;
          if ((temp instanceof StringOverRead)) {
            CharSequence _xifexpression_3 = null;
            boolean _notEquals_2 = (!Objects.equal(type, "String"));
            if (_notEquals_2) {
              StringConcatenation _builder_3 = new StringConcatenation();
              _builder_3.append(type, "");
              _builder_3.append(" value = scanner.scanUpToStringAs");
              String _firstUpper = StringExtensions.toFirstUpper(type);
              _builder_3.append(_firstUpper, "");
              _builder_3.append("(\"");
              String _overRead = ((StringOverRead)temp).getOverRead();
              _builder_3.append(_overRead, "");
              _builder_3.append("\");");
              _xifexpression_3 = _builder_3;
            } else {
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append("String value = scanner.scanUpToString(\"");
              String _overRead_1 = ((StringOverRead)temp).getOverRead();
              _builder_4.append(_overRead_1, "");
              _builder_4.append("\");");
              _xifexpression_3 = _builder_4;
            }
            _xifexpression_2 = _xifexpression_3;
          } else {
            StringConcatenation _builder_5 = new StringConcatenation();
            _builder_5.append("//this case is not implemented yet -> scan value, no next");
            _xifexpression_2 = _builder_5;
          }
          _xblockexpression = _xifexpression_2;
        }
        _xifexpression = _xblockexpression;
      }
      _builder.append(_xifexpression, "\t\t\t\t");
      _builder.newLineIfNotEmpty();
      {
        boolean _notEquals_2 = (!Objects.equal(type, "String"));
        if (_notEquals_2) {
          _builder.append("\t\t\t\t");
          _builder.append("if (value != (");
          _builder.append(type, "\t\t\t\t");
          _builder.append(")storedValue.getValue())");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("\t\t\t\t");
          _builder.append("if (!value.equals(String.valueOf(storedValue.getValue())))");
          _builder.newLine();
        }
      }
      _builder.append("\t\t\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("throw new ParserException(\"Different key values are not allowed at this context\");");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t");
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
