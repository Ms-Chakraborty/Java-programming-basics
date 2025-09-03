package twodarray;
public class seven{
    public static int count(int[][] array){
        int n=array.length;
        int m=array[0].length;
        int counter=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(array[i][j]==7){
                    counter+=1;
                }
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        int array[][]={
            {1,2,3,4,5},
            {5,6,7,8,9},
            {7,10,65,3,9}
            };
        int res=count(array);
        System.out.println("The number of 7's in the array is: " + res);
    }
}