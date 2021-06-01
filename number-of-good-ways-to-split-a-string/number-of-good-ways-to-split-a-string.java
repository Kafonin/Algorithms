class Solution {
    public int numSplits(String s) {
        int[] left = new int[26];
        int[] right = new int[26];
        int dLeft = 0, dRight = 0, num = 0;
        
        char[] ch = s.toCharArray();
        
        for (char c : ch) {
            dRight += ++right[c-'a']==1 ? 1 : 0;
        }
        for (int i=0; i<ch.length; i++) {
            dLeft += ++left[ch[i]-'a']==1 ? 1 : 0;
            dRight -= --right[ch[i]-'a']==0 ? 1 : 0;
            num += dLeft==dRight ? 1 : 0;
        }
        return num;
    }
}