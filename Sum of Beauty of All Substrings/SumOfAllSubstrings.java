class Solution {
    public int beauty(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            max=Math.max(max,arr[i]);
            if(arr[i]>=1){
                min=Math.min(min,arr[i]);
            }
         }
         return max-min;
    }
    public int beautySum(String s) {
       int res=0;
       for(int i=0;i<s.length();i++){
           int arr[]=new int[26];
            for(int j=i;j<s.length();j++){
                char ch = s.charAt(j);
                arr[ch-'a']++;
                res+=beauty(arr);
           }
       } 
       return res;
    }
}
