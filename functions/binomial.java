package functions;

import java.util.Scanner;

public class binomial {
    public static int bin(int n, int r){
        int numerator=factorial(n);
        int denominator=factorial(r)*factorial(n-r);
        int ncr=numerator/denominator;
        return ncr;
    }
    public static int factorial(int n){
        int fact=1;
        for(int i=n;i>=2;i--){
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the first number:");
            int a=sc.nextInt();
            System.out.println("Enter the second number:");  
            int b=sc.nextInt();
            int nom= bin(a, b);
            System.out.println("The product is: "+nom);
    }
    

    }
}
