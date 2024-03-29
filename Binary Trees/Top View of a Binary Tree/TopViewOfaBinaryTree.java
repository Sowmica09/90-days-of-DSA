

//User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Pair{
    int hd;
    Node node;
    
    public Pair(Node tmp,int hd){
         this.node = tmp;
         this.hd = hd;
    }
}

class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null)  return ans;
        
       Map<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
         q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair it = q.remove();
            int hd = it.hd;
            Node temp = it.node;
            
            if(map.get(hd)==null) map.put(hd,temp.data);
            if(temp.left !=null) {
                q.add(new Pair(temp.left,hd-1));
            }
            if(temp.right !=null){
                q.add(new Pair(temp.right,hd+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
      return ans;  
    }
}
