class Hi extends Thread
{
    public void run()       // using run here when the Thread start this function will be called
    {
        for (int i=1;i<=5;i++)
        {
            System.out.println("hi");
            try { Thread.sleep(1000); } catch (Exception e) {}
        }

    }
}

class Hello extends Thread
{
    public void run()       // using run here when the Thread start this function will be called
    {
        for (int i=1;i<=5;i++)
        {
            System.out.println("Hello");
            try {Thread.sleep(1000);} catch (Exception e) {}
        }
    }
}


public class ThreadDmo
{

    public static void main(String[] args)
    {

        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();       //  both of the function will be called at the same time
        obj2.start();       // that is why we use thread


    }

}







