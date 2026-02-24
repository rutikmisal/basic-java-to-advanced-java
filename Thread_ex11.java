class Sample15
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
		System.out.print("]");
	}
}
class Sample16 implements Runnable
{
	String s;
	Thread t;
	Sample13 ob1;
	
	Sample16(Sample13 ob11, String s1)
	{
		s=s1;
		ob1=ob11;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{			
		ob1.show(s);
	}
	
}
class Thread_ex11
{
	public static void main(String args[])
	{
		Sample13 t1= new Sample13();
		Sample16 ob4= new Sample16(t1,"Wellcome");
		Sample16 ob2= new Sample16(t1,"to");
		Sample16 ob3= new Sample16(t1,"Java Programming");
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