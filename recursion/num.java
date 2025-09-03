package recursion;
import java.util.*;
public class num {
    public static void pin(int n){
        if(n>0){
        System.out.print(" "+n+" ");
        pin(n-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number u want to print from ");
        int n=sc.nextInt();
        pin(n);
    }
}
