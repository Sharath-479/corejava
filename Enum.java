enum Status{
    Running, Success, Failed, Pending;
}

public class Enum {
    public static void main(String a[])
    {
        Status s = Status.Pending;

        switch(s)
        {
            case Running:
                System.out.println("All Good");
                break;
            case Pending:
                System.out.println("please wait");
                break;
            case Success:
                System.out.println("Done");
                break;
            default:
                System.out.println("Try again");
                break;
                
        }
        
        if(s == Status.Running){  // if else statement using enum.
            System.out.println("All Good");
        }
        else if(s == Status.Pending){
            System.out.println("Please wait");
        }
        else if(s == Status.Failed){
            System.out.println("Try again");
        }
        else{
            System.out.println("done");
        }

        
        
        Status[] ss = Status.values();
        for ( Status i : ss) {
            System.out.println(i + " : " + i.ordinal());
        }
    }
}
