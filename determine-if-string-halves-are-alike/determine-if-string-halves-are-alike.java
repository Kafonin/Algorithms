class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        char[] array = {'a', 'e', 'i', 'o', 'u'};
        int len=s.length(), count1=0, count2=0, i=0, j=len/2;
        
        while (i<len/2) {
            for (int k=0; k<array.length; k++) {
                if (s.charAt(i)==array[k]) {
                    count1++;
                    break;
                } 
            }
            i++;
        }
        while (j<s.length()) {
            for (int k=0; k<array.length; k++) {
                if (s.charAt(j)==array[k]) {
                    count2++;
                    break;
                } 
            }
            j++;
        }
        return (count1==count2);
    }
}