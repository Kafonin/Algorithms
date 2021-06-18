class Solution {
    public void rotate(int[] nums, int k) {
        int t = k%nums.length;
        reverseIt(nums, 0, nums.length-1);
        reverseIt(nums, 0, t-1);
        reverseIt(nums, t, nums.length-1);
    }
    
    public void reverseIt(int[] arr, int left, int right) {
        int temp = 0;
        while (left<right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}