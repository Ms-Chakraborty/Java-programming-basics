package recursion;

public class lastoc {
    public static int search(int[] arr, int i, int key){
        if(i<0){
            return -1;
        }else if(arr[i]==key){
            return i;
        }else{
            i--;
            return search(arr, i, key);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,5,8,1,4,6};
        int n=arr.length-1;
        int key=1;
        System.out.println(search(arr, n, key));
    }
}
