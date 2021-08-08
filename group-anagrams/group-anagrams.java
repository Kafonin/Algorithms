class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> toReturn = new ArrayList<>();
        
        for (String s : strs) {
            char[] curr = s.toCharArray();
            Arrays.sort(curr);
            String sorted = new String(curr);
            
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        toReturn.addAll(map.values());
        return toReturn;
    }
}