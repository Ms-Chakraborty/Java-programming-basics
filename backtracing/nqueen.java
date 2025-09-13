package backtracing;

public class nqueen {
    public static void nQueens(char board[][],int row){
        if(row==board.length){
            printboard(board);
        }
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board,row,j)){
                 board[row][j]='Q'; //after placing a queen in a place 
                nQueens(board, row+1);//we are calling backtracking
                board[row][j]='X';//now remove the queen from thr previous place
            }
        }
    }
    public static boolean isSafe(char board[][],int row,int col){ //we keep checking up because we place the queens down to up
        //vertical up
        for (int i = row-1; i >=0; i--) {
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left diagonal up
        for (int i = row-1,j=col-1; i>=0 && j>=0; i--,j--) {
           if(board[i][j]=='Q'){
                return false;
            } 
        }
        //right diagonal up
        for (int i = row-1,j=col+1; i>=0 && j<board.length; i--,j++) {
           if(board[i][j]=='Q'){
                return false;
            } 
        }
        return true;
    }
    public static void printboard(char board[][]){
        System.out.println("----Chess Board-----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    } 
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        //initialise
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='X';
            }
        }
        nQueens(board,0);
    }
}
