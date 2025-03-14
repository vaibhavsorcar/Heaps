class Solution {
    static void convertMinToMaxHeap(int N, int arr[]) {
    int index=(N-1)/2;
    for(int i=index;i>=0;i--){
       heapify(arr,i);
  }

    }
  static int left(int o){return 2*o+1;}
  static int right(int i){
      return (2*i)+2;
  }
  static void heapify(int []arr,int i){
      int largest=i;
      int left=left(i);
      int right=right(i);
      if(left<arr.length&&arr[left]>arr[largest])largest=left;
      if(right<arr.length&&arr[right]>arr[largest])largest=right;
      if(largest!=i){
          int temp=arr[i];
          arr[i]=arr[largest];
          arr[largest]=temp;
          heapify(arr,largest);
      }
    }
  }

     
