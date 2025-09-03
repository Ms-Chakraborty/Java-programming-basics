package loops;
import java.util.*;
public class primeornot {
    public static void main(String args[]) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number you want to check-");
            int num=sc.nextInt();
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    System.out.println("not prime");
                    break;
                }
               
            }
            System.out.println("Prime");
        }

    }
}
