package test.thread;

public class ThreadExample2 implements Runnable {
	public static int a=1,b=2,c=0;
public static void main(String args[])
{
	
	System.out.println("Hello Everyone");
	A a1=new A();
	a1.start();
	//a1.setPriority(c);
	
	ThreadExample2 t1=new ThreadExample2();
	Thread thread=new Thread(t1);
	thread.start();
	//thread.setPriority(MAX_PRIORITY);
	thread.isAlive();
	{
		System.out.println("Thread is currently Running");
	}
	
	c=a+b;
	System.out.println(c);	
}
public void run()
{
	System.out.println("Thread is Running");
	c++;
	System.out.println(c);
}
}

class A extends Thread
{
	public void run()
	{
		int a=2,b=0,c;
		c=a+b;
		System.out.println("Another class run method: "+c);
	}
}
