package com.tnsif.oops;

class Animal
{
	void eat()
	{
		
		System.out.println("animal is eating");
	}
	
}
class dog extends Animal{
	void bark()
	{
		System.out.println("dog is barking");
	}
}
public class single {

	public static void main(String[] args) {
		dog d=new dog();
		d.bark();
		d.eat();
       
	}

}
