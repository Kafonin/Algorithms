class Solution {
    public int maxPower(String s) {
        int maxm = 0, count = 0;
        char[] cArray = s.toCharArray();
        for (int i=0; i<cArray.length-1; i++) {
            if (cArray[i]==cArray[i+1]) {
                ++count;
            } else {
                count = 0;
            }
            maxm = Math.max(maxm, count);
        }
        return maxm+1;
    }
}