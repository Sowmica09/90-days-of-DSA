class Solution
{
    public boolean isPrime(int n){
        if(n==2){
            return true;
        }
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
             return false;
        }
        return true;
    }
    public long prime_Sum(int n)
    {
        // code here
           long sum =0;
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }
}
