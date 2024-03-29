class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0, total=0;
        
        for (int i=0; i<accounts.length; i++) {
            for (int j=0; j<accounts[i].length; j++) {
                total+=accounts[i][j];
            }
            max = Math.max(max, total);
            total=0;
        }
        return max;
    }
}