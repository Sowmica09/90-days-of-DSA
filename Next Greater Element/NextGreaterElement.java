class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        long ans[]= new long[n];
        Stack<Integer> s = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()) ans[i]=-1;
            else{
                ans[i]=arr[s.peek()];
            }
            s.push(i);
        }
        return ans;
    } 
}
