class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int mat_row             = mat.length;
        int mat_col             = mat[0].length;
        int[][] reshaped_matrix = new int[r][c];
        int row                 = 0;
        int col                 = 0;
        if((mat_row * mat_col) != (r * c)) return mat;
        for (int i = 0; i < mat_row; i++) {
            for (int j = 0; j < mat_col; j++) {
                reshaped_matrix[row][col] = mat[i][j];
                col++;
                
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return reshaped_matrix;
    }
}