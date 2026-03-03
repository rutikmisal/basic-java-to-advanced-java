class  SampleThread implements Runnable
{
	String name;
	Thread t;
	SampleThread(String tname)
	{
		name=tname;
		t=new Thread(this,name);
		System.out.println("New thread ="+t);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println(name+"="+i);
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.println(name+"Interrupted");
		}	
		System.out.println("Bye Bye"+name);
	}
}

class SuspendResumeStop
{
	public static void main(String args[])
	{
	SampleThread ob1 = new SampleThread("First");
	SampleThread ob2 = new SampleThread("Second");
	try
	{
		Thread.sleep(1000);

		ob1.t.suspend();
		System.out.println("Suspending Thread First");
		Thread.sleep(1000);
		ob1.t.resume();
		System.out.println("Resuming Thread First");

		ob2.t.suspend();
		System.out.println("Suspending Thread Second");
		Thread.sleep(1000);
		ob2.t.resume();
		System.out.println("Resuming Thread Second");
	}
	catch(Exception e)
	{	
		System.out.println("Main thread Interrupted");
	}
	try
	{
		System.out.println("Waiting for Thread to finish");
		ob1.t.join();
		ob2.t.join();

	}
	catch(Exception e)
	{
		System.out.println("Main thread Interrupted");
	}
	System.out.println("Bye Bye Main Thread");
	}
}