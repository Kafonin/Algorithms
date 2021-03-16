class Solution {
    public int majorityElement(int[] nums) {
//         Boyer-Moore Voting Algorithm
        int count = 0;
        Integer contestant = null;
        for (int i : nums) {
            if (count == 0) {
                contestant = i;
            }
            count += (i == contestant) ? 1 : -1;
        }
        return contestant;
    }
}