import java.util.Scanner;

// filepath: d:\Java programming basics\array\maxsubopti.java
public class maxsubopti {
    public static void optimal(int arr[], int n) {
        int pre[] = new int[n];
        pre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i-1] + arr[i];
        }
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currsum = (i == 0) ? pre[j] : pre[j] - pre[i-1];
                System.out.println("The sum of subarray from " + i + " to " + j + " = " + currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("The maximum sum of subarray is: " + maxsum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array you want:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <(n-1); i++) {
            System.out.print("Enter the " + i + "th element of array: ");
            arr[i] = sc.nextInt();
        }
        optimal(arr, n);
        sc.close();
    }
}