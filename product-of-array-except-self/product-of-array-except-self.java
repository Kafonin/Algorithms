class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] left_product = new int[len];
        int[] right_product = new int[len];
        int[] output_arr = new int[len];
        left_product[0] = 1; right_product[len-1] = 1;
        
        
        for (int i=1; i<len; i++) {
            left_product[i] = nums[i-1] * left_product[i-1];
        }
        for (int i=len-2; i>=0; i--) {
            right_product[i] = nums[i+1] * right_product[i+1];
        }
        for (int i=0; i<len; i++) {
            output_arr[i] = left_product[i] * right_product[i];
        }
        return output_arr;
    }
}