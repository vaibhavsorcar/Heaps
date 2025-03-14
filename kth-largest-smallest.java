class solution{
  public void kth(int arr[], int k){
    PriorityQueue<Integer> pq1 = new PriorityQueue<>();
    PriorityQueue<Integer> pq2 = new PriorityQueue<>((a,b)->b-a);
    int n = arr.length;
    for(int i = 0 ; i < n ; i++){
      pq1.add(arr[i]);
      pq2.add(arr[i]);
    }
    int f = k-1;
    while(f>0){
      pq1.remove();
      pq2.remove();
      f--
    }
    System.out.println("kth smallest:"+ pq1.peek());
    System.out.println("kth largest:"+  pq2.peek());
  }
}
    
