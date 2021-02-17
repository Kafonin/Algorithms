class Solution {
    public String longestPalindrome(String s) {
        if (s==null || s.length()<1) return "";
        int start=0, end=0;

        for (int i=0; i<s.length(); i++) {
            int odd = palindromeChecker(s, i, i);
            int even = palindromeChecker(s, i, i+1);
            int maxLen = Math.max(odd, even);
            if (maxLen > end - start) {
                start = i-((maxLen - 1)/2);
                end = i+(maxLen/2);
            }
        }
        return s.substring(start, end+1);
    }
    
    public int palindromeChecker(String str, int left, int right) {
        if (str==null || left>right) return 0;
        
        while (left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}