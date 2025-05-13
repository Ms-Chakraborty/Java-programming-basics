package functions;
import java.util.*;
public class dectobin {
    public static void  convertbin(int n){
        while(n>0){
            int i=n%2;
            n=n/2;
            System.out.print(i);
        }
    }
    public static void main(String args[]) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the decimal number you can to convert to bin:");
            int n=sc.nextInt();
            System.out.println("The binary value: ");
            convertbin(n);
        }
    }
    
}
