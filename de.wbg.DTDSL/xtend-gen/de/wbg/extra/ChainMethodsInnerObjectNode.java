package de.wbg.extra;

import de.wbg.dTDSL.ObjectDescription;
import de.wbg.dTDSL.ObjectDescriptionInner;
import de.wbg.dTDSL.ObjectNode;
import de.wbg.extra.ChainMethodsInner;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ChainMethodsInnerObjectNode extends ChainMethodsInner {
  public boolean handle(final ObjectDescription d, final ObjectDescriptionInner i) {
    boolean _xblockexpression = false;
    {
      if ((i instanceof ObjectNode)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\t");
        _builder.append("public void parse");
        String _name = d.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "\t");
        String _attributes = ((ObjectNode)i).getAttributes();
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
        _builder_1.append(" ");
        _builder_1.append("//Node");
        _builder_1.newLine();
        String _plus = (_returnValue + _builder_1.toString());
        this.setReturnValue(_plus);
        CharSequence _returnValue_1 = this.getReturnValue();
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("try");
        _builder_2.newLine();
        _builder_2.append("{");
        _builder_2.newLine();
        _builder_2.append("\t");
        _builder_2.append("Field f = o.getClass().getDeclaredField(\"");
        String _attributes_1 = ((ObjectNode)i).getAttributes();
        _builder_2.append(_attributes_1, "\t");
        _builder_2.append("\");");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("\t");
        _builder_2.append("f.setAccessible(true);");
        _builder_2.newLine();
        _builder_2.append("\t");
        _builder_2.append("Object next = (Object) f.get(o);");
        _builder_2.newLine();
        _builder_2.append("\t");
        _builder_2.append("parse");
        ObjectDescription _inner = ((ObjectNode)i).getInner();
        String _name_1 = _inner.getName();
        String _firstUpper_2 = StringExtensions.toFirstUpper(_name_1);
        _builder_2.append(_firstUpper_2, "\t");
        _builder_2.append("(next, n);");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("}");
        _builder_2.newLine();
        _builder_2.append("catch(NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)");
        _builder_2.newLine();
        _builder_2.append("{");
        _builder_2.newLine();
        _builder_2.append("\t");
        _builder_2.append("throw new ParserException(\"Error while parsing ");
        String _attributes_2 = ((ObjectNode)i).getAttributes();
        _builder_2.append(_attributes_2, "\t");
        _builder_2.append(" in ");
        _builder_2.append(((ObjectNode)i), "\t");
        _builder_2.append("\");");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("}");
        _builder_2.newLine();
        _builder_2.append("catch (ParserException e)");
        _builder_2.newLine();
        _builder_2.append("{");
        _builder_2.newLine();
        _builder_2.append("\t");
        _builder_2.append("throw e;");
        _builder_2.newLine();
        _builder_2.append("}");
        _builder_2.newLine();
        _builder_2.append("\t\t\t");
        _builder_2.newLine();
        _builder_2.append("\t");
        _builder_2.append("}");
        _builder_2.newLine();
        String _plus_1 = (_returnValue_1 + _builder_2.toString());
        this.setReturnValue(_plus_1);
      } else {
        return false;
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
}
