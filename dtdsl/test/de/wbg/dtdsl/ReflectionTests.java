package de.wbg.dtdsl;

import java.lang.reflect.Field;

import org.junit.Test;

import de.wbg.dtdsl.testhelper.SimpleValue;

public class ReflectionTests {

	@Test
	public void typeTest()
	{
		Attribute attrib = new Attribute("attrib");
		SimpleValue simpleValue = new SimpleValue();
		Field f;
		try {
			f = simpleValue.getClass().getDeclaredField("value");
			f.setAccessible(true);
			Object iWantThis = f.get(simpleValue); //IllegalAccessException
			
			
			attrib.setType(iWantThis.getClass());
			attrib.setValue(iWantThis);
			
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //NoSuchFieldException
		
		System.out.println("attrib.type: " + attrib.getType() + ", attrib.value: " + attrib.getValue());
		
	}
	
}
