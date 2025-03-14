import java.util.ArrayList;

public class MaxHeap {
    private ArrayList<Integer> heap = new ArrayList<>();

    public void insert(int data) {
        heap.add(data);
        int i = heap.size() - 1;
        while (i > 0 && heap.get(i) > heap.get((i - 1) / 2)) {
            swap(i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    public int delete(int index) throws Exception {
        if (index < 0 || index >= heap.size()) throw new Exception("Index out of bounds");
        int deleted = heap.get(index);
        heap.set(index, heap.remove(heap.size() - 1));
        heapify(index);
        return deleted;
    }

    private void heapify(int i) {
        int left = 2 * i + 1, right = 2 * i + 2, largest = i;
        if (left < heap.size() && heap.get(left) > heap.get(largest)) largest = left;
        if (right < heap.size() && heap.get(right) > heap.get(largest)) largest = right;
        if (largest != i) {
            swap(i, largest);
            heapify(largest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}
