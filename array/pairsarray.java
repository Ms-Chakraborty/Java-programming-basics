package array;

import java.util.Scanner;

public class pairsarray {
    public static void pair(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print(arr[i] + "," + arr[j] + " ");
            }
            System.out.println();
        }
            
    }
     public static void main(String args[]) {
        
        
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of elements you want in the array");
            int k=sc.nextInt();
            int arr[] = new int[k];
            System.out.println("Enter the elements you want in the array");
            for(int m=0;m<=k-1;m++){
                arr[m]=sc.nextInt();
            }
        System.out.println("The pairs in the array are:");
        pair(arr);
        sc.close();
        }
        
}
   
        