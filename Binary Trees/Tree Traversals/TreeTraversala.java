public class Solution {
    public static void getTraversalUtil(TreeNode root,List<Integer> in,List<Integer> pre, List<Integer> post){
           Stack<Pair> st = new Stack<Pair>();
           st.push(new Pair(root,1));

           if(root==null) return;
           while(!st.isEmpty()){
               Pair it = st.pop();

               if(it.num==1){
                   pre.add(it.node.data);
                   it.num++;
                  st.push(it);

                  if(it.node.left!=null){
                      st.push(new Pair(it.node.left,1));
                  }
               }
               else if(it.num==2){
                   in.add(it.node.data);
                   it.num++;
                   st.push(it);

                   if(it.node.right!=null){
                       st.push(new Pair(it.node.right,1));
                   }
               }else{
                   post.add(it.node.data);
               }
           }
     

    }
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        // Write your code here.
         List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();

        getTraversalUtil(root, in, pre, post);
        List<List<Integer>> ans = new ArrayList<>();
         ans.add(in);
         ans.add(pre);
         ans.add(post);
        return ans;
    }
}
