class solution{
  public static int shiftdown(int index){
    int largest = index;
    int left = 2*index + 1;
    int right = 2*index + 2;
    if(left < heap.length && heap[left] > heap[largest])
      largest = left;
    if(right < heap.length && heap[right] > heap[largest])
      largest = right;
    if(largest != index){
      int temp = heap[largest];
      heap[largest] = heap[index];
      heap[index] = temp;
      shiftdown(largest);
    }
  }
}
