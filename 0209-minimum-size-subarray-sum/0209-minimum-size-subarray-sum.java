class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int n = nums.length;
        int sum = 0;
        int minLength = 0;
        /*
         for(int i=l; i<=r; i++)
        {
            sum += nums[i];
        }
        */
        sum = nums[0];
        while(r<n && l<n)
        {
            if(sum >= target)
            {
                int windowLength = r-l+1;
                  if(minLength == 0)
                   {
                    minLength = windowLength;
                   }
                 minLength = Math.min(minLength,windowLength);

                 sum -= nums[l++];  
            }
            else
            {
                r++;
                if(r < n)
                {
                    sum += nums[r];
                }
                
            }
        }

        return minLength;
    }
}