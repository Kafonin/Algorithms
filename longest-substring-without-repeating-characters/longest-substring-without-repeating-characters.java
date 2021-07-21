class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        String maxStr = "";
        int i=0, j=i+1;
        while (i<s.length()) {
            map.put(s.charAt(i), 1);
            while (j<s.length()&&!map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), 1);
                j++;
            }
            maxStr = (maxStr.length()<s.substring(i,j).length()) ? 
                                        s.substring(i,j) : maxStr;
            System.out.println(maxStr);
            i++;
            j = i+1;
            map.clear();
        }
        return maxStr.length();
    }
}