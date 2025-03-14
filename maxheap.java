class MaxHeap {
    private int[] heap;
    private int size;
    
    MaxHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    private int parent(int i) { return (i - 1) / 2; }
    private int left(int i) { return 2 * i + 1; }
    private int right(int i) { return 2 * i + 2; }
    
    void insert(int val) {
        heap[size++] = val;
        for (int i = size - 1; i > 0 && heap[parent(i)] < heap[i]; i = parent(i)) {
            int temp = heap[i];
            heap[i] = heap[parent(i)];
            heap[parent(i)] = temp;
        }
    }

    int extractMax() {
        if (size == 0) return -1;
        int max = heap[0];
        heap[0] = heap[--size];
        maxHeapify(0);
        return max;
    }

    private void maxHeapify(int i) {
        int largest = i, l = left(i), r = right(i);
        if (l < size && heap[l] > heap[largest]) largest = l;
        if (r < size && heap[r] > heap[largest]) largest = r;
        if (largest != i) {
            int temp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = temp;
            maxHeapify(largest);
        }
    }
}
