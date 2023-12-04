class Demo
{
    public void show()
    {
        System.out.println("In A Show");
    }
}


public class Anony {
    public static void main(String a[])
    {
        A obj = new A()
        {
            
        public void show()    // creating a inner class but no name for class then it is Anonymous inner class.
        {
            System.out.println("In new Show");
        }
        
        };

        obj.show();
        
    }
}
