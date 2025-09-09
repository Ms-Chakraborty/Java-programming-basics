package divideandconquer;

public class invert {
    public static int mergesort(int[] arr, int start, int end){
        if(start >= end){
            return 0;
        }
        int mid = start + (end - start) / 2;
        int leftcount = mergesort(arr, start, mid);
        int rightcount = mergesort(arr, mid + 1, end);
        int mergecount = conquer(arr, start, mid, end);
        return leftcount + rightcount + mergecount;
    }

    public static int conquer(int[] arr, int start, int mid, int end){
        int[] merged = new int[end - start + 1];
        int count = 0;
        int i = start, j = mid + 1, k = 0;

        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
                count += (mid - i + 1); // Count inversions
            }
        }
        while(i <= mid){
            merged[k++] = arr[i++];
        }
        while(j <= end){
            merged[k++] = arr[j++];
        }
        // Copy merged array back to original
        for(int l = 0; l < merged.length; l++){
            arr[start + l] = merged[l];
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(mergesort(arr, 0, arr.length - 1)); // Output: 3
    }
}