public class FinallyTryCatch {
    public static void main(String a[])
    {
        int i=0;
        int j=0;

        try{
            j=15/i;
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("Bye");
            // Iresspective of exception found, Finally block will exceute.
        }

        System.out.println(j);
    }
}
