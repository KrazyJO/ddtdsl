package de.wbg.StringClasses;

import com.google.common.base.Objects;
import de.wbg.StringClasses.ChainString;
import de.wbg.dTDSL.StringDescriptionInner;
import de.wbg.dTDSL.StringOverRead;
import de.wbg.dTDSL.StringValue;
import de.wbg.generator.DTDSLGenerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ChainStringValue extends ChainString {
  public ChainStringValue(final DTDSLGenerator g) {
    super(g);
  }
  
  public boolean handle(final int index, final StringDescriptionInner i) {
    if ((i instanceof StringValue)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("//parseValue ");
      String _xifexpression = null;
      String _name = ((StringValue)i).getName();
      boolean _notEquals = (!Objects.equal(_name, null));
      if (_notEquals) {
        String _xblockexpression = null;
        {
          DTDSLGenerator _generator = this.getGenerator();
          _generator.setNeedStringValueStore(true);
          _xblockexpression = ((StringValue)i).getName();
        }
        _xifexpression = _xblockexpression;
      }
      _builder.append(_xifexpression, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Attribute valueAttrib = new Attribute(nodeForValue.getNameForAttribute());");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("valueAttrib.setType(String.class);");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("//parse Value");
      _builder.newLine();
      _builder.append("\t\t\t");
      CharSequence _xifexpression_1 = null;
      EObject _eContainer = ((StringValue)i).eContainer();
      int _descriptionSize = this.getDescriptionSize(_eContainer);
      int _minus = (_descriptionSize - 1);
      boolean _equals = (index == _minus);
      if (_equals) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("String value = scanner.scanUpToSpace();");
        _xifexpression_1 = _builder_1;
      } else {
        CharSequence _xblockexpression_1 = null;
        {
          EObject _eContainer_1 = ((StringValue)i).eContainer();
          StringDescriptionInner temp = this.getDescriptionObjectGet(_eContainer_1, (index + 1));
          CharSequence _xifexpression_2 = null;
          if ((temp instanceof StringOverRead)) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("String value = scanner.scanUpToString(\"");
            String _overRead = ((StringOverRead)temp).getOverRead();
            _builder_2.append(_overRead, "");
            _builder_2.append("\");");
            _xifexpression_2 = _builder_2;
          } else {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("//this case is not implemented yet -> scan value, no next");
            _xifexpression_2 = _builder_3;
          }
          _xblockexpression_1 = _xifexpression_2;
        }
        _xifexpression_1 = _xblockexpression_1;
      }
      _builder.append(_xifexpression_1, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("valueAttrib.setValue(value);");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("valueAttrib.setParent(nodeForValue);");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("nodeForValue.addChild(valueAttrib);");
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
