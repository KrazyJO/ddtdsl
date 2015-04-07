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
public class ChainStringKey extends ChainString {
  public ChainStringKey(final DTDSLGenerator g) {
    super(g);
  }
  
  public boolean handle(final int index, final StringDescriptionInner i) {
    if ((i instanceof StringKey)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("//parseKey ");
      String _xifexpression = null;
      String _name = ((StringKey)i).getName();
      boolean _notEquals = (!Objects.equal(_name, null));
      if (_notEquals) {
        String _xblockexpression = null;
        {
          DTDSLGenerator _generator = this.getGenerator();
          _generator.setNeedStringKeyStore(true);
          _xblockexpression = ((StringKey)i).getName();
        }
        _xifexpression = _xblockexpression;
      }
      _builder.append(_xifexpression, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Node stringNode = new Node(n.getNameForNode());");
      _builder.newLine();
      _builder.append("\t\t\t");
      CharSequence _xifexpression_1 = null;
      EObject _eContainer = ((StringKey)i).eContainer();
      int _descriptionSize = this.getDescriptionSize(_eContainer);
      int _minus = (_descriptionSize - 1);
      boolean _equals = (index == _minus);
      if (_equals) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("String key = scanner.scanUpToSpace();");
        _xifexpression_1 = _builder_1;
      } else {
        CharSequence _xblockexpression_1 = null;
        {
          EObject _eContainer_1 = ((StringKey)i).eContainer();
          StringDescriptionInner temp = this.getDescriptionObjectGet(_eContainer_1, (index + 1));
          CharSequence _xifexpression_2 = null;
          if ((temp instanceof StringOverRead)) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("String key = scanner.scanUpToString(\"");
            String _overRead = ((StringOverRead)temp).getOverRead();
            _builder_2.append(_overRead, "");
            _builder_2.append("\");");
            _xifexpression_2 = _builder_2;
          } else {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("//this case is not implemented yet -> scan key, no next");
            _xifexpression_2 = _builder_3;
          }
          _xblockexpression_1 = _xifexpression_2;
        }
        _xifexpression_1 = _xblockexpression_1;
      }
      _builder.append(_xifexpression_1, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("stringNode.setValue(key);");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("stringNode.setKey(true);");
      _builder.newLine();
      {
        String _name_1 = ((StringKey)i).getName();
        boolean _notEquals_1 = (!Objects.equal(_name_1, null));
        if (_notEquals_1) {
          _builder.append("\t\t\t");
          _builder.append("this.stringKeyVariables.put(\"");
          String _name_2 = ((StringKey)i).getName();
          _builder.append(_name_2, "\t\t\t");
          _builder.append("\", key);");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("stringNode.setParent(n);");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("n.addChild(stringNode);");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("nodeForValue = stringNode;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      this.setReturnValue(_builder);
      return true;
    }
    return false;
  }
}
