class Solution {
    public int removeDuplicates(int[] nums) {
          int f = 1;
          int s = 0;
          int n = nums.length;
          while(f < n)
          {
            if(nums[f-1] != nums[f])
            {
                s++;
                nums[s] = nums[f];
            }
            f++;
          }
          
            HashSet<Integer> set = new HashSet<>();
                for(int num:nums)
                {
                    set.add(num);
                }
                int count = set.size();
      return count; 
    }
}