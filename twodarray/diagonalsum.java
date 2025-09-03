package twodarray;

public class diagonalsum {
    public static int disum(int arr[][]){
        int sum=0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if(i==j){
                    sum += arr[i][j];
                }else if(i+j == arr.length - 1){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static int umopti(int arr[][]){
        int diagonalsum=0;
        for (int i = 0; i < arr.length; i++){
            //pd
            diagonalsum += arr[i][i];
            //sd
            if(i != arr.length-1-i) {//basically 
                diagonalsum += arr[i][arr.length-1-i];
            }
        }
        return diagonalsum;
    }
       
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println("The sum of the diagonals is: " + disum(arr));
        System.out.println("The sum of the diagonals is: " + umopti(arr));
    }


}
