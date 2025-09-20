package com.tnsif.inputs;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student name:");
		String name=sc.nextLine();
		System.out.println("enter student age:");
		int age=sc.nextInt();
		System.out.println("enter student percentage:");
		double percentage=sc.nextDouble();
		System.out.println("student details:");
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("percentage:"+percentage);
		sc.close();
		

	}

}
