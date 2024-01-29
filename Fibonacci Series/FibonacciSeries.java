class Solution {

    long[] Series(int N) {
        // code here
        long ans[]=new long[N+1];
        ans[0]=0;
        ans[1]=1;
        for(int i=2;i<=N;i++){
            ans[i]=ans[i-1]+ans[i-2];
        }
        return ans;
    }
}
