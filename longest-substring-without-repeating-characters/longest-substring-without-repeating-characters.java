class Solution {
    public int lengthOfLongestSubstring(String s) {
    int i = 0, j = 0, max = 0;
    Set<Character> set = new HashSet<>();
    
    while (j < s.length()) {
        if (!set.contains(s.charAt(j))) {
            set.add(s.charAt(j++));
            max = Math.max(max, set.size());
        } else {
            set.remove(s.charAt(i++));
        }
    }
    
    return max;
}
}

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         Map<Character, Integer> map = new HashMap<Character, Integer>();
//         String maxStr = "";
//         int i=0, j=i+1;
//         while (i<s.length()) {
//             map.put(s.charAt(i), 1);
//             while (j<s.length()&&!map.containsKey(s.charAt(j))) {
//                 map.put(s.charAt(j), 1);
//                 j++;
//             }
//             maxStr = (maxStr.length()<s.substring(i,j).length()) ? s.substring(i,j) : maxStr;
//             System.out.println(maxStr);
//             i++;
//             j = i+1;
//             map.clear();
//         }
//         return maxStr.length();
//     }
// }