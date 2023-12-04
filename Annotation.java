class A 
{
    public void show(){
        System.out.println("In A show");
    }
}
class B extends A 
{
    @Override
    public void show(){ //  Annotations in Java provide additional information to the compiler and JVM. An annotation is a 
        // tag representing metadata about classes, interfaces, variables, methods, or fields. Annotations do not impact 
        // the execution of the code that they annotate
        System.out.println("In B show");
    }
}


public class Annotation {
    public static void main(String a[])
    {
        B obj = new B();
        obj.show();
    }
}
