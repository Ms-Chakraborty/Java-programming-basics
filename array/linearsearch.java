package array;

import java.util.*;

public class linearsearch {
    public static boolean linear(int marks[], int key){
        for (int i = 0; i < marks.length; i++) {
            if(marks[i]==key){
                return true;
            }
            
        }
        return false;
    }
    public static void main(String args[]){
        int marks[]={98,99,100,54,87};
        System.out.print("Enter the value you are looking for in the array:");
        int key; // Declare key here
        try(Scanner sc=new Scanner(System.in)){

             key=sc.nextInt();
            linear(marks,key);
        }
        System.out.println("The presence of " + key + " in the array is: " + linear(marks,key));

    }
}
