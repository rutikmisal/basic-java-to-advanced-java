class A 
{
	synchronized void show(B b)
	{
		String name=Thread.currentThread().getName();
		System.out.println(name+" - welcome to show A");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{}
		System.out.println(name+"Trying to call B.put");
		b.put();
	}
	synchronized void put()
	{
		System.out.println("-welcome to A.put()");
	}		
}
class B
{
	synchronized void display(A a)
	{
		String name=Thread.currentThread().getName();
		System.out.println(name+" - welcome to show B");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{}
		System.out.println(name+"Trying to call a.put");
		a.put();
	}
	synchronized void put()
	{
		System.out.println("-welcome to b.put()");
	}		
}
class Deadlock implements Runnable
{
	A a=new A();
	B b=new B();
	Deadlock()
	{
		Thread.currentThread().setName("Thread 1");
		Thread t = new Thread(this, "Thread 2");
		t.start();
		a.show(b);
		System.out.println("Back in main Thread");
	}
	public void run()
	{
		b.display(a);
		System.out.println("back in other Thread");
	}
	public static void main(String args[])
	{
		new Deadlock();
	}
}