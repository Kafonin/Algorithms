class Solution {
    public int reverse(int x) {
        long y = 0;

        while (x!=0) {
           y = (x%10) + (y*10);
            x/=10;
        }

        if (y>=Integer.MIN_VALUE && y<=Integer.MAX_VALUE) {
            return (int)y;
        }
        return 0;
    }
}