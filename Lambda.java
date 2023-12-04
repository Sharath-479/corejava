@FunctionalInterface
interface A 
{
    void show();
}

public class Lambda {
    public static void main(String a[]){
        A obj = () -> System.out.println("In show");
        obj.show();
    }
    // Here if there is any parameter, we can direct keep without brackets.

    // like this : A obj = i -> SOP("In show" + i);
    // Calling obj  : obj.show(5);    and Interface we mention show(int i).
    
}
