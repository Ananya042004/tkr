package com.tnsif.keywords;
class demo{
	final int num=100;
	final void show()
	{
		System.out.println("this a final method");
	}
}
final class finalclass{
	void display()
	{
		System.out.println("this is a final class");
	}
}
public class Final {

	public static void main(String[] args) {
		demo obj=new demo();
		obj.show();
		
		finalclass fc=new finalclass();
		fc.display();

	}

}
