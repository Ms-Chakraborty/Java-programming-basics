package functions;
import java.util.*;
public class palindromecheck {
    public static int revnum(int n){
        int lastdigit=0;
        int rev=0;
        int i=0;
        while(n>0){
            
            lastdigit=n%10;
            n=n/10;
            rev+=lastdigit*(int)(Math.pow(10,i));//rev=rev*10+lastdigit;
            i++;
        }
        return rev;
    }
    public static boolean Palindrome(int n){
        boolean ispalindrome=false;
        
        if(n==revnum(n)){
            ispalindrome=true;
        }
        return ispalindrome;
    }
    public static void main(String args[]) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("Enter the number you want to check:");
            int n=sc.nextInt();
            boolean result=Palindrome(n);
            System.out.println("Palindrome status : "+result);

        }
        
    }
}
