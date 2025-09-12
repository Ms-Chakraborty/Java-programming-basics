package loops;

import java.util.*;
public class squarepattern {
    public static void main(String args[]) {
      try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the dimension of the square-");
        int n=sc.nextInt();
        int i;
        for(i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
      }  
    }
    
}
