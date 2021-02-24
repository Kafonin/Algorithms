class Solution {
    public int[] searchRange(int[] nums, int target) {
    int low = 0, high = nums.length - 1;
    // get the start index of target number
    int startIndex = -1;
    while (low <= high) {
        int mid = (high + low) / 2; //+ low;
        if (nums[mid] > target) {
            high = mid - 1;
        } else if (nums[mid] == target) {
            startIndex = mid;
            high = mid - 1;
        } else
            low = mid + 1;
    }

    // get the end index of target number
    int endIndex = -1;
    low = 0;
    high = nums.length - 1;
    while (low <= high) {
        int mid = (high + low) / 2;
        if (nums[mid] > target) {
            high = mid - 1;
        } else if (nums[mid] == target) {
            endIndex = mid;
            low = mid + 1;
        } else
            low = mid + 1;
    }
        // int[] res = {startIndex, endIndex};
        // return res;
        return new int[] {startIndex, endIndex};
    }
}