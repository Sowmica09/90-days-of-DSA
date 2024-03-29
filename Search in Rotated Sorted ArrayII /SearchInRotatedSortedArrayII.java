class Solution {
    public boolean search(int[] nums, int target) {
        int n =nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(nums[mid]==target) return true;
            //if elements at low,mid,high are same the we shrink the array
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low=low+1;
                high=high-1;
                continue;
            }
            //left sorted
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid])
                    high=mid-1;
                 else
                     low=mid+1;
            }else{
                //right is sorted
                if(nums[mid]<=target && target<=nums[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return false;
    }
}
