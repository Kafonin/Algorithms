class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {        
        int[] arr1 = new int[26];

        
        for (char c : magazine.toCharArray()) {
            ++arr1[c - 'a'];
        }
        
        for (char c : ransomNote.toCharArray()) {
            if (--arr1[c - 'a'] < 0) {
                return false;
            }
        }
        
        
        return true;
    }
}


// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         int[] arr = new int[26];
        
//         for (int i=0; i<magazine.length(); i++) {
//             arr[magazine.charAt(i) - 'a']++;
//         }
//         for (int i=0; i<ransomNote.length(); i++) {
//             arr[ransomNote.charAt(i) - 'a']--;
//         }
//         for (int j=0; j<arr.length; j++) {
//             if (arr[j]<0) return false;
//         }
//         return true;
//     }
// }
