package divideandconquer;

public class quicksorty{
    public static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quicksort(int[] arr,int start, int end){
        if(start>=end){
            return;
        }
        //last element
        int pivid=partition(arr,start,end);
        quicksort(arr, start, pivid-1);
        quicksort(arr, pivid, end); //pivid is the actual correct index of the pivot element 
    }
    public static int partition(int arr[], int start,int end){
        int pivot=arr[end];
        int i=start-1;
        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //place pivot in its correct place
        i++;
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={6,4,3,9,7};
        quicksort(arr, 0, arr.length-1);
        printarr(arr);
    }
}
