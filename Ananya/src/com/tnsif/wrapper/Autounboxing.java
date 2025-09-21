package com.tnsif.wrapper;

public class Autounboxing {

	public static void main(String[] args) {
		Byte bobj=100;
		byte b=bobj;
		System.out.println("autounboxed byte:"+b);
		
		short sobj=200;
		short s=sobj;
		System.out.println("autounboxed byte:"+s);
		
		Integer iobj=299;
		int i=iobj;
		System.out.println("autounboxed byte:"+i);
		
		long lobj=400l;
		long l=lobj;
		System.out.println("autounboxed long:"+l);
		
		float fobj=123.5f;
		float f=fobj;
		System.out.println("autounboxed float:"+f);
		
		double dobj=5667.6;
		double d=dobj;
		System.out.println("autounboxed double:"+d);
		
		Character cobj='y';
		char c=cobj;
		System.out.println("autounboxed character:"+c);
		
		Boolean b1obj=Boolean.FALSE;
		boolean bool=b1obj;
		System.out.println("autounboxed boolean:"+bool);
		
		
		
		

	}

}
