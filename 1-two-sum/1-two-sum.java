class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int index = 0; index < nums.length; index++) {
            map.put(index, nums[index]);
        }
        
        int compliment = 0;
        int[] arr = new int[2];
        
        for (int index = 0; index < nums.length; index++) {
           

            for (int j = 0; j < nums.length; j++) {
                if ((index != j) && (nums[index] + nums[j] == target)) {

                    arr[0] = index;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}