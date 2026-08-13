class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
          int l = 0;
          int r = 0;
          int n = nums.length;
          int count = 0;
          int product = 1;
          if(k <= 1) return 0;
          for( r=0; r<n; r++)
          {
              product *= nums[r];
              while(product >= k)
              {
                 product /= nums[l];
                 l++;
              }
              count += r-l+1;

          }
          return count;
    }
}