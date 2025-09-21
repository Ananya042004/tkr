package com.tnsif.Interface;
interface Animal{
	void eat();
}
interface pet extends Animal
{
	void play();
}
class dog implements pet
{
	public void eat()
	{
		System.out.println("dog is eating");
	}
	public void play()
	{
		System.out.println("dog is playing");
	}
}
public class Interface {

	public static void main(String[] args) {
		dog mydog=new dog();
		mydog.eat();
		mydog.play();

	}

}
