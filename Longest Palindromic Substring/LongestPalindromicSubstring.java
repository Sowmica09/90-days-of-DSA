class Solution {
     public static boolean isPalindrome(String str){
         int n =str.length();
         for(int i=0;i<n/2;i++){
             if(str.charAt(i)!=str.charAt(n-1-i)){
                 return false;
             }
         }
         return true;
     }
    public String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
            String s1 = s.substring(i,j+1);
            if(isPalindrome(s1) && sb.length()<s1.length()){
                sb.setLength(0);
                sb.append(s1);
            }
            }
        }
        return sb.toString();
    }
}
