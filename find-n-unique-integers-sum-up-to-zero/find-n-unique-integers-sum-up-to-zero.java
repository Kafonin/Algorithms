class Solution {
    public int[] sumZero(int n) {
        int left = 0, right = n - 1, start = 1;
        int[] arr = new int[n];
        while (left<right) {
            arr[left++] = start;
            arr[right--] = -start;
            start++;
        }
        return arr;
    }
}