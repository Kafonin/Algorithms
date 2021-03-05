class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0||strs==null) return "";
        else if (strs.length==1) return strs[0];
        Arrays.sort(strs);
        String first = strs[0], last = strs[strs.length-1];
        int j = 0;
        while (j<first.length()) {
            if (first.charAt(j)!=last.charAt(j)) {
                break; 
            }
            j++;
        }
        return first.substring(0, j);
    }
}