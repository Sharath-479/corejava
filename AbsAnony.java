 abstract class A
{
    public abstract void show();  // We abstract method implementation done in Anonymous inner class. 
  
    
}

public class AbsAnony {
    
    public static void main(String a[])
    {
        A obj = new A(){
            public void show()
            {
                System.out.println("In Anony inner class show");
            }
        };

        obj.show();  // we cannot initiate object for abstract class but here we are initiated object of Anonymous inner class.
        
    }
}
