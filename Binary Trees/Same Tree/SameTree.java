class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) {
            return true;
        }else if(p==null || q==null){
            return false;
        }
        //boolean leftSubTree = isSameTree(p.left , q.left), rightSubTree= isSameTree(p.right, q.right);
        return  p.val == q.val && isSameTree(p.left , q.left) && isSameTree(p.right , q.right) ;
    }
}
