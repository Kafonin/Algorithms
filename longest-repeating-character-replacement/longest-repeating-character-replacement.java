class Solution {
    public int characterReplacement(String s, int k) {
        int N = s.length();
        int[] char_counts = new int[26];
        int window_start = 0, max_length = 0, max_counts = 0;
        
        for (int window_end = 0; window_end<N; window_end++) {
            char_counts[s.charAt(window_end)-'A']++;
            int current_char_count = char_counts[s.charAt(window_end)-'A'];
            max_counts = Math.max(max_counts, current_char_count);
            
            while (window_end - window_start - max_counts + 1 > k) {
            char_counts[s.charAt(window_start)-'A']--;
            window_start++;
        }
            max_length = Math.max(max_length, window_end - window_start+1);
        }
        
        
        return max_length;
    }
    
}