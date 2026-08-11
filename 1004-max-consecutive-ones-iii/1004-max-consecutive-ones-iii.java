class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int n = nums.length;
        int zeros = 0;
        int maxOnes = 0;
        while(r < n && l<n)
        {
            if(nums[r] == 0)
            {
                 zeros++;
            }
                if(zeros <= k)
                {
                    maxOnes = Math.max(maxOnes, r-l+1);
                }
                else
                {
                  l++;
                  if(nums[l-1] == 0)
                  {
                    zeros--;
                  }  
                }
          r++;
        }
        return maxOnes;
    }
}