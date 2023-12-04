public class Inher
{
    public static void main(String a[])
    {
        VeyAdvCalc obj = new VeyAdvCalc();

        int r1=obj.add(10,3);
        int r2=obj.sub(10,3);
        int r3=obj.multi(10,3);
        int r4=obj.div(10,3);
        double r5=obj.power(4,2);

        System.out.println(r1+ " "+ r2 + " " + r3 + " " + r4 + " " + r5);
    }
}

// Java Support Single. Mutli level.

// java doesn't support Multiple inheritance due to Ambiguity. 

//A class y()method              B class y()method
// If both A and B are parents class of a child class C. If we call Y method Obj is in ambiguity which method to call. 