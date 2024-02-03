class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	int start=0;
    	int end = n-1;
    	while(start<end){
    	    if(M[start][end]==1)
    	      start++;
    	    else
    	      end--;
    	}
    	for(int i=0;i<n;i++){
    	    if((i!=start)&&(M[start][i]==1  || M[i][start]!=1))
    	      return -1;
    	}
    	return start;
    }
}
