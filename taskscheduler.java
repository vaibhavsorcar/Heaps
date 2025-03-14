class solution{
  public int tasksch(char tasks[], int n){
    int freq[] = new int[26];
    for(char task : tasks){
      freq[task - 'A']++;
    }
    Arrays.sort(freq);
    int chunks = freq[25] -1 ; //2
    int idle = chunks * n; //4
    for(int i = 24; i >=0; i--){
    idle -= Math.min(chunks, freq[i]);
  }
    return idle < 0: tasks.length : tasks.length + idle;
  }
}
