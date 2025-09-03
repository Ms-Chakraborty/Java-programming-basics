package loops;
import java.util.*;
public class whileloop {
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the maximum no. you want-");
            int n=sc.nextInt();
            int num=0;
            while(num<n){
                ++num;
                System.out.println(num);
            }
        }
    }
}
