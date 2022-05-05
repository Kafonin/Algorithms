class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end1 = m - 1;
        int end2 = n - 1;
        int end3 = (m + n) - 1;
        
        // start from end and work way down
        while (end1 >= 0 && end2 >= 0) {
            nums1[end3--] = nums1[end1] < nums2[end2] ?
                                nums2[end2--] : nums1[end1--];
        }
        //only need to combine with remaining nums2, if any
        while (end2 >= 0) {
            nums1[end3--] = nums2[end2--];
        }
    }
}