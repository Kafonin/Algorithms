class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length(), start = 0, end = len - 1;
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        while (start<end) {
            while (start<end && !Character.isLetterOrDigit(chars[start])) {
                start++;
            }
            while (end>=0 && !Character.isLetterOrDigit(chars[end])) {
                end--;
            }
            if (start<end && chars[start]!=chars[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
