class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n)+1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()==1) return entry.getKey();
        }
        return -1;
    }
}

// class Solution {
//     public int singleNumber(int[] nums) {
//         int n = 0;
//         for (int num : nums) {
//             n^=num;
//         }
//         return n;
//     }
// }