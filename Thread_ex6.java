class Thread_ex5 implements Runnable
{
	Thread t;
	int c=0;
	private volatile Boolean flag=true;
	public Thread_ex5(int p)
	{
		t=new Thread(this);
		t.setPriority(p);
	}
	public void run()
	{
		while(flag)
		{
			c++;
		}
	}
	public void stop()
	{
		flag=false;
	}
	public void start()
	{
		t.start();
	}
}
class Thread_ex6
{
	public static void main(String args[])
	{
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Thread_ex5 hpt=new Thread_ex5(Thread.NORM_PRIORITY+2);
		Thread_ex5 lpt=new Thread_ex5(Thread.NORM_PRIORITY-2);
		lpt.start();
		hpt.start();
		try
		{
			Thread.sleep(10);
		}
		catch(InterruptedException ie)
		{
			System.out.println("Main Thread Intterrupted");
		}
		lpt.stop();
		hpt.stop();
		try
		{
			lpt.t.join();
			hpt.t.join();
		}
		catch(InterruptedException ie)
		{
			System.out.println("Intterrupted exception caught");
		}
		System.out.println("LPT : "+lpt.c);
		System.out.println("HPT : "+hpt.c);
	}
}