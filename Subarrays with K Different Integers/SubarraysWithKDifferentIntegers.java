class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmostK(nums,k)- atmostK(nums,k-1);
    }
    public int atmostK(int nums[],int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        int left =0, right=0;
        while(right<nums.length){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()==k+1){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0) map.remove(nums[left]);
                left++;
            }
            count+= right-left+1;
            right++;
        }
        return count;
    }
}
