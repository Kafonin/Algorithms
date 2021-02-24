class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow!=fast);
        slow = nums[0];
        while (slow!=fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}

// class Solution {
//     public int findDuplicate(int[] nums) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int n : nums) {
//             if (!map.containsKey(n)) {
//                 map.put(n, map.getOrDefault(n, 0)+1);
//             } else {
//                 return n;
//             }
//         }
//         return 0;
//     }
// }
