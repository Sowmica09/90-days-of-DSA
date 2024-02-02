class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<=n-k;i++){
             int max = 0;
             int j=0;
            while(j<k){
                max = Math.max(max,arr[i+j]);
                j++;
            }
            ans.add(max);
        }
        return ans;
    }
}
