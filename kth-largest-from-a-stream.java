class solution {
  PriorityQueue<Integer> pq;
  int k;
  public kthlargest(int nums[], int k){
    this.k = k;
      pq = new PriorityQueue<>();
        for(int num : nums){
          add(num);
    }
  }
  public int add(int val) {
    if(pq.size() < k || val > pq.peek()){
      pq.offer(val);
        if(pq.size() > k)
          pq.poll();
    }
    return pq.peek();
  }
}
  
