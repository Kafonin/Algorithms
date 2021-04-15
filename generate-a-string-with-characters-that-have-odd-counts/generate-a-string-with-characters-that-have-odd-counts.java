class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        
        if (n%2==0) {
            int i = 0;            
            while (i<n-1) {
                sb.append("a");
                i++;
            }
            return sb.append("b").toString();
        } else {
            int j = 0;
            while (j<n) {
                sb.append("a");
                j++;
            }
        }
        return sb.toString();
    }
}