class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]>ans = new ArrayList<>();
        int idx=0;
        // If current interval is before newInterval we will add to ans
        while(idx<intervals.length){
            if(intervals[idx][0]<newInterval[0]){
                ans.add(intervals[idx]);
                idx++;
            }else{
                break;
            }
        }
        //If ans list is empty or last interval does not overlap with new interval we will add
        if(ans.size()==0 || (newInterval[0]>ans.get(ans.size()-1)[1])){
            ans.add(newInterval);
        } else{ 
            // If last interval and new Interval overlap then we take merge them
            int[] lastInterval = ans.get(ans.size()-1);
            lastInterval[1]=Math.max(lastInterval[1],newInterval[1]);
            } 
         while(idx<intervals.length){
          int[] lastInterval = ans.get(ans.size()-1);
          //If last interval overlap with current interval we will merge them
          if(lastInterval[1]>=intervals[idx][0]){
              lastInterval[1]=Math.max(lastInterval[1],intervals[idx][1]);
          }else{
              // If the last interval of lastInterval and curr interval does not overlap we just add to the ans
              ans.add(intervals[idx]);
          }
          idx++;
         }  
         return ans.toArray(new int[ans.size()][]);         
    }
}
