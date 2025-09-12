package loops;
import java.util.*;
public class cont {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            
            do { 
                System.out.println("Enter the number:");
                int num = sc.nextInt();
                if(num%10==0){
                    continue;
                }
            System.out.println(("the number was:")+(num));
            } while (true);
        }
    }
}//

