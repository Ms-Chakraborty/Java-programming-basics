package array;

public class maxsubarray {
    public static void maxarray(int arr[]){
        int cursum=0;
        // Initialize maxsum to the smallest possible integer value
        int maxsum=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                
                cursum=0;
                System.out.print("Subarray from index " + i + " to " + j + ": ");
                // Calculate the sum of the subarray from i to j
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    cursum+=arr[k];
                }
                System.out.println();
                System.out.println("Sum of the array:"+cursum);
                if(maxsum<cursum){
                    maxsum=cursum;
                }
            
            }
            
        }
        System.out.println("Maximum sum of array: " + maxsum);
    }
    public static void main(String[] args) {
        int arr[]={16,89,45,76,98};
        maxarray(arr);
    }
    
}
