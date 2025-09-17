package backtracing;

public class knightm {
    static int N = 8;
    static int[] rowMoves = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] colMoves = {1, 2, 2, 1, -1, -2, -2, -1};

    public static boolean knightmove(int[][] board, int row, int col, int moveNum) {
        if (row < 0 || col < 0 || row >= N || col >= N || board[row][col] != -1) {
            return false;
        }
        board[row][col] = moveNum;
        if (moveNum == N * N - 1) {
            printBoard(board);
            return true;
        }
        for (int k = 0; k < 8; k++) {
            if (knightmove(board, row + rowMoves[k], col + colMoves[k], moveNum + 1)) {
                return true;
            }
        }
        board[row][col] = -1; // backtrack
        return false;
    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%2d ", board[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = new int[N][N];
        // Initialize board with -1 (unvisited)
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                board[i][j] = -1;
        knightmove(board, 0, 0, 0);
    }
}