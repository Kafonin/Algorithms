class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int total = 0, len = nums.length;
        int[] arr = new int[len];
        
        for (int i=0; i<len; i++) {
            for (int j=0; j<len; j++) {
                if (nums[i]>nums[j]) {
                    total++;
                }
            }
            arr[i] = total;
            total = 0;
        }
        return arr;
    }
}