package com.tnsif.multithreading;
class MyThread extends Thread
{
	public void run()
	{
		
		for(int i=1;i<=3;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
			if(i==2)
			{
				System.out.println(Thread.currentThread().getName()+"is yielding");
				Thread.yield();
			}
		}
	}
}
public class JoinYield {

	public static void main(String[] args) {
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.start();
		t2.start();
		try {
			t1.join();
		}
		catch(Exception e)
		{
		 System.out.println(e);
		}

	}

}
