class Solution {
    static void inorderUtil(TreeNode root,ArrayList<Integer> ans){
        // left root right
        if(root==null)
          return;
        inorderUtil(root.left,ans);
        ans.add(root.val);
        inorderUtil(root.right,ans);  
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorderUtil(root,ans);
        return ans;
    }
}
