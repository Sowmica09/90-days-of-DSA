class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        int meetings[][]= new int[start.length][3];
        for(int i=0;i<start.length;i++){
            meetings[i][0]=i;
            meetings[i][1]=start[i];
            meetings[i][2]=end[i];
        }
        Arrays.sort(meetings,Comparator.comparingDouble(o ->o[2]));
        int maxCount=1;
        int lastEnd=meetings[0][2];
        for(int i=1;i<n;i++){
            if(meetings[i][1]>lastEnd){
                maxCount++;
                lastEnd=meetings[i][2];
            }
        }
        return maxCount;
    }
}
