package com.tnsif.Lambda;

import java.util.ArrayList;

public class LambdaCollections {

	public static void main(String[] args) {
	  ArrayList l=new ArrayList();
	  l.add(10);
	  l.add(20);
	  l.add(30);
	  l.add(40);
	  
	  l.forEach(n->System.out.println(n));

	}

}
