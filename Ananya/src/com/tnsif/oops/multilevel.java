package com.tnsif.oops;
class jungle{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class puppy extends jungle{
	void bark()
	{
		System.out.println("dog is barking");
	}
}
class cat extends puppy{
	void weep()
	{
		System.out.println("cat is weeping");
	}
}
public class multilevel {

	public static void main(String[] args) {
		puppy d=new puppy();
		d.bark();
		d.eat();
		
		cat c=new cat();
		c.weep();
		c.bark();
		c.eat();
		

	}

}
