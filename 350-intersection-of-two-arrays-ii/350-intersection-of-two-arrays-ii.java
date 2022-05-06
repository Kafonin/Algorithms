class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int incrementor_nums1 = 0;
        int incrementor_nums2 = 0;
        ArrayList<Integer> al = new ArrayList<>();
        
        while (incrementor_nums1 < nums1.length 
                && incrementor_nums2 < nums2.length) {
            if (nums1[incrementor_nums1] == nums2[incrementor_nums2]) {
                al.add(nums1[incrementor_nums1]);
                incrementor_nums1++;
                incrementor_nums2++;
            } else if (nums1[incrementor_nums1] < nums2[incrementor_nums2]) {
                incrementor_nums1++;
            } else {
                incrementor_nums2++;
            }
        }
        
        int k = 0;
        int[] arr = new int[al.size()];
        for (int num : al) {
            arr[k++] = num;
        }
        
        return arr;
    }
}