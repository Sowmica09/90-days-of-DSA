class Solution {
    public int firstOccurrences(int[] arr,int n,int x){
        int low =0;
        int high=n-1;
        int first=-1;
        while(low<=high){
          int mid =(low+high)/2;
            if(arr[mid]==x){
                first=mid;high=mid-1;
            }else if(arr[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return first;
    }
    public int lastOccurrences(int[] arr,int n,int x){
        int low =0;
        int high=n-1;
        int last=-1;
        while(low<=high){
          int mid =(low+high)/2;
            if(arr[mid]==x){
                last=mid;low=mid+1;
            }else if(arr[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int n =nums.length;
        int first=firstOccurrences(nums,n,target);
        if(first==-1){
            int ans[]={-1,-1};
            return ans;
        }
        int last=lastOccurrences(nums,n,target);
        int ans[]={first,last};
        return ans;
    }
}
