package com.tnsif.strings;

public class Stringmethods {

	public static void main(String[] args) {
		String x="hello";
		String y="hi";
		System.out.println("length of x:"+x.length());
		System.out.println("character at index 1 in x:"+x.charAt(1));
		System.out.print("comapring x and y:"+x.compareTo(y));
		String concat=x.concat(y);
		System.out.println("concatanation of x and y:"+ concat);
		System.out.println("does x contains 11:"+ x.contains("11"));
		System.out.println("x.equals(y)");
		System.out.println("x in uppercase:"+x.toUpperCase());
		System.out.println("x in lowecase:"+x.toLowerCase());
		String replaced=x.replace("llo", "y");
		System.out.println("after replacing 'llo' with 'y':"+replaced);
		

	}

}
