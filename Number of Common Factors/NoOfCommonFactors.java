 public int commonFactors(int a, int b) {
         int common = 0;
         for(int i=1;i<=Math.min(a,b);i++){
             if((a%i==0) && (b%i==0)){
                  common++;

             }
          }
         return common;
        
    }
}
