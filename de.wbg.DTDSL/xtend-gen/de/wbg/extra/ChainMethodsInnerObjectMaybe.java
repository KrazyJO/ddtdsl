package de.wbg.extra;

import com.google.common.base.Objects;
import de.wbg.dTDSL.ObjectAttribute;
import de.wbg.dTDSL.ObjectDescription;
import de.wbg.dTDSL.ObjectDescriptionInner;
import de.wbg.dTDSL.ObjectMaybe;
import de.wbg.dTDSL.ObjectMaybeInner;
import de.wbg.dTDSL.ObjectNext;
import de.wbg.dTDSL.ObjectNode;
import de.wbg.extra.ChainMethodsInner;
import de.wbg.generator.DTDSLGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ChainMethodsInnerObjectMaybe extends ChainMethodsInner {
  private DTDSLGenerator generator;
  
  public ChainMethodsInnerObjectMaybe(final DTDSLGenerator g) {
    this.generator = g;
  }
  
  public boolean handle(final ObjectDescription d, final ObjectDescriptionInner i) {
    boolean _xblockexpression = false;
    {
      if ((i instanceof ObjectMaybe)) {
        ObjectMaybeInner _description = ((ObjectMaybe)i).getDescription();
        boolean _notEquals = (!Objects.equal(_description, null));
        if (_notEquals) {
          ObjectMaybeInner inner = ((ObjectMaybe)i).getDescription();
          if ((inner instanceof ObjectAttribute)) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("\t");
            _builder.append("public void parseMaybe");
            String _name = d.getName();
            String _firstUpper = StringExtensions.toFirstUpper(_name);
            _builder.append(_firstUpper, "\t");
            _builder.append("Attribute");
            String _attributes = ((ObjectAttribute)inner).getAttributes();
            String _firstUpper_1 = StringExtensions.toFirstUpper(_attributes);
            _builder.append(_firstUpper_1, "\t");
            _builder.append("(Object o, Element n) throws Exception");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("{");
            _builder.newLine();
            this.setReturnValue(_builder);
          } else {
            if ((inner instanceof ObjectNext)) {
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("\t");
              _builder_1.append("public void parse");
              String _name_1 = d.getName();
              String _firstUpper_2 = StringExtensions.toFirstUpper(_name_1);
              _builder_1.append(_firstUpper_2, "\t");
              ObjectDescription _objectDesription = ((ObjectNext)inner).getObjectDesription();
              String _name_2 = _objectDesription.getName();
              String _firstUpper_3 = StringExtensions.toFirstUpper(_name_2);
              _builder_1.append(_firstUpper_3, "\t");
              _builder_1.append("(Object o, Element n) throws Exception");
              _builder_1.newLineIfNotEmpty();
              _builder_1.append("\t");
              _builder_1.append("{");
              _builder_1.newLine();
              this.setReturnValue(_builder_1);
            } else {
              if ((inner instanceof ObjectNode)) {
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append("\t");
                _builder_2.append("public void parseMaybe");
                String _name_3 = d.getName();
                String _firstUpper_4 = StringExtensions.toFirstUpper(_name_3);
                _builder_2.append(_firstUpper_4, "\t");
                String _attributes_1 = ((ObjectNode)inner).getAttributes();
                String _firstUpper_5 = StringExtensions.toFirstUpper(_attributes_1);
                _builder_2.append(_firstUpper_5, "\t");
                _builder_2.append("(Object o, Element n) throws Exception");
                _builder_2.newLineIfNotEmpty();
                _builder_2.append("\t");
                _builder_2.append("{");
                _builder_2.newLine();
                this.setReturnValue(_builder_2);
              }
            }
          }
          ObjectMaybeInner _description_1 = ((ObjectMaybe)i).getDescription();
          boolean _notEquals_1 = (!Objects.equal(_description_1, null));
          if (_notEquals_1) {
            ObjectMaybeInner innerDescription = ((ObjectMaybe)i).getDescription();
            if ((innerDescription instanceof ObjectNode)) {
              CharSequence _returnValue = this.getReturnValue();
              StringConcatenation _builder_3 = new StringConcatenation();
              String _plus = (_returnValue + _builder_3.toString());
              CharSequence _compile = this.generator.compile(((ObjectNode)innerDescription));
              String _plus_1 = (_plus + _compile);
              this.setReturnValue(_plus_1);
            } else {
              if ((innerDescription instanceof ObjectAttribute)) {
                CharSequence _returnValue_1 = this.getReturnValue();
                StringConcatenation _builder_4 = new StringConcatenation();
                String _plus_2 = (_returnValue_1 + _builder_4.toString());
                CharSequence _compile_1 = this.generator.compile(((ObjectAttribute)innerDescription));
                String _plus_3 = (_plus_2 + _compile_1);
                this.setReturnValue(_plus_3);
              } else {
                if ((innerDescription instanceof ObjectNext)) {
                  CharSequence _returnValue_2 = this.getReturnValue();
                  StringConcatenation _builder_5 = new StringConcatenation();
                  String _plus_4 = (_returnValue_2 + _builder_5.toString());
                  CharSequence _compile_2 = this.generator.compile(((ObjectNext)innerDescription));
                  String _plus_5 = (_plus_4 + _compile_2);
                  this.setReturnValue(_plus_5);
                }
              }
            }
          }
          CharSequence _returnValue_3 = this.getReturnValue();
          StringConcatenation _builder_6 = new StringConcatenation();
          _builder_6.append("\t\t");
          _builder_6.append("///maybe");
          _builder_6.newLine();
          _builder_6.append("\t");
          _builder_6.append("}");
          _builder_6.newLine();
          String _plus_6 = (_returnValue_3 + _builder_6.toString());
          this.setReturnValue(_plus_6);
        }
      } else {
        return false;
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
}
