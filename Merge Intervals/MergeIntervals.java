class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(i->i[0]));
        List<int[]> ans = new ArrayList();
        int[] newinterval=intervals[0];
        ans.add(newinterval);
     for(int[] interval:intervals){
         if(interval[0]<=newinterval[1]){
             newinterval[1]=Math.max(newinterval[1],interval[1]);
         }else{
             newinterval=interval;
             ans.add(newinterval);
         }
     }
        
        return ans.toArray(new int[ans.size()][]);
    }
}
