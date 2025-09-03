package patterntwo;

import java.util.*;
public class floyd{
    public static void floyd_triangle(int n){
        int k=1;
        System.out.println("----Floyd Triangle----");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+k+" ");
                k++;
            }
            for(int j=1;j<=(n-1);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[] ) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the height of the triangle:");
            int n=sc.nextInt();
            floyd_triangle(n);
        }
    }
}
