package com.tnsif.first;
 interface inf1{
	void call();
	void sms();
}
class jio implements inf1{
	public void call()
	{
		System.out.println("calling from jio");
	}
	public void sms()
	{
		System.out.println("message sent from jio");
	}
}
class samsung implements inf1
{
	public void call()
	{
		System.out.println("calling from samsung");
	}
	public void sms()
	{
		System.out.println("message sent from samsung");
	}
}
public class Interfacetoclass {

	public static void main(String[] args) {
		jio j=new jio();
		j.call();
		j.sms();
		
		samsung s=new samsung();
		s.call();
		s.sms();

	}

}
