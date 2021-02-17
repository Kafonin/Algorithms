class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length<3) return false;
        int a=Integer.MAX_VALUE, b=a;
        for (int x : nums) {
            if (x<a) a = x;
            else if (x>a && x<b) b = x;
            else if (x>a && x>b) return true;
        }
        return false;
    }
}