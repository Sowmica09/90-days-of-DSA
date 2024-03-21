class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null)
          return ans;

        q.offer(root);
         boolean flag = true;
        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                if(flag==true) sublist.add(q.poll().val);
                else sublist.add(0,q.poll().val);
            }
            flag = !flag;
            ans.add(sublist);
        }  
        return ans; 
    }
}
