class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for (int i=0; i<arr2.length; i++) {
            for (int j=0; j<arr1.length; j++) {
                if (arr1[j]==arr2[i]) {
                    al.add(arr1[j]);
                    arr1[j] = -1;
                }
            }
        }
        Arrays.sort(arr1);
        for (int n : arr1) {
            if (n>(-1)) {
                al.add(n);
            }
        }
        int[] arr = al.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}