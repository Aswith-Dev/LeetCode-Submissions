class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {

      int i = 0;
      int n = nums.length;
      int count = 0;
      int max  = 0;

        while(i < n)
        {
            if(nums[i] == 1)
            {
                count++;
                //i++;
                max  = Math.max(max,count);
            }     
            else
            {
                //i++;
                count = 0;
            }
            i++;
        }


        return max;
    }
}