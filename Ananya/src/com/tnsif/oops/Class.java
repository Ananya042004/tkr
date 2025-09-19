package com.tnsif.oops;

class sample{
	int a=20;
	boolean b=true;
	public void show()
	{
		System.out.println("this is show method");
	}
}
public class Class {

	public static void main(String[] args) {
		sample s=new sample();
		s.show();
		System.out.println(s.a);
		System.out.println(s.b);
	}

}
