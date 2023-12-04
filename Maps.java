import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String a[])
    {
        Map<String, Integer> students = new HashMap<>();

        students.put("Sharath", 85);
        students.put("Shiva", 87);
        students.put("Sath", 100);
        students.put("Chintu", 73);
        // here if have adding existing key. Map just replace with new entry.

        System.out.println(students.get("Sath"));

        System.out.println(students.keySet());

        for (String key  : students.keySet()) {
            System.out.println(key+ " : " + students.get(key));
        }
        
        
    }
    // Difference b/w hashtable and hashmap
    // for synchronized threads use HashTable.
}
