package de.wbg.extra;

import de.wbg.dTDSL.ObjectAttribute;
import de.wbg.dTDSL.ObjectDescription;
import de.wbg.dTDSL.ObjectDescriptionInner;
import de.wbg.dTDSL.ObjectMaybeInner;
import de.wbg.dTDSL.ObjectNext;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public abstract class ChainMaybe {
  private CharSequence returnValue = new Function0<CharSequence>() {
    public CharSequence apply() {
      StringConcatenation _builder = new StringConcatenation();
      return _builder;
    }
  }.apply();
  
  public Object ChainX() {
    return null;
  }
  
  public abstract boolean handle(final ObjectMaybeInner inner, final ObjectDescription d, final ObjectDescriptionInner i);
  
  public void setReturnValue(final CharSequence value) {
    this.returnValue = value;
  }
  
  public CharSequence getReturnValue() {
    return this.returnValue;
  }
  
  public CharSequence getArgument(final ObjectDescriptionInner d) {
    CharSequence _xifexpression = null;
    if ((d instanceof ObjectNext)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("n");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      if ((d instanceof ObjectAttribute)) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("newNode");
        _xifexpression_1 = _builder_1;
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("newNode");
        _xifexpression_1 = _builder_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
}
