class MinHeap {
    private int[] heap;
    private int size;
    
    MinHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    private int parent(int i) { return (i - 1) / 2; }
    private int left(int i) { return 2 * i + 1; }
    private int right(int i) { return 2 * i + 2; }
    
    void insert(int val) {
        heap[size++] = val;
        for (int i = size - 1; i > 0 && heap[parent(i)] > heap[i]; i = parent(i)) {
            int temp = heap[i];
            heap[i] = heap[parent(i)];
            heap[parent(i)] = temp;
        }
    }

    int extractMin() {
        if (size == 0) return -1;
        int min = heap[0];
        heap[0] = heap[--size];
        minHeapify(0);
        return min;
    }

    private void minHeapify(int i) {
        int smallest = i, l = left(i), r = right(i);
        if (l < size && heap[l] < heap[smallest]) smallest = l;
        if (r < size && heap[r] < heap[smallest]) smallest = r;
        if (smallest != i) {
            int temp = heap[i];
            heap[i] = heap[smallest];
            heap[smallest] = temp;
            minHeapify(smallest);
        }
    }
}
