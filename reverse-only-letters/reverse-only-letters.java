class Solution {
    public String reverseOnlyLetters(String S) {
        char[] c = S.toCharArray();
        int left = 0, right = S.length() - 1;
        
        while (left<right) {
            if (!Character.isLetter(c[left])) {
                left++;
            } else if (!Character.isLetter(c[right])) {
                right--;
            } else {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }
        }
        return new String(c);
    }
}