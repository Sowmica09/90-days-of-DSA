class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        if(N<M) return -1;
         int start = 0;
        int end = 0;
       
        for(int i=0;i<N;i++){
            start = Math.max(start,A[i]);//max
            end+=A[i];//sum
        }
         int res = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(isValid(A,N,M,mid)==true){
                res = mid;
                end = mid-1;
            }else{
                start= mid+1;
            }
        }
        return res;
    }
    public static boolean isValid(int[] A,int N,int M,int mid){
        int students = 1;
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=A[i];
            if(sum>mid){
                students++;
                sum=A[i];
            }
        }
        if(students>M) return false;
        return true;
    }
}
