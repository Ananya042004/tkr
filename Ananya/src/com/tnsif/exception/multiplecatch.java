package com.tnsif.exception;

public class multiplecatch {

	public static void main(String[] args) {
		try {
			String n=null;
			System.out.println(n.length());
		}catch(ArithmeticException e)
		{
			System.out.println("we cannot values");
		}catch(NullPointerException e)
		{
			System.out.println("we cannot read null values");
		}

	}

}
