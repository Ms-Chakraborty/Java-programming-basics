package divideandconquer;

public class majorityelement {
    public static int majorityElement(int[] arr){
        return majority(arr, 0, arr.length-1);
    }
    public static int majority(int[] arr, int start, int end){
        if(start==end){
            return arr[start];
        }
        int mid=start+(end-start)/2;
        int leftmajor=majority(arr, start, mid);        
        int rightmajor=majority(arr, mid+1, end);
        if(leftmajor==rightmajor){
            return leftmajor;
        }
        int leftcount=count(arr, leftmajor, start, end);
        int rightcount=count(arr, rightmajor, start, end);
        return leftcount>rightcount ? leftmajor : rightmajor;
    }
    private static int count(int[] arr, int num, int start, int end){
        int count=0;
        for(int i=start;i<=end;i++){
            if(arr[i]==num){
                count++;
            }
        }
        return count;
    }
}
