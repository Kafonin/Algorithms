class Solution {
    public String defangIPaddr(String address) {
        String defang = "[.]";
        StringBuilder sb = new StringBuilder();
        
        for (char c : address.toCharArray()) {
            if (c=='.') {
                sb.append(defang);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}