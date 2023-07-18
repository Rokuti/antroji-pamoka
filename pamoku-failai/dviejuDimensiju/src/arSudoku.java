public class arSudoku {
    public static void main(String[] args) {
        int[][] board = {{5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}};
        System.out.println("arValidSudoku : " + isValidSudoku(board));
    }

    public static boolean isValidSudoku(int[][] board) {
        // Check rows
        for (int i = 0; i < 9; i++) {
            boolean[] seen = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != 0) {
                    if (seen[board[i][j] - 1]) {
                        return false;
                    }
                    seen[board[i][j] - 1] = true;
                }
            }
        }

        // Check columns
        for (int j = 0; j < 9; j++) {
            boolean[] seen = new boolean[9];
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != 0) {
                    if (seen[board[i][j] - 1]) {
                        return false;
                    }
                    seen[board[i][j] - 1] = true;
                }
            }
        }

        // Check sub-grids
        for (int k = 0; k < 9; k++) {
            boolean[] seen = new boolean[9];
            for (int i = k / 3 * 3; i < k / 3 * 3 + 3; i++) {
                for (int j = k % 3 * 3; j < k % 3 * 3 + 3; j++) {
                    if (board[i][j] != 0) {
                        if (seen[board[i][j] - 1]) {
                            return false;
                        }
                        seen[board[i][j] - 1] = true;
                    }
                }
            }
        }

        return true;
    }
}
