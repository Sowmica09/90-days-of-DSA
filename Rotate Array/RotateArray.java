class Solution {
    public static void Reverse(int[] arr, int start, int end) {
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
    public void rotate(int[] nums, int k) {
        int n =nums.length;
          if (n == 0)
    return;
  k = k % n;
  if (k > n)
    return;

            // Reverse first n-k elements
    Reverse(nums, 0, n - k - 1);
    // Reverse last k elements
    Reverse(nums, n - k, n - 1);
    // Reverse whole array
    Reverse(nums, 0, n - 1);
   
    }
}
