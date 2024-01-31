public class Solution {
    public int solve(int[] A, int B) {
        int currSum=0;
        for(int i=0;i<B;i++){
            currSum+=A[i];
        }
        int maxSum=currSum;
        int incl=A.length-1,excl=B-1;
        while(incl>=0 && excl>=0){
            currSum+=A[incl--];
            currSum-=A[excl--];
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
