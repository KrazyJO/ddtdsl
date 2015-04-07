package de.wbg.extra;

import de.wbg.dTDSL.ObjectDescription;
import de.wbg.dTDSL.ObjectDescriptionInner;
import de.wbg.dTDSL.ObjectMaybeInner;
import de.wbg.dTDSL.ObjectNode;
import de.wbg.extra.ChainMaybe;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ObjectMaybeNode extends ChainMaybe {
  public boolean handle(final ObjectMaybeInner inner, final ObjectDescription d, final ObjectDescriptionInner i) {
    if ((inner instanceof ObjectNode)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Element maybeHead = new Element(\"MAYBEHEAD\");");
      _builder.newLine();
      _builder.append("Object temp = o;");
      _builder.newLine();
      _builder.append("try");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("parseMaybe");
      String _name = d.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      _builder.append(_firstUpper, "\t");
      String _attributes = ((ObjectNode)inner).getAttributes();
      String _firstUpper_1 = StringExtensions.toFirstUpper(_attributes);
      _builder.append(_firstUpper_1, "\t");
      _builder.append("(temp, maybeHead);");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("for (Element child: maybeHead.getChildren())");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("newNode.addChild(child);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("child.setParent(newNode);");
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
