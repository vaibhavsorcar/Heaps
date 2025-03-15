public class Solution {
    public int[] solve(int[] A, int[] B, int C) {
        Arrays.sort(A);
        Arrays.sort(B);
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
        // Add the largest sum (A[N-1] + B[N-1]) to the heap
        maxHeap.add(new int[] {A[A.length - 1] + B[B.length - 1], A.length - 1, B.length - 1});
        // To store the top C sums
        List<Integer> result = new ArrayList<>();
        // We need to extract the top C sums from the heap
        while (C-- > 0) {
            int[] curr = maxHeap.poll(); // Extract the max sum
            int sum = curr[0], i = curr[1], j = curr[2];
            // Add the sum to the result list
            result.add(sum);
            // Add the next possible sums to the heap
            // Case 1: Decrease the index in A (if valid)
            if (i > 0 && j >= 0) {
                maxHeap.add(new int[] {A[i - 1] + B[j], i - 1, j});
            }
            // Case 2: Decrease the index in B (if valid)
            if (j > 0 && i >= 0) {
                maxHeap.add(new int[] {A[i] + B[j - 1], i, j - 1});
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    // public static void main(String[] args) {
    //     Solution solution = new Solution();
    //     int[] A1 = {3, 2};
    //     int[] B1 = {1, 4};
    //     int C1 = 2;
    //     System.out.println(Arrays.toString(solution.solve(A1, B1, C1)));  // Output: [7, 6]
        
    //     int[] A2 = {1, 4, 2, 3};
    //     int[] B2 = {2, 5, 1, 6};
    //     int C2 = 4;
    //     System.out.println(Arrays.toString(solution.solve(A2, B2, C2)));  // Output: [10, 9, 9, 8]
    // }
}
