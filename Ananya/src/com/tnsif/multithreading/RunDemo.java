package com.tnsif.multithreading;
class Runnableinf implements Runnable
{
public void run() {
	for (int i = 1; i <= 10; i++) {
		try {
			System.out.println(i);
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

}
public class RunDemo {

	public static void main(String[] args) {
		Runnableinf rn=new Runnableinf();
		Thread t1=new Thread(rn);
		t1.start();

	}

}
