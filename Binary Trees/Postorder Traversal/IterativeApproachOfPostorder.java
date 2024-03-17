class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder = new ArrayList<Integer>();
        if(root==null) return postOrder;

        Stack<TreeNode> st = new Stack<TreeNode>();
        while(root!=null || !st.isEmpty()){
            if(root!=null){
                st.push(root);
                root= root.left;
            }else{
                TreeNode temp = st.peek().right;
                if(temp==null){
                    temp = st.peek();
                    st.pop();
                    postOrder.add(temp.val);
                    while(!st.isEmpty() && temp==st.peek().right){
                        temp=st.peek();
                        st.pop();
                        postOrder.add(temp.val);
                    }
                }else root =temp;
            }
        } 
         return postOrder;

    }
}
