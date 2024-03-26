import java.util.*;
public class Solution {
      public static void getPaths(BinaryTreeNode curr,String path,List<String> paths){
          if(curr.left == null && curr.right==null){
               paths.add(path+curr.data);
               return;
          }
          if(curr.left !=null){
              getPaths(curr.left,path+curr.data+" ",paths);
          }
           if(curr.right !=null){
              getPaths(curr.right,path+curr.data+" ",paths);
          }
      }
    public static List<String> allRootToLeaf(BinaryTreeNode root) {
        // Write your code here.
        List<String> paths = new ArrayList<String>();
        if(root!=null)
           getPaths(root,"",paths);
          return paths;
    }
}
