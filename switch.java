class switchdemo
{
    public static void main(String a[]){

        String day="tue";

        // switch(day)     (old version)
        // {
        //     case "sat", "sun":
        //         System.out.println("6am");
        //         break;
        //     case "mon":
        //         System.out.println("8am");
        //         break;
        //     default:
        //         System.out.println("7am");
        // }

        switch(day){
            case "sat", "sun" -> System.out.println("6am");
            case "mon" -> System.out.println("8am");
            default -> System.out.println("7am");
        }

    }
}