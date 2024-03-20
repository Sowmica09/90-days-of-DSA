class Solution {
    public int maxPathSum(TreeNode root) {
        int maxVal[]=new int[1];
        maxVal[0]=Integer.MIN_VALUE;
        findmaxPathDown(root,maxVal);
        return maxVal[0];
    }
    static int findmaxPathDown(TreeNode root,int[] maxVal){
        if(root == null) return 0;
        int lh = Math.max(0,findmaxPathDown(root.left,maxVal));
        int rh = Math.max(0,findmaxPathDown(root.right,maxVal));
        maxVal[0] = Math.max(maxVal[0],lh+rh+root.val);
        return (root.val)+Math.max(lh,rh);
    }
}
