package patterntwo.recursion;

public class keyfind {
    public static void findarr(int[] arr, int key, int n){
        if(n<0){
            return;
        }
        if(arr[n]==key){
            findarr(arr, key, n-1);
            System.out.println(n);
        }else{
            findarr(arr, key, n-1);
        }
        }
        public static void main(String[] args) {
        int arr[]={1,2,5,6,2,7,2,8};
        int key=2;
        int n=arr.length-1;
        findarr(arr, key, n);
    }  
    }  

