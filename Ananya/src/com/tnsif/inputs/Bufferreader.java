package com.tnsif.inputs;
import java.io.*;


public class Bufferreader {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter student name:");
		String name=br.readLine();
		System.out.println("enter student age:");
		int age=Integer.parseInt(br.readLine());
		System.out.println("enter student percentage:");
		double percentage=Double.parseDouble(br.readLine());
		System.out.println("student details:");
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("percentage:"+percentage);
		

	}

}
