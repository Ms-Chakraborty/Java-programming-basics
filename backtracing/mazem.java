package backtracing;

public class mazem {
    public static boolean mazesolver(int[][] maze, int row, int col, int[][] sol){
        // base case
        if(row == maze.length-1 && col == maze[0].length-1){
            sol[row][col] = 1;
            printarr(sol);
            return true;
        }
        if(isSafe(maze, row, col)){
            sol[row][col] = 1;
            if(mazesolver(maze, row+1, col, sol) || mazesolver(maze, row, col+1, sol)){
                return true;
            }
            sol[row][col] = 0; // backtracking
        }
        return false;
    }
    public static boolean isSafe(int[][] maze, int row, int col){
        return row >= 0 && col >= 0 && row < maze.length && col < maze[0].length && maze[row][col] == 1;
    }
    public static void printarr(int[][] sol){
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[0].length; j++) {
                System.out.print(sol[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] maze = {
            {1,0,0,0},
            {1,1,0,1},
            {0,1,0,0},
            {1,1,1,1}
        };
        int[][] sol = new int[maze.length][maze[0].length];
        mazesolver(maze, 0, 0, sol);
    }
}