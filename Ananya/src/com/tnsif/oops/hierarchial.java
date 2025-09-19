package com.tnsif.oops;
class Ananya{
	void read()
	{
		System.out.println("ananya is reading");
	}
}
class arifa extends Ananya{
	void write()
	{
		System.out.println("arifa is writing");
	}
}
class ankitha extends Ananya{
	void listen()
	{
		System.out.println("ankitha is listening");
	}
}
public class hierarchial {

	public static void main(String[] args) {
		arifa ar=new arifa();
		ar.write();
		ar.read();
	    
		ankitha an=new ankitha();
		an.listen();
		an.read();
		
		
		

	}

}
