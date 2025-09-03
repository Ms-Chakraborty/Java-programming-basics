package array;

import java.util.Scanner;

public class binsearch {
    public static boolean search(int marks[],int key){
        int start=0;
        int end=marks.length-1;
        while(start<=end) {
            int mid=Math.round((end+start)/2);
            if(marks[mid]==key){
                System.out.println("Found at "+mid+" index of array");
                return true;
            }
            else if( key<marks[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int marks[]={23,67,89,95,102,112,143,208};
        System.out.println("Enter the value you are looking for:");
        int key;
        try(Scanner sc=new Scanner(System.in)){
            key=sc.nextInt();
        }
        System.out.println("The presence of the value in the array is"+search(marks, key));

    }
}
