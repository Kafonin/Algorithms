class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            int s = Math.abs(nums[i]);
            int f = nums[s-1];
            if (f<0) al.add(s);
            else nums[s-1] = -nums[s-1];
        }
        return al;
    }
}