package backtracing;

public class suduko {
    public static boolean sudokuSolver(int[][] sudoku,int i,int j){
        //base case
        if(i==sudoku.length){
            return true;
        }
        int nextRow=i, nextCol=j+1;
        if(j+1==9){
            nextRow=i+1;
            nextCol=0;
        }
        if(sudoku[i][j]!=0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        else{
            for (int digit = 1; digit < 10; digit++) {
            if(isSafe(sudoku,i,j,digit)){
                sudoku[i][j]=digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[i][j]=0;//backtrack
            }
            }
        }
        return false;
    }
    public static boolean isSafe(int[][] sudoku,int row,int col,int digit){
        //col check
        for (int i = 0; i < sudoku.length; i++) {
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        //row check
        for (int j = 0; j < sudoku.length; j++) {
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        //3X3 grid
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static void printsolution(int[][] sudoku){
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j <sudoku.length; j++) {
                System.out.print(sudoku[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};
        
       System.out.println(sudokuSolver(sudoku, 0, 0));
        printsolution(sudoku);
    }
}
