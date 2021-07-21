class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        
        for (int j=0; j<nums.length; j++) {
            if (!map.containsKey(nums[j])) {
                map.put(nums[j], j);
            } else {
                continue;
            }
        }
        int[] arr = new int[2];
        for (int i=0; i<len; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                arr[0] = map.get(compliment);
                arr[1] = i;
            }
        }
        return arr;
        
    }
}