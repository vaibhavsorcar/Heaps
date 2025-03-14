class sol{
  public static int extractmax(){
    gfg g = new gfg();
    if(gfg.s == -1)
      return new IllegalStateException("Heap is empty");
    int max = g.heap[0];
    g.heap[0] = g.heap[s];
    g.s--;
    g.downshift(0);
    return max;
  }
}
