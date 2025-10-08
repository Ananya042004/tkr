package com.tnsif.Lambda;

public class WithparaDemo {

	public static void main(String[] args) {
		Withpara p=(int a)->
		{
			System.out.println("the value of a is:"+a);
			return a;
		};
		
		p.show(10);

	}

}
