class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // Traversing the along the levels BFS
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        if(root==null)
          return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0;i<level;i++){
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                subList.add(q.poll().val);
            }
            ans.add(subList);
        }  
        return ans;
    }
}
