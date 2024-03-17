class Solution {
     public List<Integer> preorderTraversal(TreeNode root) {
         List<Integer> preorder = new ArrayList<>();
        if(root==null)
          return preorder;
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            preorder.add(root.val);
            // As stack pops top element out we take right then left 
            if(root.right!=null)
              st.push(root.right);
            if(root.left!=null)
                st.push(root.left);
        }  
        return preorder;
    }
}
