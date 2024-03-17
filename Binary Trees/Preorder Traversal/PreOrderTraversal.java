class Solution {
    static void preorderUtil(TreeNode root,ArrayList<Integer> ans){
        if(root==null)
          return;
         ans.add(root.val);
         preorderUtil(root.left,ans);
         preorderUtil(root.right,ans);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        /*ArrayList<Integer> ans = new ArrayList<>();
        preorderUtil(root,ans);
         return ans; 
    }
}
