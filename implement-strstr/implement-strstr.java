class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        for (int i=0; i<haystack.length(); i++) {
            if (haystack.charAt(i)==needle.charAt(0)) {
                int j=0;
                while (j<needle.length() && haystack.length()-i>=needle.length()) {
                    if (needle.charAt(j)!=haystack.charAt(i+j)) {
                        j = 0;
                        break;
                    }
                    j++;
                }
                if (j==needle.length()) {
                    return i;
                } 
            }
        }
        return -1;
    }
}

// class Solution {
//     public int strStr(String haystack, String needle) {
//         if (needle.isEmpty()) return 0;
//         if (haystack.length()==needle.length() && haystack.charAt(0)==needle.charAt(0)) return 0;
//         int k = needle.length();
//         for (int i=0; i<haystack.length()-k; i++) {
//             if (haystack.substring(i, i+k).equals(needle)) {
//                 return i;
//             }
//         }
//         return -1;
//     }
// }