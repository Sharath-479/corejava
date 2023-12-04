import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    public int age;
    public String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

   
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }



    
}
public class ComparingClassWithComparator {
    public static void main(String a[])
    {
        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i , Student j){
                if(i.age>j.age)
                    return 1;
                else
                    return -1;
            }
        };

        List<Student> stu = new ArrayList<>();
        stu.add(new Student(23,"sath"));
        stu.add(new Student(24,"sharath"));
        stu.add(new Student(42,"sachin"));
        stu.add(new Student(30,"siraj"));

        Collections.sort(stu,com);  // here stu is not defined. 
        // So we hve to write logic of our own. For wrapper class, default 
        //comparable method is implemented.
        // we can implement interface comparable for student class. 
        // then there is no need of com in line 42.
        // we need to write logic in compareTo() method.
        // class Student implements Comparable<Student>

        for(Student s:stu){
            System.out.println(s);
        }
        
    };

}

