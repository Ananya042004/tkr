package com.tnsif.collections;
import java.util.ArrayList;
public class ArrayOne {

	public static void main(String[] args) {
      ArrayList ai=new ArrayList();
	  ai.add(102);
	  ai.add("hi");
	  ai.add(22.5);
	  System.out.println(ai);
	  ai.remove(1);
	  System.out.println(ai);
	  ai.add(null);
	  ai.add(null);
	  System.out.println(ai);
	  System.out.println(ai.get(1));
	  ai.add(ai);
	  
	  

	}

}
