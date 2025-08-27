public class Multithreading {
      public static void main(String[] args)
      {
          System.out.println("main thread start");
          MyThread m1 = new MyThread();
          m1.start();
          System.out.println("main thread End");
      }
}
class MyThread extends Thread
{
    public void run()
    {
        System.out.println("my thread start");
        try
        {
            for (int i=0; i<=10; i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("my thread end");
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}

// pending