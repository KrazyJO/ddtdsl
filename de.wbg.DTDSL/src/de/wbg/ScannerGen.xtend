package de.wbg

class ScannerGen {
	
	def CharSequence generateScanner()
	{
		'''
package de.wbg.dtdsl;
		
public class SimpleScanner {
	private String scanString;
	private int position;
	
	public SimpleScanner(String s)
	{
		scanString = s;
	}
	
	public SimpleScanner()
	{
		
	}
	
	public boolean hasNext(String s)
	{
		if (position + s.length() > scanString.length())
		{
			return false;
		}
		String sub = scanString.substring(position, position+s.length());
		if (sub.equals(s)) {
			return true;
		}
		return false;
	}
	
	public boolean skip(String s)
	{
		if (this.hasNext(s))
		{
			position = position + s.length();
			return true;
		}
		
		return false;
	}
	
	public String scanUpToString(String s) throws Exception
	{
		//string herausschneiden und position weiter setzen
		String sub = scanString.substring(position);
		int pos = sub.indexOf(s);
		if (pos == -1) throw new Exception("not possible to scan");
		
		String ret = scanString.substring(position, position + pos);
		
		position += pos;
		
		return ret.trim();
	}
	
	public int scanUpToStringAsInt(String s) throws Exception
	{
		try
		{
			int rValue = Integer.valueOf(this.scanUpToString(s));
			return rValue;
		}
		catch (Exception e)
		{
			throw new ParserException("could not scan int");
		}
	}
	
	public double scanUpToStringAsDouble(String s) throws Exception
	{
		try
		{
			double rValue = Double.valueOf(this.scanUpToString(s));
			return rValue;
		}
		catch (Exception e)
		{
			throw new ParserException("could not scan Double");
		}
	}
	
	public double scanUpToStringAsFloat(String s) throws Exception
	{
		try
		{
			float rValue = Float.valueOf(this.scanUpToString(s));
			return rValue;
		}
		catch (Exception e)
		{
			throw new ParserException("could not scan float");
		}
	}
	
	public String scanUpToSpace() throws Exception
	{
		//string herausschneiden und position weiter setzen
		String sub = scanString.substring(position);
		int pos = sub.indexOf(" ");
		if (pos == -1) throw new Exception("not possible to scan");
		
		String ret = scanString.substring(position, position + pos);
		
		position += pos;
		
		return ret.trim();
	}
	
	public String scanUpToEnd()
	{
		String ret =  scanString.substring(position);
		position = scanString.length();
		return ret;
	}
	
	public void reset()
	{
		position = 0;
	}
	
	public void setScanString(String value)
	{
		this.scanString = value;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void resetToPosition(int value)
	{
		this.position = value;
	}
}
		'''
	}	
}