class SampleThread implements Runnable {
    String name;
    Thread t;
    private boolean suspendFlag;

    SampleThread(String tname) {
        name = tname;
        suspendFlag = false;
        t = new Thread(this, name);
        System.out.println("New thread = " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {

                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }

                System.out.println(name + " = " + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(name + " Interrupted");
        }
        System.out.println("Bye Bye " + name);
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}

class SuspendResumeStopFlag {
    public static void main(String args[]) {

        SampleThread ob1 = new SampleThread("First");
        SampleThread ob2 = new SampleThread("Second");

        try {
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Suspending Thread First");

            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Resuming Thread First");

            ob2.mysuspend();
            System.out.println("Suspending Thread Second");

            Thread.sleep(1000);

            ob2.myresume();
            System.out.println("Resuming Thread Second");

        } catch (Exception e) {
            System.out.println("Main thread Interrupted");
        }

        try {
            System.out.println("Waiting for Threads to finish");
            ob1.t.join();
            ob2.t.join();
        } catch (Exception e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Bye Bye Main Thread");
    }
}