class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n==0 || n<0) return false;

        boolean flag = true;
        for (int i=0; i<n; i++) {
            double temp = Math.pow(2, i);
            if (temp==n) {
                flag = true;
                break;
            }
            
            else if (temp>n) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}