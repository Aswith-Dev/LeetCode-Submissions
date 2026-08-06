class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double windowAvg = 0;
        int sum = 0;

        for(int i=0; i<k; i++)
        {
            sum += nums[i];             
        }
        windowAvg = (double)sum/k; 
        
        double maxAvg = windowAvg;
        
        int n = nums.length;
        for(int r=k; r<n; r++)
        {
           sum = sum + nums[r] - nums[r-k]; 
           windowAvg = (double)sum/k;   
           maxAvg = Math.max(windowAvg,maxAvg);       
        }
        


        /*
         while(r < n)
        {
             sum = 0;
            for(int j=l; j<=r; j++)
            {
              
               sum += nums[j];
               windowAvg = (double)sum/k;   
            }
           l++;
           r++;
           maxAvg = Math.max(windowAvg,maxAvg); 
        }
        */
        return maxAvg;

    }
}