package com.tnsif.constructor;
class sample1{
	sample1(int a)
	{
		System.out.println("this is constructor");
	}
	public void show()
	{
		System.out.println("this is method");
	}
}
public class parameterizedconstructor {

	public static void main(String[] args) {
		sample1 s=new sample1(10);
		s.show();

	}

}
