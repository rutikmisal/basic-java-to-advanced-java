class Thread_ex4 implements Runnable
{
    Thread t;
    Thread_ex4(String tnm)
    {
        t=new Thread(this,tnm);
        System.out.println("Child Thread : " +t);
        t.start();
    }

    public void run()
    {
        for(int i = 1; i <= 10; i++)
        {
            try
            {
                System.out.println("Child Thread : "+i);
                Thread.sleep(500);
            }
            catch(InterruptedException ie)
            {
                System.out.println("Child Thread Interrupted");
            }
        }
        System.out.println("Bye Bye Child Thread.......");
    }
}

class Thread_ex3
{
    public static void main(String args[])
    {
        Thread_ex4 t1 = new Thread_ex4("Rutik");
	Thread_ex4 t2 = new Thread_ex4("Madhavi");
	Thread_ex4 t3 = new Thread_ex4("Sahil");

        System.out.println("Rutik thread is Alive : "+t1.t.isAlive());
	System.out.println("Madhavi thread is Alive : "+t2.t.isAlive());
	System.out.println("Sahil thread is Alive : "+t3.t.isAlive());
	System.out.println("Main Thread : ");

	try
	{
		System.out.println("Main Thread is waiting for termination of child class : ");
		t1.t.join();
		t2.t.join();
		t3.t.join();
		System.out.println("Rutik thread is Alive : "+t1.t.isAlive());
		System.out.println("Rutik thread is Alive : "+t2.t.isAlive());
		System.out.println("Rutik thread is Alive : "+t3.t.isAlive());
	}
	catch(InterruptedException ie)
	{
		System.out.println("Main Thread Interrupted");
	}  
        System.out.println("Bye Bye Main Thread.......");
    }
}