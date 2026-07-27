class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> llist = new ArrayList<>();
       Arrays.sort(nums);
       int i = 0;
       int j = i+1;
       int k = nums.length-1;

       for(i = 0; i<k; i++)
       {
          if(i>0 && nums[i] == nums[i-1]) continue;
            j = i+1;
            k = nums.length-1;
            while(j<k)
            {
                  if(i!=j && i!=k && j!=k)
                  {
                        int sum = nums[i]+nums[j]+nums[k];
                        if(sum == 0)
                        {
                              llist.add(Arrays.asList(nums[i],nums[j],nums[k]));
                              while(j<k && nums[j] == nums[j+1]) j++;
                              while(j<k && nums[k] == nums[k-1]) k--;
                              k--;
                              j++;
                        }
                        else if(sum<0)
                        {
                           j++;
                        }
                        else
                        {
                              k--;
                        }

                  }
            }
            
       }
        
       
       return llist;  
    }
}