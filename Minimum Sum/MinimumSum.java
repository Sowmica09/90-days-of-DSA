class Solution {
    String solve(int[] arr, int n) {
        // code here
        String ans="";
        if(n==1) return ""+arr[0];
        Arrays.sort(arr);
        int rem =0,j=n-1;
        for(;j>=1;j-=2){
            if(arr[j]!=0){
                int a=arr[j];
                int b=arr[j-1];
                int sum =a+b+rem;
                ans =sum%10 + ans;
                rem =sum/10;
            }else{
                break;
            }
        }
        if(j==n-1) return "0";
        if(n%2!=0 && arr[0]+rem!=0) ans =(rem+arr[0])+ans;
        else if(rem!=0) ans =rem+ans;
        
        return ans;
   
    }
}
