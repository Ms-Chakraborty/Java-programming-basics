package sorting;

public class counting {
    public static int[] count(int arr[]){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        int countarr[]=new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            countarr[arr[i]]++; //that index place of ith element
        }
        //sorting
        int j=0;//we are updating the value in the given array using j as an index
        for (int i = 0; i < countarr.length; i++) {
            while(countarr[i]>0){
                arr[j]=i;
                j++;
                countarr[i]--;
            }
        }
        return arr;
    }
     public static void main(String[] args) {
        int arr[]={1,2,78,6,5,2,9};
        count(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
