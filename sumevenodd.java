import java.util.*;
public class sumevenodd {
    public static void main(String args[]) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("Enter the number of your choice:");
            int num=sc.nextInt();
            int even_sum=0;
            int odd_sum=0;
            int choice;
            do{
                if(num%2==0){
                    even_sum+=num;
                }else{
                    odd_sum+=num;
                }
                System.out.println("Enter 1 if you want to keep going, 0 if you want to exit-");
                choice=sc.nextInt();
                if(choice==0){
                    break;
                }
            }while (choice==1);
            System.out.println("The sum of even numbers is "+even_sum); 
            System.err.println("The sum of odd numbers is "+odd_sum);
        }
    }
}
