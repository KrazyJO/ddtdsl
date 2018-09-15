package de.wbg.extra;

import com.google.common.base.Objects;
import de.wbg.dTDSL.JavaCodeOrID;
import de.wbg.dTDSL.ObjectDescription;
import de.wbg.dTDSL.ObjectDescriptionInner;
import de.wbg.dTDSL.ObjectNext;
import de.wbg.extra.ChainMethodsInner;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ChainMethodsInnerObjectNext extends ChainMethodsInner {
  @Override
  public boolean handle(final ObjectDescription d, final ObjectDescriptionInner i) {
    boolean _xblockexpression = false;
    {
      if ((i instanceof ObjectNext)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\t");
        _builder.append("public void parse");
        String _name = d.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "\t");
        ObjectDescription _objectDesription = ((ObjectNext)i).getObjectDesription();
        String _name_1 = _objectDesription.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
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
        _builder_1.append("//Next: ");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        CharSequence _xifexpression = null;
        JavaCodeOrID _attribute = ((ObjectNext)i).getAttribute();
        String _code = _attribute.getCode();
        boolean _equals = Objects.equal(_code, null);
        if (_equals) {
          String _xblockexpression_1 = null;
          {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("//kein code: ");
            JavaCodeOrID _attribute_1 = ((ObjectNext)i).getAttribute();
            String _id = _attribute_1.getId();
            _builder_2.append(_id, "");
            _builder_2.newLineIfNotEmpty();
            String ret = _builder_2.toString();
            String _ret = ret;
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("try {");
            _builder_3.newLine();
            _builder_3.append("\t");
            _builder_3.append("Field f = o.getClass().getDeclaredField(\"");
            JavaCodeOrID _attribute_2 = ((ObjectNext)i).getAttribute();
            String _id_1 = _attribute_2.getId();
            _builder_3.append(_id_1, "\t");
            _builder_3.append("\"); //NoSuchFieldException");
            _builder_3.newLineIfNotEmpty();
            _builder_3.append("\t");
            _builder_3.append("f.setAccessible(true);");
            _builder_3.newLine();
            _builder_3.append("\t");
            _builder_3.append("Object next = (Object) f.get(o); //IllegalAccessException");
            _builder_3.newLine();
            _builder_3.append("\t");
            _builder_3.newLine();
            _builder_3.append("\t");
            _builder_3.append("int nextVisit = System.identityHashCode(next);");
            _builder_3.newLine();
            _builder_3.append("\t");
            _builder_3.append("if (this.visited.contains(nextVisit))");
            _builder_3.newLine();
            _builder_3.append("\t");
            _builder_3.append("{");
            _builder_3.newLine();
            _builder_3.append("\t\t");
            _builder_3.append("return;");
            _builder_3.newLine();
            _builder_3.append("\t");
            _builder_3.append("}");
            _builder_3.newLine();
            _builder_3.append("\t");
            _builder_3.append("else");
            _builder_3.newLine();
            _builder_3.append("\t");
            _builder_3.append("{");
            _builder_3.newLine();
            _builder_3.append("\t\t");
            _builder_3.append("this.visited.add(nextVisit);");
            _builder_3.newLine();
            _builder_3.append("\t");
            _builder_3.append("}");
            _builder_3.newLine();
            _builder_3.newLine();
            _builder_3.newLine();
            _builder_3.append("\t");
            _builder_3.append("parse");
            ObjectDescription _objectDesription_1 = ((ObjectNext)i).getObjectDesription();
            String _name_2 = _objectDesription_1.getName();
            _builder_3.append(_name_2, "\t");
            _builder_3.append("(next, n);");
            _builder_3.newLineIfNotEmpty();
            _builder_3.append("\t");
            _builder_3.append("actualNode = n;");
            _builder_3.newLine();
            _builder_3.append("}");
            _builder_3.newLine();
            _builder_3.append("catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)");
            _builder_3.newLine();
            _builder_3.append("{");
            _builder_3.newLine();
            _builder_3.append("\t");
            _builder_3.append("throw new ParserException(\"Error while parsing ");
            JavaCodeOrID _attribute_3 = ((ObjectNext)i).getAttribute();
            String _id_2 = _attribute_3.getId();
            _builder_3.append(_id_2, "\t");
            _builder_3.append("\");");
            _builder_3.newLineIfNotEmpty();
            _builder_3.append("}");
            _builder_3.newLine();
            _builder_3.newLine();
            _builder_3.append("\t");
            _builder_3.append("}");
            _builder_3.newLine();
            _builder_3.newLine();
            ret = (_ret + _builder_3);
            _xblockexpression_1 = ret;
          }
          _xifexpression = _xblockexpression_1;
        } else {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("//code: ");
          JavaCodeOrID _attribute_1 = ((ObjectNext)i).getAttribute();
          String _code_1 = _attribute_1.getCode();
          _builder_2.append(_code_1, "");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t");
          _builder_2.append("}");
          _xifexpression = _builder_2;
        }
        _builder_1.append(_xifexpression, "\t\t");
        _builder_1.newLineIfNotEmpty();
        String _plus = (_returnValue + _builder_1.toString());
        this.setReturnValue(_plus);
      } else {
        return false;
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
}
