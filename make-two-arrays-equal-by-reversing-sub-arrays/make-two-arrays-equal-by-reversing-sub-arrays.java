class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] map = new int[1001];
        for (int i=0; i<target.length; i++) {
            map[target[i]]++;
            map[arr[i]]--;
        }
        for (int n : map) {
            if (n!=0) return false;
        }
        return true;
    }
}

// class Solution {
//     public boolean canBeEqual(int[] target, int[] arr) {
//         int[] map = new int[1001];
        
//         for (int i=0; i<target.length; i++) {
//             map[target[i]]++;
//             map[arr[i]]--;
//         }
//         for (int i : map) {
//             if (i!=0) return false;
//         }
//         return true;
//     }
// }