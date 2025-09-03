package array;
import java.util.Scanner;
public class numcheckw {

    public static boolean check(int arr[],int n){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array u want:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        boolean result=check(arr, n);
        System.out.println("There is repetition of elements in the array:"+result);
        sc.close();
    }
}

