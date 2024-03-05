class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        int res[]=new int[k];
        int j =0;
        while(k>0){
            res[j++]=pq.remove();
            k--;
        }
        return res;
    }
}
