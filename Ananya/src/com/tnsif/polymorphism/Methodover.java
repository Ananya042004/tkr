package com.tnsif.polymorphism;
class Methodooverload{
	  public void demo()
	   {
		System.out.println("this is a default");
	  }
	 public void demo(int a)
	  {
		System.out.println("this is having one parameter ");
	  }
	 public void demo(int a,int b) {
		System.out.println("this is having two parameters");
	  }
	}
public class Methodover {

	public static void main(String[] args) {
		Methodooverload mo=new Methodooverload();
		mo.demo();
		mo.demo(10);
		mo.demo(10,20);

	}

}
