class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c)+1);
            }
        }
        int k = 0;
        for (char c : s.toCharArray()) {
            if (map.get(c)==1) {
                return k;
            }
            k++;
        }
        return -1;
    }
}