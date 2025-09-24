package com.tnsif.multithreading;
class Current implements Runnable{
	  public void run()
	  {
		  System.out.println("current thread from Runnable:"+Thread.currentThread());
	  }
	}


public class CurrentThread {

	public static void main(String[] args) {
		Current c=new Current();
		Thread t=new Thread(c);
		t.start();

	}

}
