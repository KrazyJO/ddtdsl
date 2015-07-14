package de.wbg.ddtdsl;

import org.junit.Test;

import de.wbg.ddtdsl.testhelper.ThesisClassA;
import de.wbg.ddtdsl.testhelper.ThesisClassB;

//import de.wbg.ddtdsl.testhelper.ThesisClassA;
//import de.wbg.ddtdsl.testhelper.ThesisClassB;
//import de.wbg.ddtdsl.Head;

public class ThesisTest {

	 @Test
	 public void startThesisTest()
	 {
		 ThesisClassA thesisClassA = new ThesisClassA();
		 ThesisClassB thesisClassB = new ThesisClassB();
		 
		 thesisClassA.setBrother(thesisClassB);
		 thesisClassB.setBrother(thesisClassA);
		 
		 ThesisParser parser = new ThesisParser();
		 Head head = parser.parse(thesisClassA);
		 
		 AST2Json astParser = new AST2Json();
		 String jsonString = astParser.parse(head);
		 System.out.println(jsonString);
	 }
}
