class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l = 0;
        int r = 0;
        int n = nums.length;
        int sum = 0;
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        while(r < n)
        {
            if(!map.containsKey(nums[r]))
            {
                map.put(nums[r],1);
            }
            else
            {
                map.put(nums[r],map.get(nums[r])+1);
            }

            if(map.get(nums[r]) == 1)
            {
                sum += nums[r];
                max = Math.max(max,sum);
                r++;
            }
            else
            {
               map.put(nums[l],map.get(nums[l])-1);
               sum  -= nums[l];
               max = Math.max(max,sum); 

               map.remove(nums[l]);
               l++;
            }
        }      
       return max;
    }
}