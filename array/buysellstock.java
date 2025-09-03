package array;

import java.util.Scanner;

public class buysellstock {
    public static int stock(int arr[]){
        int n=arr.length;
        int currsum;
        int buyprice=Integer.MAX_VALUE;
        int sellprice=Integer.MIN_VALUE;
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]<buyprice){
                buyprice=arr[i];
            }
            for (int j = i+1; j < n; j++){
                if(sellprice<arr[j]){
                    sellprice=arr[j];
                }
                currsum=arr[j]-arr[i];
                if(currsum<0){
                    currsum=0;
                }
                if(currsum>maxsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("The buyprice is "+buyprice+" and the sell price is "+sellprice);
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array");
        int k = sc.nextInt();
        int arr[] = new int[k];
        System.out.println("Enter the elements you want in the array");
        for (int m = 0; m < k; m++) {
            arr[m] = sc.nextInt();
        }
        
        int profit=stock(arr);
        System.out.println("The profit is : "+profit);
    }
}
