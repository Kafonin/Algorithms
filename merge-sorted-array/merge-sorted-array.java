class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int index1 = 0, index2 = 0;
        
        while (index1<nums1.length && index2<nums2.length) {
            if (nums1[index1]!=0) {
                index1++;
            } else {
                nums1[index1] = nums2[index2];
                index2++;
            }
        }
        Arrays.sort(nums1);
    }
}