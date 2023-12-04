class Fun
{
    public int add(int a,int b){
        return a+b;
    }
}
class Fun1 extends Fun{

    public int add(int a, int b){   //here method of class Fun1 over riding add method in class Fun.
        return a+b+1;
    }
}


public class Oride
{
    public static void main(String a[])
    {
        Fun1 obj = new Fun1();

        int r1= obj.add(4,5); 

        System.out.println(r1);
    }
}