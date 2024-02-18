class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
        String dp="";
        boolean vis[][]= new boolean[n][n];
        ratMaze(m,n,0,0,ans,dp,vis );
        return ans;
    }
    public static void ratMaze(int[][] m,int n,int row,int col,ArrayList<String> ans,String dp,boolean vis[][]){
        if(row==n-1 && col==n-1 && m[row][col]!=0){
            ans.add(dp);
            return;
        }

         if(row>=0 && row< n && col>=0 && col<n){
             if(vis[row][col]==true || m[row][col]==0) return;
             vis[row][col]=true;
             ratMaze(m,n,row+1,col,ans,dp+'D',vis);
             ratMaze(m,n,row,col-1,ans,dp+'L',vis);
             ratMaze(m,n,row,col+1,ans,dp+'R',vis);
             ratMaze(m,n,row-1,col,ans,dp+'U',vis);
             vis[row][col]=false;
 
         }
         
 
    }
}
