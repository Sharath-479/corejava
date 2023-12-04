import java.util.Arrays;
import java.util.List;


public class StreamApi
{
    public static void main(String a[])
    {
        List<Integer> nums = Arrays.asList(1,5,8,10,13,17);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int res= s3.reduce(0, (c,e) -> c+e);
        

        // System.out.println(res);
        // s3.forEach(n -> System.out.println(n));


        // shortcut way
        

        int ans = nums.stream()
                      .filter(n -> n%2==0)
                      .map(n -> n*2)
                      .reduce(0, (c,e) -> c+e);

        System.out.println(ans);


        
    }
}