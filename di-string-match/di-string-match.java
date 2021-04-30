class Solution {
    public int[] diStringMatch(String S) {
        
        ArrayList<Integer> al = new ArrayList<>();
        int left = 0;
        int right = S.length();
        
        
        for (int i=0; i<S.length(); i++) {
            if (S.charAt(i)=='I') {
                al.add(left);
                left++;
                if (i+1==S.length()) {
                    al.add(left++);
                }
            }
            if (S.charAt(i)=='D') {
                al.add(right);
                right--;
                if (i+1==S.length()) {
                    al.add(right--);
                }
            }
        }
        
        int[] arr = new int[al.size()];
        for (int i=0; i<arr.length; i++) {
            arr[i] = al.get(i);
        }
        return arr;
    }
}