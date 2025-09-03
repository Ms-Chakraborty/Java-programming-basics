package recursion;
import java.util.*;
public class fact {
    public static int factorial(int n){
        int factorial;
        if(n==0){
            factorial=1;
        }else{
            factorial=n*factorial(n-1);
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose factorial u want to find: ");
        int n=sc.nextInt();
        System.out.println("The factorial is : "+factorial(n));
        sc.close();
    }
}
