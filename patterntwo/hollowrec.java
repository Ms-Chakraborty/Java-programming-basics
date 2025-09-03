package patterntwo;
import java.util.*;

public class hollowrec{ 
    public static void hollow_rec(int length, int breadth){
    for (int i=1;i<=breadth;i++){
        for(int j=1;j<=length;j++){
            if(i==1||i==breadth||j==length||j==1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

            }
            System.out.println();
        }
    }

    public static void main(String Args[]){
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the length of the hollow Cylinder:");
        int length=sc.nextInt();
        System.out.println("Enter the breadth of the hollow Cylinder:");
        int breadth=sc.nextInt();
        hollow_rec(length, breadth);

    }
    }
}
