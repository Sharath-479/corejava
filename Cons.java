class Con
{
    public int age;
    public String name;


    public Con() // default constructor
    {
       age=12;
       name="Sharath"; 
    }

    public Con(int age, String name) //parameterized constructor
    {
        this.age=age;
        this.name=name;
    }
}

public class Cons
{
    public static void main(String a[])
    {
        Con obj=new Con();
        Con obj1=new Con(18,"sath");

        System.out.println(obj.age + " "+ obj.name);
        System.out.println(obj1.age + " "+ obj1.name);
    }
}


//Next Topics to leaned 
//refer java book


//concept of Super() and This() methods 
//Anonymous object