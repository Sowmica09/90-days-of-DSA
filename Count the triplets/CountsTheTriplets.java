class Solution {
    int countTriplet(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int count=0;
        for(int i=n-1;i>=2;i--){
            int low =0;
            int high = i-1;
            while(low<high){
                if(arr[low]+arr[high]==arr[i]){
                    count++;
                    low++;
                    high--;
                }else if(arr[low]+arr[high]<arr[i]) low++;
                else high--;
            }
        }
        return count;
    }
}
