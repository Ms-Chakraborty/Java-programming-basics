package functions;

import java.util.Scanner;

public class sum {
    public static int sumofdigits(int n){
        int add=0;
        int lastdigit=0;
        while(n>0){
            lastdigit=n%10;
            add+=lastdigit;
            n=n/10;
        }
        return add;
    }
    public static void main(String args[]) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number you want:");
            int n=sc.nextInt();
            System.out.println("Sum of the digits : "+sumofdigits(n));
        }
        
    } 
}
