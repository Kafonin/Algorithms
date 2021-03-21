class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i)+1);
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int key = entry.getKey();
            if (map.get(key)>(nums.length/3)) {
                list.add(key);
            }
        }
        
        // int[] arr = new int[list.size()];
        // int k=0;
        // for (int j : list) {
        //     arr[k++] = list.get(j);
        // }
        return list;
    }
}