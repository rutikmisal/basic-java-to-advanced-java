class Sample13
{
	synchronized void show(String s)
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
	}
}
class Sample14 implements Runnable
{
	String s;
	Thread t;
	Sample13 ob1;
	
	Sample14(Sample13 ob11, String s1)
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
class Thread_ex10
{
	public static void main(String args[])
	{
		Sample13 t1= new Sample13();
		Sample14 ob4= new Sample14(t1,"Wellcome");
		Sample14 ob2= new Sample14(t1,"to");
		Sample14 ob3= new Sample14(t1,"Java Programming");
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