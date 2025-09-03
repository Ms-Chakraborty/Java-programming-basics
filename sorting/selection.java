package sorting;
public class selection {
    public static int[] select(int arr[]){
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            int Minpos=i;
            for (int j = i+1; j < arr.length; j++) {
              if(arr[j]<arr[Minpos]){
                Minpos=j;
              }  
            }
            //swap
            temp=arr[i];
            arr[i]=arr[Minpos];
            arr[Minpos]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={12,78,65,2,9};
        select(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
