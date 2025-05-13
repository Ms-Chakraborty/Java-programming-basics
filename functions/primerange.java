package functions;
import java.util.*;
public class primerange {

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
    public static void printprime(int n){
        for(int i=2;i<=n;i++){
            if(Prime(i)==true){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]) {
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the number upto which you want to find primes:");
        int n=sc.nextInt();
        printprime(n);
        
    }
        
    }

}

