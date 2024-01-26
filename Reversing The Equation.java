 class Solution
{
   
    String reverseEqn(String S)
    {
        // your code here
        int i = S.length()-1;
        StringBuilder ans = new StringBuilder();
        while(i>=0){
            int j=i;
            int num=0;
            int pw =0;
            while(j>=0 && S.charAt(j)>='0' && S.charAt(j)<='9'){
                num+=(int)(S.charAt(j)-'0')*Math.pow(10,pw);
                pw++;
                j--;
            }
            ans.append(Integer.toString(num));
            while(j>=0 &&(S.charAt(j)<'0' || S.charAt(j)>'9') ){
                ans.append(S.charAt(j));
                j--;
            }
            i=j;
        }
        return ans.toString();
    }
