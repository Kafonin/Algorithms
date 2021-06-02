class Solution {
    private static final int[][] DIRS = {{-1,0},{1,0},{0,-1},{0,1}};
    
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length, coln = grid[0].length, res = 0;
        
        for (int i=0; i<row; i++) {
            for (int j=0; j<coln; j++) {
                if (grid[i][j]==0) {
                    continue;
                }
                int count = 0;
                Queue<int[]> q = new LinkedList<>();
                q.offer(new int[]{i, j});
                grid[i][j] = 0;
                while (!q.isEmpty()) {
                    int[] p = q.poll();
                    res = Math.max(res, ++count);
                    for (int[] dir : DIRS) {
                        int r = p[0] + dir[0], c = p[1] + dir[1];
                        if (r<0 || r>=row || c<0 || c>=coln || grid[r][c]==0) {
                            continue;
                        }
                        q.offer(new int[]{r, c});
                        grid[r][c] = 0;
                    }
                }
            }
        }
        return res;
    }
}