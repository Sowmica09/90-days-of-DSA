class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int xr =0;
        for(int i=0;i<n;i++){
            xr=xr^arr[i];
            xr=xr^(i+1);
        }
        //To find difference bit
        int number=(xr & ~(xr-1));
        int zero =0, ones =0;
        //Grouping of elements
        for(int i=0;i<n;i++){
            //part of 1's club
            if((arr[i]&number)!=0) {
                ones = ones^arr[i];
            }else{
                //part of 0's club
                zero = zero^arr[i];
            }
        }
        //Grouping n idx
        for(int i=1;i<=n;i++){
            //part of 1's club
            if((i&number)!=0){
                ones = ones^(i);
            }else{
                //part of 0's club
                zero=zero^(i);
            }
        }
        //To find zero club remainder is repeating or missing number
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]==zero) cnt++;
        }
        if(cnt==2){
            return new int[] {zero,ones};
        }
       return new int[] {ones,zero}; 
    }
}
