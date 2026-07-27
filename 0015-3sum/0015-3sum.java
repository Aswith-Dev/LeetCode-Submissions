class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> llist = new ArrayList<>();
       Arrays.sort(nums);
       int i = 0;
       int j = i+1;
       int k = nums.length-1;

       while(i<k)
       {
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
                              
                              k--;
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
            i++;
       }
        
         List<List<Integer>> ans = new ArrayList<>(new HashSet<>(llist));
       
       return ans;  
    }
}