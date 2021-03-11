class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length(), start = 0, end = n - 1;
        s = s.toLowerCase();
        while (start<end) {
            while (start<n && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (end>=0 && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (start<end && s.charAt(start++)!=s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}