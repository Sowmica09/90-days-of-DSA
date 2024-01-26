class Solution {
    public static void print_divisors(int n) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                arr.add(i);
                int rem = n/i;
                if(i!=rem)
                  arr.add(rem);
            }
        }
        Collections.sort(arr);
        for(Integer item:arr){
            System.out.print(item+" ");
        }
     }
}
