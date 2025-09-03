package sorting;


public class bubble {
    public static int[] bub(int arr[]){
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            int swap = 0;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0){
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {4, 6, 2, 9};
        arr = bub(arr);
        System.out.print("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}