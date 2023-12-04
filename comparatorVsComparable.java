import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorVsComparable {
    public static void main(String a[])
    {

        Comparator<Integer> com = new Comparator<Integer>() {
            
            public int compare(Integer i , Integer j){
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(15);
        nums.add(91);
        nums.add(43);
        nums.add(77);


        Collections.sort(nums , com); // custom logic for comaparing values.

        for (int n : nums) {
            System.out.println(n);
        }
    }
}
