interface  A // interface doesn't have memory in heap.
{
    int phone = 9396;
    String area = "jn"; // By default variables are static and final.
    void show();
    void config(); // By default every methods is public and abstract.
} 

interface X  // We can say that one class can implements many interfaces and all methods should be implemented.
{
    void run();
}

interface Y extends X  // Here method run gets inhert by interface X. 
{

}

class B implements A , X // interface -> class implements keyword is used and only methods are implemented not variables. 
{
    public void show(){
        System.out.println("In B class show ");
    }
    public void config(){
        System.out.println("In B class config");
    }

    public void run(){
        System.out.println("In class B run");
    }

}



public class Interf {
    public static void main(String a[])
    {
        A obj = new B();
        obj.show();
        obj.config();
    }
}
