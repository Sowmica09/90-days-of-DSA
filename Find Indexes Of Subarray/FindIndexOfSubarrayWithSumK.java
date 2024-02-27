class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int sum=0;
        int start=0,end=0;
        int i=0,j=0;
        for(i=0, j=0;j<n;j++){
                sum+=arr[j];
               while(sum>s && i<j){
                 sum-=arr[i++];
              }
            if(sum==s){
                start =i+1;
                 end = j+1;
                ans.add(start);
                ans.add(end);
                return ans;
            }
          }
          ans.add(-1);
        return ans;
    }
}
