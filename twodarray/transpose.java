package twodarray;
public class transpose{
    public static int[][] trans(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int [][] tra=new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tra[j][i]=arr[i][j];
            }
        }
        return tra;
    }
    public static void main(String[] args) {
        int array[][]={
            {1,2,3,4,5},
            {5,6,7,8,9},
            {7,10,65,3,9}
            };
        int[][] res=trans(array);

        System.out.println("The transpose of the matrix is: ");
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}