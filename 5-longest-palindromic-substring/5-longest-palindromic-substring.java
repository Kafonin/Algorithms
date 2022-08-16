class Solution {
    public String longestPalindrome(String s) {
        int strLen = s.length();
        if (strLen < 2) { return s; }
        
        
        int resultLen = 0;
        String result = "";
        
        
        for (int i = 0; i < strLen; i++) {
            // odd
            int left = i, right = i;
            while (left >= 0 && right < strLen && s.charAt(left) == s.charAt(right)) {
                if ((right - left + 1) > resultLen) {
                    result = s.substring(left, right + 1);
                    resultLen = (right - left) + 1;
                }
                left--;
                right++;
            }
            
            
            // even
            left = i;
            right = i + 1;
            while (left >= 0 && right < strLen && s.charAt(left) == s.charAt(right)) {
                if ((right - left + 1) > resultLen) {
                    result = s.substring(left, right + 1);
                    resultLen = (right - left) + 1;
                }
                left--;
                right++;
            }
        }
        
        return result;
    }
}