import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class SetCollection {
    public static void main(String a[])
    {
        Set<Integer> num = new HashSet<Integer>();

        num.add(15);
        num.add(7);
        num.add(91);
        num.add(15);
        num.add(11);  // In set we can't entry duplicate value.
        // No indexing for set.
        // If we want sorted value we can TreeSet.


        for (int n : num) {
            System.out.println(n);
        }
        System.out.println("---------------------------------");

        System.out.println("Iterable method");

        Iterator<Integer> values = num.iterator();
        
        while(values.hasNext())
            System.out.println(values.next());

        System.out.println("---------------------------------");

        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(15);
        nums.add(7);
        nums.add(91);
        nums.add(15);
        nums.add(11);
        

        for (int n : nums) {
            System.out.println(n);
        }



    }
    
}
