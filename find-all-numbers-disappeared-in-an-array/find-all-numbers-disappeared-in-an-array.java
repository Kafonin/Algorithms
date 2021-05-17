class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            int index = Math.abs(i);
            if (nums[index - 1]>0) {
                nums[index - 1] = nums[index - 1] * (-1);
            }
        }
        for (int j=0; j<nums.length; j++) {
            if (nums[j]>0) {
                list.add(j+1);
            }
        }
        return list;
    }
}