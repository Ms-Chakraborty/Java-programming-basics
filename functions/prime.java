package functions;

import java.util.*;
public class prime {
    public static boolean Prime(int n){
        boolean isPrime=true;
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
    return isPrime;
    }
    public static void main(String args[]) {
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the number you want to check whether prime or not:");
        int n=sc.nextInt();
        Prime(n);
        System.out.println("Prime Status: "+Prime(n));
    }
        
    }
}
