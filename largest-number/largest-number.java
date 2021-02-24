class Solution {
        public String largestNumber(int[] nums) {
// convert to string
        String[] temp = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = String.valueOf(nums[i]);
        }
// sort ASCENDING: Arrays.sort(strs, (s1, s2) -> ((s1 + s2).compareTo(s2 + s1)));
// sort the string array DESCENDING
        Arrays.sort(temp, (s1, s2) -> ((s2 + s1).compareTo(s1 + s2)));
// append string array
        String result = String.join("", temp);
        if (result.isEmpty() || result.charAt(0) == '0') {
            return "0";
        }
        return result;
    }
}