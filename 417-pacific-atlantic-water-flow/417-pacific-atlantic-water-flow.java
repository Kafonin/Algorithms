class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        List<List<Integer>> list = new ArrayList<>();
        int rows = heights.length, cols = heights[0].length;
        boolean[][] atlantic = new boolean[rows][cols];
        boolean[][] pacific = new boolean[rows][cols];
        
        for (int i = 0; i < cols; i++) {
            dfs(heights, 0, i, Integer.MIN_VALUE, pacific);
            dfs(heights, rows - 1, i, Integer.MIN_VALUE, atlantic);
        }
        for (int i = 0; i < rows; i++) {
            dfs(heights, i, 0, Integer.MIN_VALUE, pacific);
            dfs(heights, i, cols - 1, Integer.MIN_VALUE, atlantic);
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    list.add(Arrays.asList(i, j));
                }
            }
        }
        return list;
    }
    
    
    public void dfs(int[][] heights, int row, int col, int prev, boolean[][] ocean) {
        if (row < 0 || row >= ocean.length || col < 0 || col >= ocean[0].length) {
            return;
        }
        if (heights[row][col] < prev || ocean[row][col]) {
            return;
        }
        ocean[row][col] = true;
        dfs(heights, row+1, col, heights[row][col], ocean);
        dfs(heights, row-1, col, heights[row][col], ocean);
        dfs(heights, row, col+1, heights[row][col], ocean);
        dfs(heights, row, col-1, heights[row][col], ocean);
    }
}