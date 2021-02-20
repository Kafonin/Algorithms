class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) return nums;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        
        Queue<Integer> heap = new PriorityQueue<>(
            (n1, n2) -> map.get(n1) - map.get(n2));
        
        for (int n : map.keySet()) {
            heap.add(n);
            if (heap.size()>k) {
                heap.poll();
            }
        }
        
        int[] arr = new int[k];
        for (int i=k-1; i>=0; i--) {
            arr[i] = heap.poll();
        }
        return arr;
    }
}