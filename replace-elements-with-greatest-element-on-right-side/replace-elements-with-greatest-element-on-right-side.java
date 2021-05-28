class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i=arr.length-1, mxm=-1; i>=0; i--) {
            mxm = Math.max(arr[i], arr[i]=mxm);
        }
        return arr;
    }
}