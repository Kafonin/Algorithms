class Solution {
    public String toLowerCase(String str) {
        char[] charArray = str.toCharArray();
        for (int i=0; i<charArray.length; i++) {
            if (charArray[i]>64 && charArray[i]<91) {
                charArray[i] = (char)(charArray[i] + 32);
            }
        }
        String string = String.valueOf(charArray);
        return string;
    }
}