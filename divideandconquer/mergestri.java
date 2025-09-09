package divideandconquer;

public class mergestri {
    public static void printarr(String[] arr ){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesotri(String[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int mid=start+(end-start)/2;
        mergesotri(arr, start, mid);
        mergesotri(arr, mid+1, end);
        conquer(arr, start, mid, end);
    }
    public static void conquer(String[] arr, int start, int mid, int end){
        String[] merged=new String[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(arr[i].compareTo(arr[j]) < 0){
                merged[k]=arr[i];
                i++;
            }else{
                merged[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            merged[k]=arr[i];
            i++;
            k++;
        }
        while(j<=end){
            merged[k]=arr[j];
            j++;
            k++;
        }
        //copy to real arr
        for(k=0, i=start;k<merged.length;k++, i++){
            arr[i]=merged[k];
        }
    }
    public static void main(String[] args) {
        String[] arr={"sun", "earth", "mars", "mercury","saturn"};
        mergesotri(arr, 0, arr.length-1);
        printarr(arr);
    }
}