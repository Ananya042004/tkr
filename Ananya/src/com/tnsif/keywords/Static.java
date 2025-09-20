package com.tnsif.keywords;
class student{
	int roll;
	String name;
	static String college="tkr college";
	student(int r,String n)
	{
		roll=r;
		name=n;
	}
	void display()
	{
		System.out.println(roll+" "+name+" "+college);
		
	}
	static void showcollege()
	{
		System.out.println("college name:"+college);
	}
}
public class Static {
	static
	{
		System.out.println("static block executed");
	}

	public static void main(String[] args) {
		student s1=new student(1,"any");
		student s2=new student(2,"anu");
		s1.display();
		s2.display();
		student.showcollege();
      
	}

}
