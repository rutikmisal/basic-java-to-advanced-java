class Thread_ex1
{
	public static void main(String args[])
	{
		int i;
		Thread t;
		t=Thread.currentThread();
		System.out.println("Before The Thread : "+t);
		t.setName("First");
		System.out.println("After The Thread : "+t);
		for(i=10;i>=1;i--)
		{
			System.out.println("Main Thread : "+i);
			try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException ie)
			{
				System.out.println("Main Thread is Intterupted ");
			}
		}
		System.out.println("Main Thread Is Completed Bye Bye..........");
	}
}