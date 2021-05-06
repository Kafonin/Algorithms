class Solution {
    public String toGoatLatin(String str) {
         String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        int k = 1;
        for (String word : words) {
            char ch = word.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                sb.append(word);
                sb.append("ma");
            } else {
                sb.append(word.substring(1,word.length()));
                sb.append(ch);
                sb.append("ma");
            }
            int i = 0;
            while (i < k) {
                sb.append("a");
                ++i;
            }
            ++k;
            sb.append(" ");
        }
        
        int index = sb.lastIndexOf(" ");
        String s = sb.toString().substring(0, index);
        return s;
    }
}