class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        String op="";
        return solve(n,n,op,ans);
    }
    public static List<String> solve(int open,int close,String op,List<String> ans){
      if(open==0 && close==0){
        ans.add(op);
        return ans;
      }
      if(open!=0){
          String op1 = op;
          op1+= "(";
          solve(open-1,close,op1,ans);
      }
      if(close>open){
          String op2 = op;
          op2+= ")";
          solve(open,close-1,op2,ans);
      }
     return ans;
    }
}
