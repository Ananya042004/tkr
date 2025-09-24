package com.tnsif.multithreading;
class ThreadExtends extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println("hello");
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}

public class threadDemo {

	public static void main(String[] args) {
		ThreadExtends te = new ThreadExtends();
		te.start();

	}

}
