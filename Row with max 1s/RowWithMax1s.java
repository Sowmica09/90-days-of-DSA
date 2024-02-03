class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int maxOnes=0;
        int ind=-1;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(maxOnes<count){
                maxOnes=count;
                ind=i;
            }
        }
        return ind;
    }
}
