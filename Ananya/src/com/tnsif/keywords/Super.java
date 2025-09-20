package com.tnsif.keywords;
class parent{
	int num=50;
	parent()
	{
		System.out.println("parent constructor");
	}
	void display()
	{
		System.out.println("parent method");
	}
	
}
class child extends parent{
	int num=100;
	child()
	{
		super();
		System.out.println("child constructor");
	}
	void display()
	{
		System.out.println("child num:"+num);
		System.out.println("parent num:"+super.num);
		super.display();
	}
}
public class Super {

	public static void main(String[] args) {
		child obj=new child();
		obj.display();

	}

}
