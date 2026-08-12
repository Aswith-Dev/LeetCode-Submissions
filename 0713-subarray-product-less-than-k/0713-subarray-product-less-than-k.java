class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k)
{
    int l, r;
    int product;
    int n = nums.length;
    int count = 0;

    if (k > 0)
    {
        for (l = 0; l < n; l++)
        {
            product = 1;

            for (r = l; r < n; r++)
            {
                int len = r - l + 1;

                if (len == 1)
                {
                    product = nums[r];
                }
                else
                {
                    product *= nums[r];
                }

                if (product < k)
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
        }
    }

    return count;
}
}