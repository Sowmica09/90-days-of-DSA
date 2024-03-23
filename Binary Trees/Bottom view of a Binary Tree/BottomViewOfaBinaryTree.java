

//User function Template for Java

class Pair{
    int hd;
    Node node;
    public Pair(Node tmp,int hd){
        this.node = tmp;
        this.hd  = hd;
    }
}
class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<Pair> q = new LinkedList<Pair>();
        Map<Integer,Integer> map = new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair it = q.poll();
            int hd = it.hd;
            Node tmp = it.node;
            
            map.put(hd,tmp.data);
            if(tmp.left !=null){
                q.add(new Pair(tmp.left,hd-1));
            }
            if(tmp.right !=null){
                q.add(new Pair(tmp.right,hd+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
