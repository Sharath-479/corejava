public class Expection {
    public static void main(String a[]){
        int i=3;
        int j=0;
        int b[]= new int[5];
        String s =null;

        try {
            j=18/i;// if i=0 then it is a error and catch block gets exceuted. We can use try-catch block more time as per requirement.
            System.out.println(b[4]);
            System.out.println(s.length());
        }
        catch(ArithmeticException e){  // which Expection found in runtime they it check for the type of expection as per catch block 
            // if it doesn't found default expection will be printed, or if it match that catch block wii be exceuted.
            System.out.println("Can't divide by zero.");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound check it ");
        }
         catch (Exception e) { // keep this default expections at the last.
           System.out.println("Something went wrong" + e);
        }
        
        System.out.println(j);
    } // Try-catch will exceuted if there is any expection only otherwise it get skipped.
}
