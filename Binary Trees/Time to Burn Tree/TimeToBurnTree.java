public class Solution
{
	private static int findMaxDistance(HashMap<BinaryTreeNode<Integer>,BinaryTreeNode<Integer>> mpp,BinaryTreeNode<Integer> target){
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
		q.offer(target);
		HashMap<BinaryTreeNode<Integer>,Integer> vis = new HashMap<>();
		vis.put(target,1);
		int maxi=0;
	    while(!q.isEmpty()){
           int sz = q.size();
		   int fl =0;
		   for(int i=0;i<sz;i++){
			   BinaryTreeNode<Integer> node = q.poll();

			   if(node.left!=null && vis.get(node.left)==null){
				     fl=1;
                      q.offer(node.left);
					  vis.put(node.left,1);
			   }
			   if(node.right!=null && vis.get(node.right)==null){
				   fl=1;
				   q.offer(node.right);
				   vis.put(node.right,1);
			   }
               //Parent
			   if(mpp.get(node)!=null && vis.get(mpp.get(node))==null){
				   fl=1;
				   q.offer(mpp.get(node));
				   vis.put(mpp.get(node),1);
			   }
		   }
		   if(fl==1) maxi++;
	    }
		return maxi;
	}
	public static BinaryTreeNode bfsToMapParent(BinaryTreeNode<Integer> root,HashMap< BinaryTreeNode<Integer>,BinaryTreeNode<Integer>> mpp,int start){
	
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
		q.offer(root);
		BinaryTreeNode<Integer> res = new BinaryTreeNode<>(-1);
		while(!q.isEmpty()){
			BinaryTreeNode<Integer> node = q.poll();
			if(node.data == start) res=node;
			if(node.left!=null){
				mpp.put(node.left,node);
				q.offer(node.left);
			}
			if(node.right != null){
				mpp.put(node.right, node);
				q.offer(node.right);
			}
		}
		return res;
	}
public static int timeToBurnTree(BinaryTreeNode<Integer> root, int start)
    {
        // Write your code here.
		HashMap<BinaryTreeNode<Integer>, BinaryTreeNode<Integer>> mpp = new HashMap<>();
		BinaryTreeNode<Integer> target = bfsToMapParent(root,mpp,start);
		int maxi = findMaxDistance(mpp,target);
		return maxi;
    }
}
