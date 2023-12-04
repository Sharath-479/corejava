public class Wrap {
    public static void main(String a[])
    {
        int num1=7;  //primitive type

        //Integer num2= new Integer(num1);  // boxing -> storing primitive type into object.

        Integer num2 = num1;  // auto-boxing -> it automatically store primitive type into object.


        // int num3 = num2.intValue(); // unboxing  -> storing value from object to primitive type.

        int num3 = num2; // auto-unboxing -> storing value automatically from object to primitive type.


        String str = "12";

        int num=Integer.parseInt(str);  // here method in Integer class parseInt() helps to covert str type to integer type.

        System.out.println(num*2); 
    }
}


