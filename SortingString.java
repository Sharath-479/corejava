import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingString {
    public static void main(String a[])
    {
        Comparator<String> com = new Comparator<String>(){
            public int compare(String i , String j){
                if(i.length()> j.length())
                    return 1;
                else
                    return -1;
            }
        };

        List<String> nums = new ArrayList<>();

        nums.add("nani");
        nums.add("sharath");
        nums.add("sathw");
        nums.add("sahith");
        nums.add("sucharitha");


        Collections.sort(nums,com);

        for(String i : nums){
            System.out.println(i + " : " + i.length() );
        }
    }
    
}
