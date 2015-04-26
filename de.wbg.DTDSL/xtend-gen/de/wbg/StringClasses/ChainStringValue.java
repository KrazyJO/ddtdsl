package de.wbg.StringClasses;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import de.wbg.StringClasses.ChainString;
import de.wbg.dTDSL.StringComplex;
import de.wbg.dTDSL.StringDescriptionInVariable;
import de.wbg.dTDSL.StringDescriptionInner;
import de.wbg.dTDSL.StringKey;
import de.wbg.dTDSL.StringOverRead;
import de.wbg.dTDSL.StringValue;
import de.wbg.generator.DTDSLGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

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
      {
        StringKey _toKey = ((StringValue)i).getToKey();
        boolean _notEquals_1 = (!Objects.equal(_toKey, null));
        if (_notEquals_1) {
          _builder.append("\t\t\t");
          _builder.append("nodeForValue = this.stringKeyVariables.get(\"");
          StringKey _toKey_1 = ((StringValue)i).getToKey();
          String _name_1 = _toKey_1.getName();
          _builder.append(_name_1, "\t\t\t");
          _builder.append("\");");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t");
          _builder.newLine();
        }
      }
      _builder.append("\t\t\t");
      _builder.append("Attribute valueAttrib = new Attribute(nodeForValue.getNameForAttribute());");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("valueAttrib.setType(");
      String _type = ((StringValue)i).getType();
      _builder.append(_type, "\t\t\t");
      _builder.append(".class);");
      _builder.newLineIfNotEmpty();
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
            CharSequence _xifexpression_3 = null;
            String _type_1 = ((StringValue)i).getType();
            boolean _notEquals_2 = (!Objects.equal(_type_1, "String"));
            if (_notEquals_2) {
              StringConcatenation _builder_2 = new StringConcatenation();
              String _type_2 = ((StringValue)i).getType();
              _builder_2.append(_type_2, "");
              _builder_2.append(" value = scanner.scanUpToStringAs");
              String _type_3 = ((StringValue)i).getType();
              String _firstUpper = StringExtensions.toFirstUpper(_type_3);
              _builder_2.append(_firstUpper, "");
              _builder_2.append("(\"");
              String _overRead = ((StringOverRead)temp).getOverRead();
              _builder_2.append(_overRead, "");
              _builder_2.append("\");");
              _xifexpression_3 = _builder_2;
            } else {
              StringConcatenation _builder_3 = new StringConcatenation();
              _builder_3.append("String value = scanner.scanUpToString(\"");
              String _overRead_1 = ((StringOverRead)temp).getOverRead();
              _builder_3.append(_overRead_1, "");
              _builder_3.append("\");");
              _xifexpression_3 = _builder_3;
            }
            _xifexpression_2 = _xifexpression_3;
          } else {
            CharSequence _xifexpression_4 = null;
            if ((temp instanceof StringComplex)) {
              CharSequence _xblockexpression_2 = null;
              {
                String next = this.getNextElementFromComplex(((StringComplex)temp));
                CharSequence _xifexpression_5 = null;
                boolean _notEquals_3 = (!Objects.equal(next, null));
                if (_notEquals_3) {
                  CharSequence _xifexpression_6 = null;
                  boolean _equals_1 = Objects.equal(next, "");
                  if (_equals_1) {
                    StringConcatenation _builder_4 = new StringConcatenation();
                    _builder_4.append("String value = scanner.scanUpToSpace();");
                    _xifexpression_6 = _builder_4;
                  } else {
                    CharSequence _xifexpression_7 = null;
                    String _maybe = ((StringComplex)temp).getMaybe();
                    boolean _notEquals_4 = (!Objects.equal(_maybe, null));
                    if (_notEquals_4) {
                      StringConcatenation _builder_5 = new StringConcatenation();
                      _builder_5.append("String value = null;");
                      _builder_5.newLine();
                      _builder_5.append("{");
                      _builder_5.newLine();
                      _builder_5.append("\t");
                      _builder_5.append("int scannerPos = scanner.getPosition();");
                      _builder_5.newLine();
                      _builder_5.append("\t");
                      _builder_5.append("try");
                      _builder_5.newLine();
                      _builder_5.append("\t");
                      _builder_5.append("{");
                      _builder_5.newLine();
                      _builder_5.append("\t\t");
                      _builder_5.append("value = scanner.scanUpToString(\"");
                      _builder_5.append(next, "\t\t");
                      _builder_5.append("\");");
                      _builder_5.newLineIfNotEmpty();
                      _builder_5.append("\t");
                      _builder_5.append("}");
                      _builder_5.newLine();
                      _builder_5.append("\t");
                      _builder_5.append("catch (Exception e)");
                      _builder_5.newLine();
                      _builder_5.append("\t");
                      _builder_5.append("{");
                      _builder_5.newLine();
                      _builder_5.append("\t\t");
                      _builder_5.append("scanner.resetToPosition(scannerPos);");
                      _builder_5.newLine();
                      _builder_5.append("\t");
                      _builder_5.append("}");
                      _builder_5.newLine();
                      _builder_5.append("}");
                      _builder_5.newLine();
                      _builder_5.newLine();
                      _xifexpression_7 = _builder_5;
                    }
                    _xifexpression_6 = _xifexpression_7;
                  }
                  _xifexpression_5 = _xifexpression_6;
                } else {
                  StringConcatenation _builder_6 = new StringConcatenation();
                  _builder_6.append("String value = scanner.scanUpToEnd();");
                  _xifexpression_5 = _builder_6;
                }
                _xblockexpression_2 = _xifexpression_5;
              }
              _xifexpression_4 = _xblockexpression_2;
            } else {
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append("//this case is not implemented yet -> scan value, no next");
              _xifexpression_4 = _builder_4;
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
      _builder.newLine();
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
  
  public String getNextElementFromComplex(final StringComplex c) {
    String _xblockexpression = null;
    {
      Resource _eResource = c.eResource();
      TreeIterator<EObject> _allContents = _eResource.getAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
      Iterable<StringDescriptionInVariable> _filter = Iterables.<StringDescriptionInVariable>filter(_iterable, StringDescriptionInVariable.class);
      for (final StringDescriptionInVariable el : _filter) {
        String _name = el.getName();
        StringDescriptionInVariable _name_1 = c.getName();
        String _name_2 = _name_1.getName();
        boolean _equals = Objects.equal(_name, _name_2);
        if (_equals) {
          EList<EObject> _eContents = el.eContents();
          EObject n = _eContents.get(0);
          boolean _and = false;
          boolean _notEquals = (!Objects.equal(n, null));
          if (!_notEquals) {
            _and = false;
          } else {
            _and = (n instanceof StringOverRead);
          }
          if (_and) {
            return ((StringOverRead) n).getOverRead();
          } else {
            boolean _equals_1 = Objects.equal(n, null);
            if (_equals_1) {
              InputOutput.<String>println("found null");
              return null;
            } else {
              return "";
            }
          }
        }
      }
      _xblockexpression = InputOutput.<String>println("nicht das richtige dabei");
    }
    return _xblockexpression;
  }
}
