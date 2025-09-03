package recursion;

public class bin {
    public static int search(int[] arr, int i,int key){
        if(i==arr.length-1 && arr[i]!=key){
            return -1;
        }if(arr[i]==key){
            return i;
        }else{
            return search(arr, i+1, key);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        System.out.println(search(arr, 0, 5));
    }
}
