package com.tnsif.first;
class key{
	int a=50;
}
class keys extends key{
	int a=10;
    public void show() {
	 int a=20;
	 System.out.print(a);
	 System.out.print(this.a);
 }
}
public class This {

	public static void main(String[] args) {
		
		keys obj=new keys();
		obj.show();

	}

}
