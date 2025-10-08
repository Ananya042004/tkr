package com.tnsif.collections;
import java.util.Vector;
public class vector1 {

	public static void main(String[] args) {
		Vector num=new Vector();
		num.add(101);
		num.add("vector");
		num.add(55.4);
		System.out.println(num);
		
		num.remove(1);
		System.out.println(num);
		
		num.addElement("hello");
		num.add(786);
		System.out.println(num);
		
		System.out.println("Element at index 2:"+num.get(2));
		System.out.println("Vector size:"+num.size());
		

	}

}
