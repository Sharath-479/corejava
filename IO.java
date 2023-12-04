import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IO
{
    public static void main(String a[]) throws IOException{

        System.out.println("Enter number");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());  // used previously.
        System.out.println(num);
        // but Java introduced Scanner. 

        System.out.println("New method for taking inputs from user by scanner");

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println(num1);

        bf.close(); //here bf is a resource. It is like a file. If it is open, we have to close it .


    }
}