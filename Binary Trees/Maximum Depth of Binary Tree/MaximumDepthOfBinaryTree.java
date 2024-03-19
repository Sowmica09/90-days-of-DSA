class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        q.addLast(root);

        int level=0;
        while(q.size()>0){
            int size = q.size();
            while(size-->0){
                TreeNode remNode = q.removeFirst();
                if(remNode.left!=null){
                    q.addLast(remNode.left);
                }
                if(remNode.right!=null){
                    q.addLast(remNode.right);
                }
            }
            level++;
        }
        return level;
    }
}
