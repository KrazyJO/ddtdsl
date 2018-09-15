package de.wbg.extra;

import de.wbg.dTDSL.ObjectAttribute;
import de.wbg.dTDSL.ObjectDescription;
import de.wbg.dTDSL.ObjectDescriptionInner;
import de.wbg.extra.ChainMethodsInner;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ChainMethodsInnerObjectAttribute extends ChainMethodsInner {
  @Override
  public boolean handle(final ObjectDescription d, final ObjectDescriptionInner i) {
    boolean _xblockexpression = false;
    {
      if ((i instanceof ObjectAttribute)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\t");
        _builder.append("public void parse");
        String _name = d.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "\t");
        _builder.append("Attribute");
        String _attributes = ((ObjectAttribute)i).getAttributes();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_attributes);
        _builder.append(_firstUpper_1, "\t");
        _builder.append("(Object o, Element n) throws Exception");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("{");
        _builder.newLine();
        this.setReturnValue(_builder);
        CharSequence _returnValue = this.getReturnValue();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("\t\t");
        _builder_1.append("//Attribute");
        _builder_1.newLine();
        String _plus = (_returnValue + _builder_1.toString());
        this.setReturnValue(_plus);
        CharSequence _returnValue_1 = this.getReturnValue();
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("\t\t");
        _builder_2.append("//inner == null");
        _builder_2.newLine();
        String _plus_1 = (_returnValue_1 + _builder_2.toString());
        this.setReturnValue(_plus_1);
        CharSequence _returnValue_2 = this.getReturnValue();
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("\t\t");
        _builder_3.append("int oldAttributeNumber = n.getAttributeNumber();");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("try {");
        _builder_3.newLine();
        _builder_3.append("\t\t\t");
        _builder_3.newLine();
        _builder_3.append("\t\t\t");
        _builder_3.append("Field f = o.getClass().getDeclaredField(\"");
        String _attributes_1 = ((ObjectAttribute)i).getAttributes();
        _builder_3.append(_attributes_1, "\t\t\t");
        _builder_3.append("\"); //NoSuchFieldException");
        _builder_3.newLineIfNotEmpty();
        _builder_3.append("\t\t\t");
        _builder_3.append("f.setAccessible(true);");
        _builder_3.newLine();
        _builder_3.append("\t\t\t");
        _builder_3.append("Object iWantThis = f.get(o); //IllegalAccessException");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.newLine();
        _builder_3.append("\t\t\t");
        _builder_3.append("Attribute valueNode = new Attribute(\"attribute\" + n.increaseAttributeNumber());");
        _builder_3.newLine();
        _builder_3.append("\t\t\t");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.newLine();
        _builder_3.append("\t\t\t");
        _builder_3.append("valueNode.setName(\"");
        String _attributes_2 = ((ObjectAttribute)i).getAttributes();
        _builder_3.append(_attributes_2, "\t\t\t");
        _builder_3.append("\");");
        _builder_3.newLineIfNotEmpty();
        _builder_3.append("\t\t\t");
        _builder_3.append("valueNode.setValue(iWantThis);");
        _builder_3.newLine();
        _builder_3.append("\t\t\t");
        _builder_3.append("valueNode.setType(iWantThis.getClass());");
        _builder_3.newLine();
        _builder_3.append("\t\t\t");
        _builder_3.newLine();
        _builder_3.append("\t\t\t");
        _builder_3.append("valueNode.setParent(n);");
        _builder_3.newLine();
        _builder_3.append("\t\t\t");
        _builder_3.append("n.getChildren().add(valueNode);");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("}");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("{");
        _builder_3.newLine();
        _builder_3.append("\t\t\t");
        _builder_3.append("//e.printStackTrace();");
        _builder_3.newLine();
        _builder_3.append("\t\t\t");
        _builder_3.append("n.setAttributeNumber(oldAttributeNumber);");
        _builder_3.newLine();
        _builder_3.append("\t\t\t");
        _builder_3.append("throw new ParserException(\"Error while parsing : ");
        String _attributes_3 = ((ObjectAttribute)i).getAttributes();
        _builder_3.append(_attributes_3, "\t\t\t");
        _builder_3.append("\");");
        _builder_3.newLineIfNotEmpty();
        _builder_3.append("\t\t");
        _builder_3.append("}");
        _builder_3.newLine();
        _builder_3.append("\t");
        _builder_3.append("}");
        _builder_3.newLine();
        _builder_3.append("\t");
        _builder_3.newLine();
        String _plus_2 = (_returnValue_2 + _builder_3.toString());
        this.setReturnValue(_plus_2);
      } else {
        return false;
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
}
