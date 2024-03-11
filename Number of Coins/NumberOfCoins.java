
class Solution{
   
   public int minCoinsUtil(int arr[],int ind, int T,int dp[][]){
       if(ind==0){
           if(T%arr[0]==0) return T/arr[0];
           else
             return (int)Math.pow(10,9);
       }
       if(dp[ind][T]!=-1) return dp[ind][T];
       int notTaken = 0+minCoinsUtil(arr,ind-1,T,dp);
       int taken = (int)Math.pow(10,9);
       if(arr[ind]<=T){
           taken= 1+minCoinsUtil(arr,ind,T-arr[ind],dp);
       }
       return dp[ind][T]=Math.min(taken,notTaken);
       
   }
	public int minCoins(int coins[], int M, int V) 
	{ 
	    // Your code goes here
	    int dp[][]=new int[M][V+1];
	    for(int row[]:dp) Arrays.fill(row,-1);
	    int ans = minCoinsUtil(coins,M-1,V,dp);
	    if(ans>=(int)Math.pow(10,9))
	      return -1;
	    return ans;  
	} 
}
