class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int arr[]=new int[n+m];
        for(int i=0;i<n;i++){
            arr[i]=arr1[i];
        }
        for(int i=0;i<m;i++){
            arr[n+i]=arr2[i];
        }
        Arrays.sort(arr);
        long ans=arr[k-1];
        return ans;
    }
}
