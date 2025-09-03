package twodarray;

import java.util.Scanner;

public class basics {
    public static boolean  search(int arr[][],int key){
        int n=arr.length;
        int m=arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]==key){
                    System.out.println("Present in "+i+" th row and "+j+" th column of the matrix");
                    return true;
                }
            }
        }
        System.out.println("The key is not found");
        return false;
    }
    public static void print(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        int n=arr.length;
        int m=arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        print(arr);
        search(arr, 5);
    }
}
