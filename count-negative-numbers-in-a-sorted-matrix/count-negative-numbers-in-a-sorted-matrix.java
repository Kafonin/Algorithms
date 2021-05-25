class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for (int row=0; row<grid.length; row++) {
            for (int column=0; column<grid[row].length; column++) {
                if (grid[row][column]<0) count++;
            }
        }
        return count;
    }
}