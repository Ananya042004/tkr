package com.tnsif.exception;
class sample
{
	public void show() throws Exception
	{
		String s=null;
		throw new NullPointerException("NoNullException");
	}
}
public class Throws {

	public static void main(String[] args) throws Exception{
		sample s=new sample();
		s.show();

	}

}
