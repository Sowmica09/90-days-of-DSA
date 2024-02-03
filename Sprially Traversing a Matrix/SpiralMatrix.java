class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> res =new ArrayList<>();
        // code here
        int startRow=0;
        int startCol=0;
        int endRow=r-1;
        int endCol=c-1;
        while(startRow<=endRow && startCol<=endCol){
            //Top - row fixed i.e startRow
            for(int j=startCol;j<=endCol;j++){
                res.add(matrix[startRow][j]);
            }
            //Right - col fixed i.e endCol
            for(int i=startRow+1;i<=endRow;i++){
                res.add(matrix[i][endCol]);
            }
            //Bottom - row fixed i.e endRow
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow == endRow){
                    break;
                }
                res.add(matrix[endRow][j]);
            }
            //left -col fixed i.e startCol
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                res.add(matrix[i][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return res;
    }
}
