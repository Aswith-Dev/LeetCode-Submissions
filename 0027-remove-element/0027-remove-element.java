class Solution {
    public int removeElement(int[] nums, int val) {
          int i = 0; //fast
          int j = -1; //slow
          int n = nums.length;
          int count = 0;
          while(i<n)
          {
            if(nums[i] != val)
            {
                j++;
                nums[j] = nums[i];
                count++;
            }
            i++;
          }
        return count;
    }
}