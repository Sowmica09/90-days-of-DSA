class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       HashMap<Integer,Integer> inMap = new HashMap<>();
       for(int i=0;i<inorder.length;i++){
        inMap.put(inorder[i],i);
       } 
       TreeNode root = buildTrees(inorder,0,inorder.length-1,postorder,0,postorder.length-1,inMap);
       return root;
    }
    public static TreeNode buildTrees(int[] inorder,int inStart,int inEnd,int[] postorder,int postStart,int postEnd,HashMap<Integer,Integer> inMap){
          if(inStart>inEnd || postStart>postEnd) return null;
          TreeNode root = new TreeNode(postorder[postEnd]);

          int inRoot = inMap.get(postorder[postEnd]);
          int numsLeft =  inRoot - inStart;

          root.left = buildTrees(inorder,inStart,inRoot-1, postorder,postStart,postStart+numsLeft-1,inMap);
          root.right = buildTrees(inorder,inRoot+1,inEnd, postorder, postStart+numsLeft,postEnd-1,inMap);

          return root;
        
    }
}
