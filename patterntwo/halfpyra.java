package patterntwo;
import java.util.*;
public class halfpyra {
    public static void pyra(int height){
        for(int i=1;i<=height;i++){//line traversal
            for(int j=1;j<=(height-i);j++){//print spaces in a line first
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");//print stars in a remaining line
            }
            System.out.println();

        }
    }
    public static void main(String args[]) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the height of half inverted pyramid:");
            int height=sc.nextInt();
            pyra(height);
        }
    }
}
