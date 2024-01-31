public class Solution {
    public int[] solve(int[] A) {
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            int sq=(int)Math.pow(A[i],2);
            A[i]=sq;
        }
                Arrays.sort(A);
        return A;
    }
}
