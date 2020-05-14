/**
 * 被围绕的区域
 */
public class Q130 {

    private int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    private void dfs(char[][] board, int i, int j, int m, int n) {
        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] != 'O') {
            return;
        }
        board[i][j] = '#';
        for (int[] direction : directions) {
            dfs(board, i + direction[0], j + direction[1], m, n);
        }
    }

    public void solve(char[][] board) {

        int m = board.length;
        if (m == 0) {
            return;if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
        }
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
                    if (board[i][j] == 'O') {
                        dfs(board, i, j, m, n);
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }
}
