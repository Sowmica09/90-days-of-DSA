class Solution {
      public List<Integer> inorderTraversal(TreeNode root) {
     //Iterative approach
     List<Integer> inorder= new ArrayList<Integer>();
     Stack<TreeNode> st = new Stack<TreeNode>();
     TreeNode node = root;
     while(true){
         if(node!=null){
             st.push(node);
             node = node.left;
         }else{
             if(st.isEmpty())
               break;
          node = st.pop();
          inorder.add(node.val);
          node = node.right;

         }
      }
      return inorder;

    }
}
