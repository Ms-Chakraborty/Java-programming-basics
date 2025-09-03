package array;

public class subarray {
    public static void printsub(int arr[]){
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.print(" | Sum: " + sum);
                maxSum = Math.max(maxSum, sum);
                minSum = Math.min(minSum, sum);
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + ts);
        System.out.println("Maximum subarray sum: " + maxSum);
        System.out.println("Minimum subarray sum: " + minSum);
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        printsub(numbers);
    }
}
