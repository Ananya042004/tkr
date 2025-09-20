package com.tnsif.polymorphism;
class Override{
	public void show()
	{
		System.out.println("this is parent class");
	}
}
class child extends Override{
	public void show()
	{
	System.out.println("this is child class");
	}
}
public class methodoverride {

	public static void main(String[] args) {
	 child c=new child();
	 c.show();

	}

}
