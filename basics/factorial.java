package loops;
import java.util.*;
public class factorial {
    public static void main(String args[]) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number you want to find the factorial of-");
            int num=sc.nextInt();
            int fact=1;
            if(num<0){
                System.out.println("Invalid Number");
            }else if(num==0 && num==1){
                System.out.print(("The factorial is")+(num));
            }else{
                System.out.println("The factorial of "+num+" is-");
                for(int i=num;i>=2;i--){
                fact*=i;
            }
            System.out.println(fact);

            }
            
        }
    }
}
