import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) 
    {
        
        int nums2[] = nums.clone();

        Arrays.sort(nums);

        int i = 0;
        int j = nums.length-1;
        int i1=0;
        int i2=0;

        while(i<j)
        {
            if(nums[i]+nums[j] == target)
            {
                int a = nums[i];
                int b = nums[j];

                for (int k = 0; k < nums2.length; k++)
                 {
                  if (nums2[k] == a) 
                  {
                      i1 = k;
                      break;
                  }
                }

              for (int k = 0; k < nums2.length; k++) 
              {
                  if (nums2[k] == b && k != i1) {
                      i2 = k;
                      break;
                  }
              }
                return new int[]{i1,i2};
            }
            else if(nums[i]+nums[j] > target)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return new int[]{};
    }

}

