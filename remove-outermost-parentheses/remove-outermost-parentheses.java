class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        char para = 0;
        for (char str : s.toCharArray()) {
            if (str=='(' && para++>0) sb.append(str);
            if (str==')' && para-->1) sb.append(str);
        }
        return sb.toString();
    }
}