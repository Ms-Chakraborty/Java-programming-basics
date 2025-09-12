package loops;
import java.util.*;

public class exitmultipleten {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int num;
            do { 
                System.out.println("Enter the number:");
                num = sc.nextInt();
                System.out.println(num);
            } while (num % 10 != 0);
        }
    }
}//this program will exit when the user enters a number that is a multiple of 10.   

