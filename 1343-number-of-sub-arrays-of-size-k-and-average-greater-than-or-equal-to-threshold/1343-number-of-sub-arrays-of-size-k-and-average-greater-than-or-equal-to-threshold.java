class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
         int r = 0;
         int n = arr.length;
         int sum = 0;
         int count = 0;
         int avg = 0;

         for(int i=0; i<k; i++)
         {
             sum += arr[i];
         } 
         avg = sum/k;
         if(avg >= threshold)
              {
                count++;
              } 
         for(r=k; r<n; r++)
         {
            sum = sum - arr[r-k] + arr[r];
            avg = sum/k;

             if(avg >= threshold)
              {
                count++;
              }  
         }
         return count;
    }
}