
class A{

    public void show1(){
        System.out.println("in A show");
    }

}

class B extends A
{
    public void show2(){
        System.out.println("in B show");
    }
}


public class UpandDownCasting {
    public static void main(String a[]){

        // double num=9.8;
        // int n=(int) num; // typecasting

        // System.out.println(n);

        A obj = new B(); // upcasting  "parent refernce child object" 
        obj.show1();  

        B obj1 = (B) obj; // here obj of B but don't have method show2 method because it is type of A class.
        obj1.show2();     // To solve this we use downcasting.


    }
    
}
