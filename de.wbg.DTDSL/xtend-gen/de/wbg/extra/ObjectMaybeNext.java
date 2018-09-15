package de.wbg.extra;

import de.wbg.dTDSL.ObjectDescription;
import de.wbg.dTDSL.ObjectDescriptionInner;
import de.wbg.dTDSL.ObjectMaybeInner;
import de.wbg.dTDSL.ObjectNext;
import de.wbg.extra.ChainMaybe;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ObjectMaybeNext extends ChainMaybe {
  @Override
  public boolean handle(final ObjectMaybeInner inner, final ObjectDescription d, final ObjectDescriptionInner i) {
    if ((inner instanceof ObjectNext)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Element maybeHead = new Element(\"MAYBEHEAD\");");
      _builder.newLine();
      _builder.append("maybeHead.setNodeNumber(n.getNodeNumber());");
      _builder.newLine();
      _builder.append("Object temp = o;");
      _builder.newLine();
      _builder.append("try");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("parse");
      String _name = d.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      _builder.append(_firstUpper, "\t");
      ObjectDescription _objectDesription = ((ObjectNext)inner).getObjectDesription();
      String _name_1 = _objectDesription.getName();
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
      _builder.append(_firstUpper_1, "\t");
      _builder.append("(temp, maybeHead);");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("this.prev = newNode;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("for (Element child: maybeHead.getChildren())");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("n.addChild(child);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("child.setParent(n);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if (this.prev != null)");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("this.prev.setNext(child);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.prev = child;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("} ");
      _builder.newLine();
      _builder.append("catch (ParserException e) ");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("//destroy reference");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("maybeHead = null;");
      _builder.newLine();
      _builder.append("}");
      this.setReturnValue(_builder);
    } else {
      return false;
    }
    return true;
  }
}
