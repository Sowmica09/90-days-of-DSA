class Solution {
    public void rotate(int[][] matrix) {
         int n = matrix.length;
          int temp[]=new int[n*n+1];
        int k=0;
        for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             temp[k++]=matrix[i][j];
         }
        }
        int startCol=0;
        int endCol=n-1;
         k=0;
        while(startCol<=endCol){
            for(int i=0;i<n;i++){
                matrix[i][endCol]=temp[k++];
            }
            endCol--;
        }
    }
}
