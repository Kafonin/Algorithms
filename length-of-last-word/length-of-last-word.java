class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int count = 0;
        
        while (len>0 && s.charAt(len-1)==' ') {
            len--;
        }
        while (len>0 && s.charAt(len-1)!=' ') {
            count++;
            len--;
        }
        return count;
    }
}

// class Solution {
//     public int lengthOfLastWord(String s) {
//         String[] words = s.split(" ");
//         if (words.length==0) return 0;
//         return words[words.length-1].length();
//     }
// }
