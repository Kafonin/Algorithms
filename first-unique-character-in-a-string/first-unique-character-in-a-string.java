class Solution {
    public int firstUniqChar(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for (String str : s.split("")) {
            map.put(str, map.getOrDefault(str, 0)+1);
        }
        
        for (int i=0; i<s.length(); i++) {
            if (map.get(s.substring(i, i+1))==1) return i;
        }
        
        return -1;
    }
}

