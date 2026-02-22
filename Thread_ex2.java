class Thread_ex3 extends Thread
{
    String tnm;

    Thread_ex3(String tnm)
    {
        super(tnm);
        this.tnm = tnm;
        System.out.println(tnm+ " : " +this);
        start();
    }

    public void run()
    {
        for(int i = 1; i <= 10; i++)
        {
            try
            {
                System.out.println(tnm+ " : " +i);
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

class Thread_ex2
{
    public static void main(String args[])
    {
        Thread_ex3 t1 = new Thread_ex3("Child Thread");

        System.out.println("Rutik");
        System.out.println("Madhavi");
        System.out.println("Sahil");

        for(int i = 1; i <= 10; i++)
        {
            try
            {
                System.out.println("Main Thread : "+t1+" : "+ i);
                Thread.sleep(1000);
            }
            catch(InterruptedException ie)
            {
                System.out.println("Main Thread Interrupted");
            }
        }
        System.out.println("Bye Bye Main Thread.......");
    }
}