package com.tnsif.multithreading;
 class priorityDemo extends Thread{
	public void run()
	{
		System.out.println("the running thread priority is:"+Thread.currentThread().getPriority());
		
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
		priorityDemo p1=new priorityDemo();
		priorityDemo p2=new priorityDemo();
		p1.setPriority(Thread.MAX_PRIORITY);
		p2.setPriority(Thread.MIN_PRIORITY);
		p1.start();
		p2.start();
		
		

	}

}
