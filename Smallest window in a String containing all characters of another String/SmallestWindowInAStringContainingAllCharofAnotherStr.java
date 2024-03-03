class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        // Your code here
        if(p=="") return "-1";
        if(p.length()>s.length()) return "-1";
        if(s.equals(p)) return s;
        
        HashMap<Character,Integer> pat = new HashMap<>();
        HashMap<Character,Integer> map = new HashMap<>();
        //First add characters and their frequency in pat map
        for(int i=0;i<p.length();i++) pat.put(p.charAt(i),pat.getOrDefault(p.charAt(i),0)+1);
        //Now add charcters and frequency of string s in map    
        int currLen =0;
        int totLen = pat.size();
        int left =0,right=0;
        String res="-1";
        int resLen = Integer.MAX_VALUE;
        while(right<s.length()){
            char c = s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            //check if charcter is in pat and freq is equal then increase count
    
            if(pat.containsKey(c) && pat.get(c)==map.get(c)){
                currLen++;
            }
            //if currLen == total length then we consider as result and check if there is any mimium size string
           while(currLen == totLen){
               if((right-left+1)<resLen){
                   res = s.substring(left,right+1);
                   resLen = right-left+1;
               }
               char t = s.charAt(left);
               map.put(t,map.get(t)-1);
               if(pat.containsKey(t) && map.get(t)<pat.get(t))
                  currLen--;
                left++;  
           }
            right++;
        }
        return (resLen !=Integer.MAX_VALUE)? res:"-1";
    }
}
