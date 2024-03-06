class Solution {
    public static void heapify(int arr[],int i, int size){
        int left=2*i+1;
        int right = 2*i+2;
        int maxIdx = i;
        if(left<size && arr[left]>arr[maxIdx]){
            maxIdx=left;
        }
        if(right<size && arr[right]>arr[maxIdx]){
            maxIdx=right;
        }
        if(maxIdx!=i){
            int temp = arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=temp;
            heapify(arr,maxIdx,size);
        }
    }
    static void convertMinToMaxHeap(int N, int arr[]) {
    // code here
    for(int i=N/2;i>=0;i--){
        heapify(arr,i,N);
    }

  }
}
     
