package com.tnsif.first;

abstract class shape{
	double area;
	abstract void calcArea();
	void show()
	{
		System.out.println("Area="+area);
	}
}
class square extends shape{
	int side;
	square(int side)
	{
		this.side=side;
	}
	void calcArea()
	{
		area=side*side;
	}
}
class Rectangle extends shape{
	int l,b;
	Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	void calcArea()
	{
		area=l*b;
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     square sq=new square(6);
     sq.calcArea();
     sq.show();
     
     Rectangle re=new Rectangle(4,5);
     re.calcArea();
     re.show();
    		 
	}

}
