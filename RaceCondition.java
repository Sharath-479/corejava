class Counter
{
    public int count;
    public synchronized void increment(){
        count++;
        // here we are using synchronized, to make threads call one after other.
        // if one thread is working with increment method, then other thread can't work.
    }

}


public class RaceCondition {
    public static void main(String a[]) throws InterruptedException
    {
        Counter c = new Counter();

        Runnable obj1 = () -> 
        {
            for(int i=1; i<=1000; i++){
                c.increment();
            }
        };

        Runnable obj2 = () ->
        {
            for(int i=1;i<= 1000; i++){
                c.increment();
            }
        };

        Thread t1 =new Thread(obj1);
        Thread t2 =new Thread(obj2);

        t1.start();
        t2.start();

        
        t1.join();
        t2.join();
        

        System.out.println(c.count);
    }
}
