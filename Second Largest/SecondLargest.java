class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int max1=-1,max2=-1;
        int temp=0;
        for(int i=0;i<n;i++){
            if(max1<arr[i]){
                temp=max1;
                 max1=arr[i];
            }
            if(temp>max2){
                max2=temp;
            }
          if((arr[i]<max1) && (arr[i]>max2)){
            max2=arr[i];
          }
        }
        return max2;
    }
}
