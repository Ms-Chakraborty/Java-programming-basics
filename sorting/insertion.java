package sorting;
import java.util.Arrays;
import java.util.Collections;
public class insertion {
    public static int[] insert(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr=arr[i];
            int prev=i-1;
            //finding the correct position to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev]; //pushing the elements that are greater than current
                prev--;
            }
            //insertion
            arr[prev+1]=curr; //+1 in the prev array because it shifts one index to the right
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={12,78,65,2,9};
        //insert(arr);
        Arrays.sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        Integer carr[]={12,78,65,2,9};
        Arrays.sort(carr,Collections.reverseOrder());
        for(int i:carr){
            System.out.print(i+" ");
        }
    }
}

