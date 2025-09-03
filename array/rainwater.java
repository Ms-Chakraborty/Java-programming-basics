package array;

import java.util.Scanner;

public class rainwater {
    public static int rain(int arr[], int n) {
        int trapwater = 0;
        int leftmax[] = new int[n];
        leftmax[0] = arr[0];
        int rightmax[] = new int[n];
        rightmax[n-1] = arr[n-1];
        for (int i = 1; i < n; i++) { // leftmax aux array 
            leftmax[i] = Math.max(arr[i], leftmax[i-1]);
        } 
        for (int a = n-2; a >= 0; a--) { // rightmax aux array
            rightmax[a] = Math.max(arr[a], rightmax[a+1]);
        }        
        for (int b = 0; b < n; b++) {
            int h = Math.min(rightmax[b], leftmax[b]);
            int hw = h - arr[b];
            if (hw > 0) {
                trapwater += hw;
            }   
        }
        return trapwater;  
    }    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array");
        int k = sc.nextInt();
        int arr[] = new int[k];
        System.out.println("Enter the elements you want in the array");
        for (int m = 0; m < k; m++) {
            arr[m] = sc.nextInt();
        }
        int trapwater = rain(arr, k);
        System.out.println(trapwater);
        sc.close();
    }
}

