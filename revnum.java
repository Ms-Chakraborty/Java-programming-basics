package loops;
import java.util.*;
public class revnum {
    public static void main(String args[]) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number you wish:");
            int num=sc.nextInt();
            while(num>0){
                int lastdigit=num%10;
                System.out.print(lastdigit);
                num=num/10;
            }
        
        }
    }
}             
