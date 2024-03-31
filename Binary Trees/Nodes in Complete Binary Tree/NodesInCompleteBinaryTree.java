public class Solution {
    public static int countNodes(BinaryTreeNode<Integer> root) {
        // Write your code here.
        if(root == null) return 0;
        int left =getLeftHeight(root);
        int right = getRightHeight(root);

        if(left == right)     return ((2<<(left))-1);
        else
          return countNodes(root.left)+countNodes(root.right)+1;
      }

      public static int getLeftHeight(BinaryTreeNode root){
          int count =0;
          while(root.left !=null){
              count++;
              root = root.left;
          }
          return count;
      }
      public static int getRightHeight(BinaryTreeNode root){
             int count=0;
             while(root.right !=null){
                 count++;
                 root = root.right;
             }
             return count;
      }
}
