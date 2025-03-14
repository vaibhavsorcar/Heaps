class Solution
{
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < K; j++) {
                minHeap.add(arr[i][j]);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll());
        }
        return result;
    }
}
