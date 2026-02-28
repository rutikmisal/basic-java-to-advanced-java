class Q {
    int n;
    boolean f = false;     synchronized int get() {
        while (!f) {
            try {
                wait();
            } catch (InterruptedException ie) {
                System.out.println("Interrupted Exception");
            }
        }

        System.out.println("Get - " + n+"Where"+f);
        f = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (f) {
            try {
                wait();
            } catch (InterruptedException ie) {
                System.out.println("Interrupted Exception");
            }
        }

        this.n = n;
        System.out.println("Put - " + n+"Where"+f);
        f = true;
        notify();
    }
}
class Producer implements Runnable
{
	Q q;
	Producer(Q q)
	{
		this.q=q;
		new Thread(this,"Producer").start();
	}
	public  void run()
	{
		int i=0;
		while(true)
		{
			q.put(i++);
		}
	}
}
class Consumer implements Runnable
{
	Q q;
	Consumer(Q q)
	{
		this.q=q;
		new Thread(this,"Consumer").start();
	}
	public  void run()
	{
		while(true)
		{
			q.get();
		}
	}
}
class InterCommunicationThreadCorrect
{
	public static void main(String args[])
	{
		Q q=new Q();
		new Producer (q);
		new Consumer (q);
		System.out.println("Stop the Execution for Ctrl+c key are pressed");
	}
}