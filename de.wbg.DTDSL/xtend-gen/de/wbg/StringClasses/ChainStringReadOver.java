package de.wbg.StringClasses;

import de.wbg.StringClasses.ChainString;
import de.wbg.dTDSL.StringDescriptionInner;
import de.wbg.dTDSL.StringOverRead;
import de.wbg.generator.DTDSLGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ChainStringReadOver extends ChainString {
  public ChainStringReadOver(final DTDSLGenerator g) {
    super(g);
  }
  
  @Override
  public boolean handle(final int index, final StringDescriptionInner i) {
    if ((i instanceof StringOverRead)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("//overread ");
      String _overRead = ((StringOverRead)i).getOverRead();
      _builder.append(_overRead, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("if (scanner.hasNext(\"");
      String _overRead_1 = ((StringOverRead)i).getOverRead();
      _builder.append(_overRead_1, "\t\t");
      _builder.append("\"))");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("scanner.skip(\"");
      String _overRead_2 = ((StringOverRead)i).getOverRead();
      _builder.append(_overRead_2, "\t\t\t");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("else");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("throw new ParserException(\"Error while parsing String in ");
      String _descriptionName = this.getDescriptionName(this);
      _builder.append(_descriptionName, "\t\t\t");
      _builder.append(" while overreading \\\"");
      String _overRead_3 = ((StringOverRead)i).getOverRead();
      _builder.append(_overRead_3, "\t\t\t");
      _builder.append("\\\"\");");
      _builder.newLineIfNotEmpty();
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
