// Implementing threads in lambda expression. 
// here runnable are Functionl Interface. And it has run() method.

public class ThreadLambda {
    public static void main(String a[])
    {
        Runnable obj1 = ()->
        {
            for(int i=0;i<5;i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Something is wrong");
                }
                
            }
        };
        
        Runnable obj2 = ()->
        {

            for(int i = 0;i<5;i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        };

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start();
    t2.start();
    
    }
}
