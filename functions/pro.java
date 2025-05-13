package functions;
import java.util.*;
public class pro {
    public static int multiply(int num1, int num2){
        int product=num1*num2;
        return product;
    }
    public static void main(String args[]) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the first number:");
            int a=sc.nextInt();
            System.out.println("Enter the second number:");  
            int b=sc.nextInt();
            int mul= multiply(a, b);
            System.out.println("The product is: "+mul);
    }
    

    }
}
