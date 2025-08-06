
import java.util.*;
public class avg{
    public static void main(String args[]){
        try(Scanner sc= new Scanner(System.in)){
        System.out.println("Enter the first number");
        float a=sc.nextFloat();
        System.out.println("Enter the second number");
        float b=sc.nextFloat();
        System.out.println("Enter the third number");
        float c=sc.nextFloat();
        float average=((a+b+c)/3);
        System.out.println(average);
        }
    }
   

}

