package com.tnsif.first;
class student {
	private String name;
	private int age;
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public int getage(){
		return age;
		
	}
	public void setage(int age)
	{
		if(age>0)
		{
			this.age=age;
		}
		else
		{
          System.out.println("age must be positive");
		}
	}
}
public class gettersetter {

	public static void main(String[] args) {
		student s1=new student();
		s1.setname("ananya");
		s1.setage(21);
		
		System.out.println("name:"+s1.getname());
		System.out.println("age:"+s1.getage());
		

	}

}
