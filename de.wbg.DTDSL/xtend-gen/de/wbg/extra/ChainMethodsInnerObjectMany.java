package de.wbg.extra;

import de.wbg.dTDSL.ObjectAttribute;
import de.wbg.dTDSL.ObjectDescription;
import de.wbg.dTDSL.ObjectDescriptionInner;
import de.wbg.dTDSL.ObjectMany;
import de.wbg.dTDSL.ObjectMaybeInner;
import de.wbg.dTDSL.ObjectNext;
import de.wbg.dTDSL.ObjectNode;
import de.wbg.extra.ChainMethodsInner;
import de.wbg.generator.DTDSLGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ChainMethodsInnerObjectMany extends ChainMethodsInner {
  private DTDSLGenerator generator;
  
  public ChainMethodsInnerObjectMany(final DTDSLGenerator g) {
    this.generator = g;
  }
  
  public boolean handle(final ObjectDescription d, final ObjectDescriptionInner i) {
    boolean _xblockexpression = false;
    {
      if ((i instanceof ObjectMany)) {
        this.generator.setNeedGetInstanceGenerated(true);
        ObjectMaybeInner inner = ((ObjectMany)i).getOption();
        if ((inner instanceof ObjectAttribute)) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("\t");
          _builder.append("public void parseMany");
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
          _builder.append("\t\t");
          _builder.append("Attribute valueNode = new Attribute(\"attribute\" + n.increaseAttributeNumber());");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("valueNode.setType(o.getClass());");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("valueNode.setName(\"");
          String _attributes_1 = ((ObjectAttribute)inner).getAttributes();
          _builder.append(_attributes_1, "\t\t");
          _builder.append("\");");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("valueNode.setValue(o);");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("valueNode.setParent(n);");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("n.getChildren().add(valueNode);");
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
              _builder_2.append("public void parseMany");
              String _name_3 = d.getName();
              String _firstUpper_4 = StringExtensions.toFirstUpper(_name_3);
              _builder_2.append(_firstUpper_4, "\t");
              String _attributes_2 = ((ObjectNode)inner).getAttributes();
              String _firstUpper_5 = StringExtensions.toFirstUpper(_attributes_2);
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
        CharSequence _returnValue = this.getReturnValue();
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("\t\t");
        _builder_3.append("//many");
        _builder_3.newLine();
        _builder_3.append("\t");
        _builder_3.append("}");
        _builder_3.newLine();
        String _plus = (_returnValue + _builder_3.toString());
        this.setReturnValue(_plus);
      } else {
        return false;
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
}
