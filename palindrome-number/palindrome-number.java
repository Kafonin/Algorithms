class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        else if (x>-1 && x<10) return true;
        
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        
        int left = 0, right = chars.length-1;
        
        while (left<right) {
            if (chars[left]!=chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}