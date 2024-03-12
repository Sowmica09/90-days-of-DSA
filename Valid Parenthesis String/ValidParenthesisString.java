class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        int left=0,right=0;
        for(int i=0;i<n;i++){
            char x = s.charAt(i);
            char y = s.charAt(n-i-1);
            left+=(x== '(' || x== '*')? 1 : -1;
            right+=(y== ')' || y== '*')? 1 : -1;
            if(left<0 || right<0) return false; //Unbalanced Parenthesis
        }
        return true;
    }
}
