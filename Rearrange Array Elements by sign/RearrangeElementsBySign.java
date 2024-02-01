class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pos[]= new int[n/2];
        int neg[]= new int[n/2];
        int j=0,k=0;
      for(int i=0;i<n;i++){
          if(nums[i]<0){
              neg[j]=nums[i];
              j++;
          }else{
              pos[k]=nums[i];
              k++;
          }
      }
         int i=0;
        j=0;k=0;
        while(i<n){
            if(i%2==0){
                nums[i++]=pos[j++];
            }else{
                nums[i++]=neg[k++];
            }
        }
        return nums;
    }
}
