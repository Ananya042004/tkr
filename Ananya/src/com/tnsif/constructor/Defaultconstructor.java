package com.tnsif.constructor;
class sample{
	sample()
	{
		System.out.println("this is constructor");
	}
	public void show()
	{
		System.out.println("this is method");
	}
}
public class Defaultconstructor {

	public static void main(String[] args) {
		sample obj=new sample();
		obj.show();

	}

}
