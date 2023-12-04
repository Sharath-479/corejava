abstract class Car
{
    public abstract void drive();  // abstract method should be in abstract class only but not vice versa. 
    public abstract void fly();// we cannot create object of abstract class.And we need oberride the abstract method in child class.


    public void music(){
        System.out.println("Playing msuic");
    }
}

abstract class WagonR extends Car
{
    public void drive(){
        System.out.println("Driving...");  // If class inhert then all  abstract methods should in child if not it should be 
    }                                        // a abstract class.
}

class UpdatedWagonR extends WagonR{  // concrete class  -> which is not a abstract class.
    public void fly(){
        System.out.println("Flying...");
    }
}




public class Abstrac {
    public static void main(String a[])
    {
        Car obj = new UpdatedWagonR();
        obj.music();
        obj.drive();
        obj.fly();
    }
}
