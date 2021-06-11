class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i=0; i<len; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                continue;
            }
        }
        int[] arr = new int[2];
        for (int j=0; j<len; j++) {
            int cmp = target - nums[j];
            if (map.containsKey(cmp)) {
                arr[0] = map.get(cmp);
                arr[1] = j;
            }
        }
        return arr;
    }
}