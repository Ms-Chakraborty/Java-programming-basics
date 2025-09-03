package array;

public class rotatearray {
    public static void rotate(int arr[], int d, int n) {
        d = d % n; // Handle cases where d >= n
        reverse(arr, 0, n - 1);
        reverse(arr, 0, d-1 );
        reverse(arr, d, n - 1);
        
    }

    private static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static int[] copyarr(int arr[],int k){
        int n=arr.length;
        int carr[]=new int[n];
        for (int i = 0; i < n; i++) {
            if(i+k<n){
            carr[i+k]=arr[i];
            }
            else{
                carr[(i+k)%n]=arr[i];
            }
        }
        return carr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2; // Number of positions to rotate
        int n = arr.length;

        rotate(arr, d, n);
        copyarr(arr, n);
        System.out.print("Rotated array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("Rotated array from copy method: ");
        for (int j : copyarr(arr, n)) {
            System.out.print(j + " ");
        }
    }
    
}
