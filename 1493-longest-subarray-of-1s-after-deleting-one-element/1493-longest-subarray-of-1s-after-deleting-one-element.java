class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0;
        int r = 0;
        int n = nums.length;
        int count = 0;
        int max = 0;
        int zeros = 0;
        for(r=0; r<n; r++)
        {
           if(nums[r] == 0)
           {
              zeros++;
           } 

           if(zeros <= 1)
           {
              max = Math.max(max,r-l+1);              
           }
           else
           {
             if(nums[l] == 0)
             {
                zeros--;
             }
             l++;
           }
        }  
        return max-1; 
    }
}