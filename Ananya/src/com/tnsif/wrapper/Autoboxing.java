package com.tnsif.wrapper;

public class Autoboxing {

	public static void main(String[] args) {
		byte b=10;
		Byte byteobj=b;
		System.out.println("autoboxed byte object:"+byteobj);
		
		int a=20;
		Integer intobj=a;
		System.out.println("autoboxed integer:"+intobj);
		
		double d=23.9;
		Double doubleobj=d;
		System.out.println("autoboxed double:"+doubleobj);
		
		char c='g';
		Character charobj=c;
		System.out.println("autoboxed character:"+charobj);
		
		boolean bo=true;
		Boolean boolobj=bo;
		System.out.println("autoboxed boolean:"+boolobj);
		
		short s=29;
		short sobj=s;
		System.out.println("autoboxed short:"+sobj);
		
		long l=40l;
		long lobj=l;
		System.out.println("autoboxed long:"+lobj);
		
		float f=50.5f;
		float fobj=f;
		System.out.println("autoboxed float:"+fobj);
		
		

	}

}
