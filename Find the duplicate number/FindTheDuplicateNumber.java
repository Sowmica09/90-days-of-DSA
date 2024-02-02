class Solution {
    public int findDuplicate(int[] nums) {
        int slow=0 , fast=0;
        // This loop runs until slow != fast
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        //Once slow = fast then slow updates to 0 
            slow=0;
        //Until slow= fast we run the loop and if they become equal we return slow
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}
