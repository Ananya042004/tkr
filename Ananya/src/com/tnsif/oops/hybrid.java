package com.tnsif.oops;
class apple{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class orange extends apple{
	void bark()
	{
		System.out.println("dog is barking");
	}
}
class grape extends apple{
	void meow()
	{
		System.out.println("cat is meowing");
	}
}
class banana extends orange{
	void weep()
	{
		System.out.println("puppy is weeping");
	}
}
public class hybrid {

	public static void main(String[] args) {
		banana p=new banana();
		p.weep();
		p.bark();
		
		grape c=new grape();
		c.meow();
		c.eat();
		
		orange d=new orange();
		d.bark();
		d.eat();

	}

}
