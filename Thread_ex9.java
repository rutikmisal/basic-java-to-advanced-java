class Thread_ex7
{
	void show(String s)
	{
		System.out.println("["+s);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{
			System.out.println("Interrupted");
		}
		System.out.println("]");
		System.out.println();
	}
}
class Thread_ex8 implements Runnable
{
	String s;
	Thread t;
	Thread_ex7 ob1;
	
	Thread_ex8(Thread_ex7 ob11, String s1)
	{
		s=s1;
		ob1=ob11;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		synchronized(ob1)
		{
			ob1.show(s);
		}
	}
	
}
class Thread_ex9
{
	public static void main(String args[])
	{
		Thread_ex7 t1= new Thread_ex7();
		Thread_ex8 ob4= new Thread_ex8(t1,"Wellcome");
		Thread_ex8 ob2= new Thread_ex8(t1,"to");
		Thread_ex8 ob3= new Thread_ex8(t1,"Java Programming");
		try
		{
			ob4.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException ie)
		{
			System.out.println("Interrupted Exception ");
		}
	}
}