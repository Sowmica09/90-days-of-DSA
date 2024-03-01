class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxlength =0;
        int left =0;
        for(int right=0; right<s.length(); right++){
            char ch = s.charAt(right);
            if(!map.containsKey(ch)|| map.get(ch)< left){
                map.put(ch,right);
                maxlength= Math.max(maxlength,right-left+1);
             }else{
                    left = map.get(ch)+1;
                    map.put(ch,right);
              }
         }
         return maxlength;
    }
}
