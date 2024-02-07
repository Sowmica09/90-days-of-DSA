class Solution {
    static int findDays(int weights[],int cap){
        int days =1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>cap){
                days++;
                load = weights[i];
            }else{
                load+=weights[i];
            }
        }
        return days;
        
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = Integer.MIN_VALUE;
        int high =0;
        for(int i=0;i<n;i++){
            high+=weights[i];
            low = Math.max(low,weights[i]);
        }
        while(low<=high){
            int mid = (low+high)/2;
            int noOfDays = findDays(weights,mid);
            if(noOfDays<=days){
                //eliminate left array
                high= mid-1;
            }else{
                //eliminate right array
                low = mid+1;
            }
        }
        return low;
    }
}
