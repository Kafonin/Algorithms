class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[26], countbal = new int[26];
        int min = text.length();
        for (int i=0; i<min; i++) {
            count[text.charAt(i)-'a']++;
        }
        for (char c : "balloon".toCharArray()) {
            countbal[c-'a']++;
        }
        for (char c : "balloon".toCharArray()) {
            min = Math.min(min, count[c-'a']/countbal[c-'a']);
        }
        return min;
    }
}