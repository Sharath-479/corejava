public class Throw {
    public static void main(String a[])
    {
        int i=20;
        int j=0;

        try{
            j=18/i;
            if(j==0){
                throw new ArithmeticException("MSG to print");
            }
            }
        catch(ArithmeticException e){
                if(j==0)
                    System.out.println("J can't be zero");
                
                else
                    System.out.println("I can't be zero. It is undefined");
                
            }
        catch(Exception e){
                System.out.println("Error. Please the code..");
            }

            System.out.println(j);
    }
}
// we can create our own expection by creating a class which extends expection class. 
