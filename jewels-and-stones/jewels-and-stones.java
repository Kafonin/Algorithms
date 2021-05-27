class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for (int i=0; i<stones.length(); i++) {
            String s = stones.substring(i, i+1);
            for (int j=0; j<jewels.length(); j++) {
                String z = jewels.substring(j, j+1);
                if (s.equals(z)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}