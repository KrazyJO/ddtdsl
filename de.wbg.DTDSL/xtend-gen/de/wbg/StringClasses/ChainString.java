package de.wbg.StringClasses;

import de.wbg.dTDSL.StringDescription;
import de.wbg.dTDSL.StringDescriptionInVariable;
import de.wbg.dTDSL.StringDescriptionInner;
import de.wbg.generator.DTDSLGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public abstract class ChainString {
  public ChainString(final DTDSLGenerator g) {
    this.generator = g;
  }
  
  private CharSequence returnValue = new Function0<CharSequence>() {
    public CharSequence apply() {
      StringConcatenation _builder = new StringConcatenation();
      return _builder;
    }
  }.apply();
  
  private DTDSLGenerator generator;
  
  public abstract boolean handle(final int index, final StringDescriptionInner i);
  
  public void setReturnValue(final CharSequence value) {
    this.returnValue = value;
  }
  
  public CharSequence getReturnValue() {
    return this.returnValue;
  }
  
  public void setGenerator(final DTDSLGenerator value) {
    this.generator = value;
  }
  
  public DTDSLGenerator getGenerator() {
    return this.generator;
  }
  
  public String getDescriptionName(final Object d) {
    if ((d instanceof StringDescription)) {
      return ((StringDescription)d).getName();
    }
    if ((d instanceof StringDescriptionInVariable)) {
      return ((StringDescriptionInVariable)d).getName();
    }
    return null;
  }
  
  public int getDescriptionSize(final Object d) {
    if ((d instanceof StringDescription)) {
      EList<StringDescriptionInner> _description = ((StringDescription)d).getDescription();
      return _description.size();
    } else {
      if ((d instanceof StringDescriptionInVariable)) {
        EList<StringDescriptionInner> _description_1 = ((StringDescriptionInVariable)d).getDescription();
        return _description_1.size();
      } else {
        InputOutput.<String>println(("size du depp: " + d));
        return 0;
      }
    }
  }
  
  public StringDescriptionInner getDescriptionObjectGet(final Object d, final int index) {
    if ((d instanceof StringDescription)) {
      EList<StringDescriptionInner> _description = ((StringDescription)d).getDescription();
      return _description.get(index);
    } else {
      if ((d instanceof StringDescriptionInVariable)) {
        EList<StringDescriptionInner> _description_1 = ((StringDescriptionInVariable)d).getDescription();
        return _description_1.get(index);
      } else {
        Class<?> _class = d.getClass();
        String _plus = ("null du depp: " + _class);
        InputOutput.<String>println(_plus);
        return null;
      }
    }
  }
}
