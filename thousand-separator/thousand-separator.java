class Solution {
    public String thousandSeparator(int n) {
        if (n<1000) return Integer.toString(n);
        String s = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i=s.length()-1; i>=0; i--) {
            if (count==3) {
                sb.append(".");
                sb.append(s.charAt(i));
                count = 1;
            } else {
                count++;
                sb.append(s.charAt(i));
            }
        }
        return sb.reverse().toString();
    }
}