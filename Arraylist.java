import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String a[])
    {
         // Collection<Integer> nums = new ArrayList<Integer>();  // Collection don't have indexing.Instead we can use List Interface. 
        int i=0;
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5); // here If we not mention Integer class then add() method insert values as object type. 
        nums.add(10);
        nums.add(15);
        nums.add(18);
        
        for(int n : nums){
            System.out.println(n + " : " + nums.get(i) + " : " + nums.indexOf(n));
            i++;
        }

    }
    
}
