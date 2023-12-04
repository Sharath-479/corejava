@FunctionalInterface
interface A 
{
    int add(int i, int j);
}




public class LambdaReturn {
    public static void main(String a[])
    {
        A obj = (i,j) ->    // we can write directly A obj = (i,j) -> i+j;  // automatically return a expression.
        {
            return i+j;
        };
        int ans= obj.add(5,7);
        System.out.println(ans);
    }
}
