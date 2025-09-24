package com.tnsif.exception;

public class trycatch {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
		}catch(NullPointerException e)
		{
			System.out.println("the null values cannot be read");
		}

	}

}
