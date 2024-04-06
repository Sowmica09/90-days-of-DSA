class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        TreeNode curr = root;
        while(curr!=null){
            if(curr.left==null){
                //left subtree is null
                 inorder.add(curr.val);
                 curr = curr.right;
            }else{
                TreeNode prev = curr.left;
                while(prev.right !=null && prev.right != curr){
                       prev = prev.right;
                }
                if(prev.right==null){
                    // we reach right node of left subtree we connect a thread with root
                    prev.right = curr;
                    curr = curr.left;
                }else{
                    // we break that thread
                    prev.right =null;
                    inorder.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        return inorder;
    }
}
