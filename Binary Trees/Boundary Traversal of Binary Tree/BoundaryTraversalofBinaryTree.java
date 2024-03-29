public class Solution {
 public static Boolean isLeaf(TreeNode root){
        return (root.left==null)&&(root.right==null);

    }

    public static void addLeftBoundary(TreeNode root,ArrayList < Integer > res){
       TreeNode cur=root.left;
       while(cur!=null){
           if(isLeaf(cur)==false) res.add(cur.data);
           if(cur.left!=null)cur=cur.left;
           else cur=cur.right;
       }

    }

    public static void addrightBoundary(TreeNode root,ArrayList< Integer > res){
        TreeNode cur=root.right;
        ArrayList<Integer>tmp=new ArrayList<Integer>();
        while(cur!=null){
            if(isLeaf(cur)==false) tmp.add(cur.data);

            if(cur.right!=null)cur=cur.right;
            else cur=cur.left;
        }
        int i;
        for(i=tmp.size()-1;i>=0;--i){
            res.add(tmp.get(i));
        }
    }

    public static void addLeaves(TreeNode root, ArrayList < Integer > res) {

        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }
        if (root.left != null) addLeaves(root.left, res);
        if (root.right != null) addLeaves(root.right, res);
    }


    public static List<Integer> traverseBoundary(TreeNode node){
        // Write your code here.
         ArrayList < Integer > ans = new ArrayList < Integer > ();
        if (isLeaf(node) == false) ans.add(node.data);
        addLeftBoundary(node, ans);
        addLeaves(node, ans);
        addrightBoundary(node, ans);
        return ans;

    }

}

