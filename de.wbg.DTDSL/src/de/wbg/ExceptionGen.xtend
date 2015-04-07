package de.wbg

class ExceptionGen {
	
	def CharSequence exceptionGenerator()
	{
		'''
		package de.wbg.dtdsl;
		
		class ParserException extends Exception
		{
			
			public ParserException(String message)
			{
				super(message);
			}
			
		}
		'''
	}
	
}