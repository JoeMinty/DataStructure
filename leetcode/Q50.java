class Q50 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        dfs(image, sr, sc, newColor, oldColor);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int newColor, int oldColor) {
        // 终止条件
        if (sr < 0 || sc < 0 || sr > image.length - 1 || sc > image[0].length - 1 || image[sr][sc] == newColor
                || image[sr][sc] != oldColor) {
            return;
        }

        image[sr][sc] = newColor;
        dfs(image, sr - 1, sc, newColor, oldColor);
        dfs(image, sr + 1, sc, newColor, oldColor);
        dfs(image, sr, sc - 1, newColor, oldColor);
        dfs(image, sr, sc + 1, newColor, oldColor);
    }
}
