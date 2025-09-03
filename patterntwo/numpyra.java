package patterntwo;

import java.util.Scanner;

public class numpyra {
    public static void num_invert_pyra(int height){
        System.out.println("----Pyramid pattern----");
        for(int i=0;i<=(height-1);i++){//line traversal
            for(int j=1;j<=(height-i);j++){//print number
                System.out.print(j);
            }
            for(int j=1;j<=i;j++){//print spaces
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Height of the num pyramid:");
            int height=sc.nextInt();
            num_invert_pyra(height);
        }
    }
}
