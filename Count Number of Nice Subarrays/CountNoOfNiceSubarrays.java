class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int i=0;
        while(i!=n){
            //odd number
            if(nums[i]%2!=0) nums[i]=1;
            //even number
            else nums[i]=0;
            i++;
        }
        //we will use prefix sum method
        int count =0, sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        i=0;
        while(i!=n){
            sum+=nums[i];
            //Once sum equals to K we increment the count
            if(sum==k) count++;
            if(map.containsKey(sum-k)){
            // if map contains sum-k as key i.e if we slide the window we will get a subarray of sum K so we increment count
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            i++;
        }
        return count;
    }
}
