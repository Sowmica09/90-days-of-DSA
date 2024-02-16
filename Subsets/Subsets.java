class Solution {

    public static void helper(int[] nums,int ci,List<Integer>subset,List<List<Integer>> ans){
        //ci= current index
        if(ci== nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[ci]);
        helper(nums,ci+1,subset,ans);

        subset.remove(subset.size()-1);
        helper(nums,ci+1,subset,ans);
        return;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,new ArrayList<Integer>(),ans);
        return ans;
    }
}
