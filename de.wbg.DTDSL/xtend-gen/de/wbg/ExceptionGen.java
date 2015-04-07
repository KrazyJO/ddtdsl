package de.wbg;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ExceptionGen {
  public CharSequence exceptionGenerator() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.wbg.dtdsl;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class ParserException extends Exception");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ParserException(String message)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("super(message);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
