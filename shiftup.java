class solution{
  public int shiftup(int i){
    while(i > 0 && heap[parent(i)] < heap[i]){
      int temp = heap[i];
      heap[i] = heap[parent(i)];
      heap[parent(i)] = temp;
      i = parent(i); 
    }
  }
  public int parent(int index){
    return (i-1)/2;
  }
}
