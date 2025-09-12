package loops;
import java.util.*;
public class sumwhile {
    public static void main(String Args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number till which you want the sum to be calculated-");
            int n=sc.nextInt();
            int sum=0;
            int counter=0;
            while(counter<n){
                ++counter;
                sum+=counter;
               
                
            }
            System.out.println(sum);
        }
    }
    
}
