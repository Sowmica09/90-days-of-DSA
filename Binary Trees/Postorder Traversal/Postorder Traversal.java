class Solution {
    static void postorderUtil(TreeNode root,ArrayList<Integer> ans){
        //left right root
        if(root == null)
          return ;
        postorderUtil(root.left,ans);
        postorderUtil(root.right,ans);
        ans.add(root.val);  
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        postorderUtil(root,ans);
        return ans;
    }
}
