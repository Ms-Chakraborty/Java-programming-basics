package twodarray;

public class spiral {
    public static void printspiral(int [][]arr){
        int startrow = 0;
        int startcol = 0;
        int endrow = arr.length - 1;
        int endcol = arr[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            // top row
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(arr[startrow][j] + " ");
            }
            // right column
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(arr[i][endcol] + " ");
            }
            // bottom row
            if (startrow < endrow) {
                for (int j = endcol - 1; j >= startcol; j--) {
                    System.out.print(arr[endrow][j] + " ");
                }
            }
            // left column
            if (startcol < endcol) {
                for (int i = endrow - 1; i > startrow; i--) {
                    System.out.print(arr[i][startcol] + " ");
                }
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        printspiral(arr);
    }
}
