class Solution {
    public boolean buddyStrings(String a, String b) {
        
        if (a.length()!=b.length()) return false;

        // check if both strings are equal
        // if equal, loop over one string and
        // add letters to set, if the letter already exists
        // and we know a == b, then they both have only 1 unique char
        if (a.equals(b)) {
            Set set = new HashSet();
            for (int i = 0; i < a.length(); i++) {
                if (set.contains(a.charAt(i)))
                    return true;
                else set.add(a.charAt(i));
            }
            return false;
        }
        
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < a.length(); ++i) {
            arr1[a.charAt(i) - 'a']++;
            arr2[b.charAt(i) - 'a']++;
        }
        for (int i=0; i<arr1.length; i++) {
            if (arr1[i]!=arr2[i]) return false;
        }
        
        
        int count = 0;
        for (int i=0; i<a.length(); i++) {
            if (a.charAt(i)!=b.charAt(i)) {
                count++;
            }
        }
        return (count<=2);
    }
}