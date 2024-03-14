class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int laps[][]= new int[intervals.length][3];
        for(int i=0;i<intervals.length;i++){
            laps[i][0]=i;
            laps[i][1]=intervals[i][0];
            laps[i][2]=intervals[i][1];
        }
        Arrays.sort(laps,Comparator.comparingDouble(o -> o[2]));
        int maxCount =1;
        int lastEnd = laps[0][2];
        for(int i=1;i<intervals.length;i++){
            //start>=previous end then not overlapping
             if(laps[i][1]>=lastEnd){
                maxCount++;
                lastEnd=laps[i][2];
            }
        }
        return intervals.length - maxCount;
    }
}
