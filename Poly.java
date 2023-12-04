// poly--> many   morphism --> behaviour
//dynamic method dipspatch example for runtime polymorphism

class A
{
    public void show(){
        System.out.println("in A class");
    }
}
class B extends A
{
    public void show(){
        System.out.println("in B class");
    }
}
class C extends A
{
    public void show(){
        System.out.println("in C class");
    }
}

public class Poly
{
    public static void main(String a[]){
        A obj=new A();
        obj.show();

        obj=new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}

// irrespective of type of object or the variable, it totally depends on the object we create/have. 
//Here show method will be called on run time. Example possible for parent and child classes.