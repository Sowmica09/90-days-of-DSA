class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer>mpp=new HashMap<>();
       int [] result = new int[2];
       for(int i=0;i<nums.length;i++){
           if(mpp.containsKey(target-nums[i])){
               result[0]=mpp.get(target-nums[i]);
               result[1]=i;
               return result;
           }
          mpp.put(nums[i],i);
       }
       return result;
       }
} 
