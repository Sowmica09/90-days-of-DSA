 class Solution {
    public int numberOfSubstrings(String s) {
       int count=0;
       HashMap<Character,Integer> map = new HashMap<>(); 
       int left=0, right=0;
        while(right<s.length()){
            if(!map.containsKey(s.charAt(right))){
                map.put(s.charAt(right),1);
            }else{
                int freq = map.get(s.charAt(right));
                map.put(s.charAt(right),freq+1);
            }
            if(map.size()==3){
         // As map sizes equals to 3 means it contains a,b,c then remaining charcters forms substrings so we just add them to count
                count+=s.length()-right;
            }
            //to Shift the window we move our left pointer
            while(left<=right && map.size()==3){
               char ch = s.charAt(left);
               int freq = map.get(ch);
               map.put(ch,freq-1);

            // frequency becomes 0 we remove that character
               if(map.get(ch)==0) map.remove(ch);
               left++;


               // if after moving left pointer still map size equals to 0 then we add that to count
               if(map.size()==3){
                   count+=s.length()-right;
               }
            }
            right++;
         }
    
       return count;
    }
}
