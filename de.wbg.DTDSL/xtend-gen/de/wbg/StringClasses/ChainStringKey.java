package de.wbg.StringClasses;

import com.google.common.base.Objects;
import de.wbg.StringClasses.ChainString;
import de.wbg.dTDSL.StringDescriptionInVariable;
import de.wbg.dTDSL.StringDescriptionInner;
import de.wbg.dTDSL.StringKey;
import de.wbg.dTDSL.StringOverRead;
import de.wbg.generator.DTDSLGenerator;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ChainStringKey extends ChainString {
  public ChainStringKey(final DTDSLGenerator g) {
    super(g);
  }
  
  public boolean handle(final int index, final StringDescriptionInner i) {
    if ((i instanceof StringKey)) {
      String _name = ((StringKey)i).getName();
      boolean _notEquals = (!Objects.equal(_name, null));
      if (_notEquals) {
        DTDSLGenerator _generator = this.getGenerator();
        HashMap<String, Object> keyContainer = _generator.getKeyContainer();
        String _name_1 = ((StringKey)i).getName();
        keyContainer.put(_name_1, i);
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("//parseKey ");
      String _xifexpression = null;
      String _name_2 = ((StringKey)i).getName();
      boolean _notEquals_1 = (!Objects.equal(_name_2, null));
      if (_notEquals_1) {
        String _xblockexpression = null;
        {
          DTDSLGenerator _generator_1 = this.getGenerator();
          _generator_1.setNeedStringKeyStore(true);
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
            CharSequence _xifexpression_3 = null;
            String _type = ((StringKey)i).getType();
            boolean _notEquals_2 = (!Objects.equal(_type, "String"));
            if (_notEquals_2) {
              StringConcatenation _builder_2 = new StringConcatenation();
              String _type_1 = ((StringKey)i).getType();
              _builder_2.append(_type_1, "");
              _builder_2.append(" key = scanner.scanUpToStringAs");
              String _type_2 = ((StringKey)i).getType();
              String _firstUpper = StringExtensions.toFirstUpper(_type_2);
              _builder_2.append(_firstUpper, "");
              _builder_2.append("(\"");
              String _overRead = ((StringOverRead)temp).getOverRead();
              _builder_2.append(_overRead, "");
              _builder_2.append("\");");
              _xifexpression_3 = _builder_2;
            } else {
              StringConcatenation _builder_3 = new StringConcatenation();
              _builder_3.append("String key = scanner.scanUpToString(\"");
              String _overRead_1 = ((StringOverRead)temp).getOverRead();
              _builder_3.append(_overRead_1, "");
              _builder_3.append("\");");
              _xifexpression_3 = _builder_3;
            }
            _xifexpression_2 = _xifexpression_3;
          } else {
            CharSequence _xifexpression_4 = null;
            if ((temp instanceof StringDescriptionInVariable)) {
              CharSequence _xblockexpression_2 = null;
              {
                EList<EObject> _eContents = ((StringDescriptionInVariable)temp).eContents();
                EObject next = _eContents.get(0);
                CharSequence _xifexpression_5 = null;
                boolean _and = false;
                boolean _notEquals_3 = (!Objects.equal(next, null));
                if (!_notEquals_3) {
                  _and = false;
                } else {
                  _and = (next instanceof StringOverRead);
                }
                if (_and) {
                  StringConcatenation _builder_4 = new StringConcatenation();
                  _builder_4.append("String key = scanner.scanUpToString(\"");
                  String _overRead_2 = ((StringOverRead) next).getOverRead();
                  _builder_4.append(_overRead_2, "");
                  _builder_4.append("\")");
                  _xifexpression_5 = _builder_4;
                }
                _xblockexpression_2 = _xifexpression_5;
              }
              _xifexpression_4 = _xblockexpression_2;
            } else {
              CharSequence _xifexpression_5 = null;
              boolean _equals_1 = Objects.equal(temp, null);
              if (_equals_1) {
                StringConcatenation _builder_4 = new StringConcatenation();
                _builder_4.append("String key = scanner.scanUpToEnd();");
                _xifexpression_5 = _builder_4;
              } else {
                StringConcatenation _builder_5 = new StringConcatenation();
                _builder_5.append("//this case is not implemented yet -> scan key, no next -> ");
                Class<? extends StringDescriptionInner> _class = temp.getClass();
                _builder_5.append(_class, "");
                _xifexpression_5 = _builder_5;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_2 = _xifexpression_4;
          }
          _xblockexpression_1 = _xifexpression_2;
        }
        _xifexpression_1 = _xblockexpression_1;
      }
      _builder.append(_xifexpression_1, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("stringNode.setValueClass(");
      String _type = ((StringKey)i).getType();
      _builder.append(_type, "\t\t\t");
      _builder.append(".class);");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("stringNode.setValue(key);");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("stringNode.setKey(true);");
      _builder.newLine();
      {
        String _name_3 = ((StringKey)i).getName();
        boolean _notEquals_2 = (!Objects.equal(_name_3, null));
        if (_notEquals_2) {
          _builder.append("\t\t\t");
          _builder.append("this.stringKeyVariables.put(\"");
          String _name_4 = ((StringKey)i).getName();
          _builder.append(_name_4, "\t\t\t");
          _builder.append("\", stringNode);");
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
