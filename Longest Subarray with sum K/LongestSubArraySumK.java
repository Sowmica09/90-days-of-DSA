class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        Map<Integer,Integer> preSum=new HashMap<>();
        int sum=0;
        int maxLen=0;
        for(int i=0;i<N;i++){
            sum+=A[i];
            if(sum==K){
                maxLen=Math.max(maxLen,i+1);
            }
            int rem=sum-K;
            if(preSum.containsKey(rem)){
                int len = i-preSum.get(rem);
                maxLen=Math.max(maxLen,len);
            }
            if(!preSum.containsKey(sum)){
                preSum.put(sum,i);
            }
        }
        return maxLen;
    }
    
    
}


