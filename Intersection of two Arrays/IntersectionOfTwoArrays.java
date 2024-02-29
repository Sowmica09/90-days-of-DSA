class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        HashSet<Integer> set= new HashSet<>();
        int i=0,j=0;
        while(i<n && j<m){
           if(a[i]==b[j]){
               set.add(a[i]);
               i++;
               j++;
           }
           else if(a[i]<b[j]){
               i++;
           }else{
               j++;
           }
            
        }
    return set.size();
    }
}
