 class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        //sort the array based on profits and find max deadline
        Arrays.sort(arr,(a,b) -> b.profit - a.profit);
        int mx=0;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,arr[i].deadline);
        }
        // make a array to find the postion of task
        int filled[]=new int[mx];
        Arrays.fill(filled,-1);
         int totalProfit=0,count=0;
         // array to find max profit at that time
         for(int i=0;i<n;i++){
             for(int j = arr[i].deadline-1;j>=0;j--){
                 if(filled[j]==-1){
                     filled[j]=1;
                     count++;
                     totalProfit+=arr[i].profit;
                     break;
                 }
             }
        }
        int[] ans ={count,totalProfit};
        return ans;
    }
}
 
