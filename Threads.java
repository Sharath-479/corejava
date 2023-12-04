class A extends Thread
{
    public void run(){

        for(int i=1;i<=100;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { // This method help to wait the thread for 10 milli second.
                e.printStackTrace();
            };
        }
}
}

class B extends Thread
{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            };
        }
        
    }
}

public class Threads {
    public static void main(String a[]){
        A obj1 = new A();
        B obj2 = new B();

        // obj2.setPriority(10); -> 10 being highest.  we can set the preference .
        // types -> Max, Norm, Min. 

        obj1.start(); // here we are trying to optimize the code to print hi-hello in sequence.
        // But it totally depend on schedular. 
        try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            };

        obj2.start(); // here compiler see start method it search for run method to exceute (In own obj).
    }
}
