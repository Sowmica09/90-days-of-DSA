class Solution {
    boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public int countPrimes(int n) {
        int count=0;
        for(int i=0;i<n;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
}
