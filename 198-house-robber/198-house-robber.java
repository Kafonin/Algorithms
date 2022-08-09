class Solution {
    public int rob(int[] nums) {
        int rob1 = 0, rob2 = 0;
        for (int n : nums) {
            int temp = Math.max(n + rob1, rob2);
            System.out.println("temp: " + temp);
            rob1 = rob2;
            System.out.println("rob1: " + rob1);
            rob2 = temp;
            System.out.println("rob2: " + rob2);
        }
        
        return rob2;
    }
}
//1,