public class Q529 {
    private int[] directionX = {0, 0, 1, -1, 1, -1, 1, -1};

    private int[] directionY = {1, -1, 0, 0, 1, -1, -1, 1};

    private void dfs(char[][] board, int m, int n) {
        int count = 0;
        for (int i = 0; i < directionX.length; i++) {
            int x = m + directionX[i];
            int y = n + directionY[i];
            if (x < 0 || y < 0 || x >= board.length || y >= board[0].length) {
                continue;
            }
            if (board[x][y] == 'M') {
                count++;
            }
        }

        if (count > 0) {
            board[m][n] = (char) (count + '0');
        } else {
            board[m][n] = 'B';
            for (int i = 0; i < directionX.length; i++) {
                int x = m + directionX[i];
                int y = n + directionY[i];
                if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || board[x][y] != 'E') {
                    continue;
                }
                dfs(board, x, y);
            }
        }
    }

    public char[][] updateBoard(char[][] board, int[] click) {
        int m = click[0];
        int n = click[1];
        if (board[m][n] == 'M') {
            board[m][n] = 'X';
        } else {
            dfs(board, m, n);
        }
        return board;
    }
}
