package com.tnsif.Interface;
 interface printing{
	void print();
}
 interface showing
 {
	 void show();
 }
 interface drawing
 {
	 void draw();
 }
 interface playing
 {
	 void play();
 }
 class student implements printing,showing,drawing,playing{
	 public void print()
	 {
		 System.out.println("printing");
	 }
	 public void show()
	 {
		 System.out.println("showing");
	 }
	 public void draw()
	 {
		 System.out.println("drawing");
	 }
	 public void play()
	 {
		 System.out.println("playing");
	 }
	 
 }
public class Multipleinterface {

	public static void main(String[] args) {
		student s=new student();
		s.print();
		s.show();
		s.draw();
		s.play();

	}

}
