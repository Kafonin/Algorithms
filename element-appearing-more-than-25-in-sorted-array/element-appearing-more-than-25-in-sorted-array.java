class Solution {
    public int findSpecialInteger(int[] arr) {
        int toReturn = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i)+1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            if (map.get(key)>(arr.length/4)) {
                toReturn = key;
            }
        }
        return toReturn;
    }
}