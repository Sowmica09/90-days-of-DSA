class Solution {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array
    
    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] arr, int N)
    {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0,len=0;
        for(int i=0;i<N;i++){
            if(arr[i]==0) arr[i]=-1;
        }
        //similar to 0 sum
        for(int i=0;i<N;i++){
            sum+=arr[i];
            if(sum==0) len=i+1;
            else if(map.containsKey(sum))
            len = Math.max(len,i-map.get(sum));
            else map.put(sum,i);
        }
        return len;
        
            }
}
