class Mobile
{
    String brand;
    int price;
    static String name;


    public Mobile(){
        brand="";
        price=200;
        System.out.println("I'm in constructor"); // to initialize object for default value when object gets created.
    }

    static{
        name="Phone";
        System.out.println("I'm n static block");  // to initialize static variables and static block calls once only.
        // always static be first because of class loader. firstly class load and object gets initiated.so static block being 
        //called once only.
        // No static block called when their is no object.Like wise no class gets loads in class loader.  


        // for loading class without any object we can use """class.forName("class name")""" syntax to laod class and automatically
        // static will be called.
    }


    public void show(){
        System.out.println(brand +"-"+ price +"-"+ name);
    }

    public static void show1(){
        System.out.println(name); //we can use only static variable in static method.

        // we cannot use non static variable inside static methods because static method doesnot have objects to refer.
        // to use then we have to send obj as a argument 
        //show1(Mobile object){
        //  sop(obj.brand + obj.price);
        //}
    }
}
public class svsm
{
    public static void main(String a[])
    {
        Mobile m1=new Mobile();
        m1.brand="Apple";
        m1.price=1500;
        Mobile.name="SmartPhone";

        Mobile m2=new Mobile();
        m2.brand="Google";
        m2.price=1300;
        Mobile.name="SmartPhone";

        Mobile m3=new Mobile();

        m1.show();
        m2.show();
        m3.show();



        Mobile.show1();   // we use class name instead of obj name.

    }
}