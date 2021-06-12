class Solution {
    public void rotate(int[] nums, int k) {
        int t = k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, t-1);
        reverse(nums, t, nums.length-1);
    }
    
    public int[] reverse(int[] arr, int start, int end) {
        int temp = 0;
        while (start<end) {
            arr[start] = arr[start] ^ arr[end] ^ (arr[end] = arr[start]); // cool 1 line swap
            start++;
            end--;
        }
        return arr;
    }
}