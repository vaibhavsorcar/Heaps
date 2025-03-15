class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for(int num : nums) 
        map.put(num, map.getOrDefault(num,0)+1);
        heap.addAll(map.entrySet());
        int res []  = new int[k];
        for(int i = 0 ; i < k ; i ++)
        res[i] = heap.poll().getKey();
        return res;
    }
}
