
import java.util.*;
public class javaBasics {
    public static void main(String args[]) {
        //sum of two numbers
        int a=10;
        int b=5;
        System.out.println(2*(a+b));
        System.out.println(a);
        try(Scanner sc =new Scanner(System.in)){
        //input from user
       /* String input=sc.next();//input is a variable name
        System.out.println(input);
        
        String name=sc.nextLine();//input is a variable name
        System.out.println(name);*/
        int number=sc.nextInt();
        System.out.println(number);
        float price= sc.nextFloat();
        System.out.println(price);
        
        }

    }
}