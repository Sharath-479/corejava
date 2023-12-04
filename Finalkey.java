// final keyword can be used for variable, method, class

// if Final keyword is used before class A  ->  " final class A" 
class A{

    public  /*final*/ void show(){
        System.out.println("Sharath");
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }

}

class B extends A{
        // Here Class A is final that means we cannot inherit A class. Final Keyword stops from inheritance.

        public void show(){
            System.out.println(" Sath");
        }
        // if keep final keyword before method we cannot over ride the methods.
}



public class Finalkey
{
    public static void main(String a[])
    {
    //     final int num=8;   // final is same like constant in c++. we can't change the value.
    //     num=9;
    //     System.out.println(num);
     }
}