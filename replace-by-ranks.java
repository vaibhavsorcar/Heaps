import java.util.*;
public class Main {
    public static void main(String args[]) {
        int arr[] = {20, 15, 26, 2, 98, 6};
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        Map<Integer, Integer> mp = new HashMap<>();
        int rank = 1;
        for (int num : sortedArr) {
            mp.putIfAbsent(num, rank++);
        }

        for (int num : arr) 
            System.out.print(mp.get(num) + " ");
    }
}
