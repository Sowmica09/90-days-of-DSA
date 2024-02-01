class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind=-1;
        //find break point where there is dip(decrease)
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            reverse(nums,0,n-1);
            return;
        }
        //swap break point with next slightly greater element
        for(int i=n-1;i>ind;i--){
          if(nums[i]>nums[ind]){
              swap(nums,i,ind);
              break;
          }
        }
        //Reverse last elements till break point as we need small value
        reverse(nums,ind+1,n-1);
        return;
    }
    public void swap(int[] A,int i,int j){
        int temp = A[i];
        A[i]=A[j];
        A[j]=temp;
    }
    public void reverse(int[] A,int i,int j){
        while(i<j) swap(A,i++,j--);
    }
}
