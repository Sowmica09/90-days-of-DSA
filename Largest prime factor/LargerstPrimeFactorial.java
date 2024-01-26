class Solution{
     static boolean isPrime(int n){
         if(n==0 || n==1)
          return false;
          if(n==2) return true;
          for(int i=2;i<=Math.sqrt(n);i++){
              if(n%i==0){
                  return false;
              }
          }
          return true;
     }
    static long largestPrimeFactor(int N) {
        // code here
        long ans =0;
        for(int i=1; i<=Math.sqrt(N);i++){
            if((N%i==0)){
                 int div=N/i;
                 if(isPrime(div) && ans< div){
                     ans=div;
                 }else if(isPrime(i) && ans<i ){
                     ans = i;
                 }
             }
        }
        return ans;
    }
}
