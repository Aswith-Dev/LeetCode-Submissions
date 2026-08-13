class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
         int l = 0;
         int r = 0;
         int n = nums.length;
         int count = 0;
         int product = 1;
         while(r<n && l<n)
         {
            int len = r-l+1;
            if(len == 1)
                product = nums[r];
            else
                product *= nums[r];

                if(product < k)
                {
                    count++;
                    if(r < n-1)
                    {
                        r++;
                    }
                    else
                    {
                        l++;
                        r = l;
                        product = 1;
                    }
                } 
                else
                {
                    l++;
                    r = l;
                    product = 1;
                }   
         }
        return count;
    }
}