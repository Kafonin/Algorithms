class Solution {
    public String restoreString(String s, int[] indices) {
        Map<Integer, Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (int i=0; i<indices.length; i++) {
            map.put(indices[i], s.charAt(i));
        }
        while (k<indices.length) {
            sb.append(map.get(k));
            k++;
        }
        return sb.toString();
    }
}