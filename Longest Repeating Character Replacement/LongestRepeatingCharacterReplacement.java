class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxLen=0,maxFreq=0;
        for(int left=0,right=0;right<s.length();right++){
          map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
          maxFreq = Math.max(maxFreq,map.get(s.charAt(right)));
        // Checking whether current window is valid or not i.e. if no.of replacements are greater than k we iterate the left as window is not valid else we consider it as maxLength
          //length of string - Maximum Repeater char > k
          if(right-left+1 - maxFreq > k){
              map.put(s.charAt(left),map.get(s.charAt(left))-1);
              left++;
          }
          maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
