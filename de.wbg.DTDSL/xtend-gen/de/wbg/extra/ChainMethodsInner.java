package de.wbg.extra;

import de.wbg.dTDSL.ObjectDescription;
import de.wbg.dTDSL.ObjectDescriptionInner;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public abstract class ChainMethodsInner {
  private CharSequence returnValue = new Function0<CharSequence>() {
    public CharSequence apply() {
      StringConcatenation _builder = new StringConcatenation();
      return _builder;
    }
  }.apply();
  
  public abstract boolean handle(final ObjectDescription d, final ObjectDescriptionInner i);
  
  public void setReturnValue(final CharSequence value) {
    this.returnValue = value;
  }
  
  public CharSequence getReturnValue() {
    return this.returnValue;
  }
  
  public CharSequence addToReturnValue(final CharSequence c) {
    String _string = c.toString();
    String _plus = (this.returnValue + _string);
    return this.returnValue = _plus;
  }
}
