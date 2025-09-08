package divideandconquer;

public class rotatearr {
    public static int search(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        //job
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        //mid on l1
        if(arr[start]<=arr[mid]){
            //case a:left of mid
            if(arr[start]<=target && target<=arr[mid]){
                return search(arr, target, start, mid-1);
            }else{
                //case b:right of mid on l1
                return search(arr, target, mid+1, end);
            }

        }else{//mid on l2
            //case c:right of mid on l2
            if((arr[mid])<=target && target<=arr[end]){
                return search(arr, target, mid+1, end);
            }else{
                //case d: left of mid on l2
                return search(arr, target, start, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={4,8,5,1,3,2};
        int target=3;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
}
