package com.tnsif.oops;
class car{
	String color;
	String model;
	String company;

 public void moving()
  {
	System.out.println("car is moving");
  }
 public void stopping()
  {
	System.out.println("car has stopped");
  }
 public void drifting()
  {
	System.out.println("car is drifting");
  }
 public void showdetails()
  {
	System.out.println("car details");
	System.out.println("color:"+color);
	System.out.println("model:"+model);
	System.out.println("company:"+company);
  }
}
public class encapsulation {

	public static void main(String[] args) {
		car car1=new car();
		car1.color="blue";
		car1.model="i20";
		car1.company="hyundai";
		car1.showdetails();
		car1.moving();
		car1.stopping();
		car1.drifting();

	}

}
