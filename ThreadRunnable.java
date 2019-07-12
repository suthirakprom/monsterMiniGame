class Hi1 implements Runnable       // Runnable is a functional interface
{
    public void run()
    {
        for (int i=1;i<=5;i++)
        {
            System.out.println("Hi");
            try { Thread.sleep(1000); } catch (Exception e) {}
        }
    }
}

class Hello1 implements Runnable
{
    public void run() {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Hello");
            try { Thread.sleep(1000); } catch (Exception e) {}
        }
    }
}


public class ThreadRunnable {

    public static void main(String[] args) {

        Runnable obj1 = new Hi1();
        Runnable obj2 = new Hello1();

        Thread t1 = new Thread(obj1);   // run just like the normal object
        Thread t2 = new Thread(obj2);   // but by using implements Runnable

        t1.start();
        t2.start();

    }

}
