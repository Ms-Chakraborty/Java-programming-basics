package divideandconquer;
public class mergesort{
    public static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesort(int[] arr, int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        mergesort(arr, start, mid);
        mergesort(arr, mid+1, end);
        merge(arr, start, mid, end);

    }
    public static void merge(int[] arr, int start, int mid, int end){
        int temp[]=new int[end-start+1];
        int i=start;//iterator for left part
        int j=mid+1;//iterator for right part
        int k=0;//iterator for temp arr
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){//if right side had ended and left side still has some elements left
            temp[k++]=arr[i++];
        }
        while(j<=end){//if left side had ended and right side still has some elements left
            temp[k++]=arr[j++];
        }
        //copy elements to original array
        for(k=0,i=start;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]={6,4,3,9,7};
        mergesort(arr, 0, arr.length-1);
        printarr(arr);
    }
}