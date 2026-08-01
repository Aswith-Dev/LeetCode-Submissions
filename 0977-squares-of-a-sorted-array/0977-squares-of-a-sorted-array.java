class Solution {
    public static int[] sortedSquares(int[] nums) {
       int i = 0;
       int n = nums.length;
       int j = n-1;
       int k = j;
       int temp[] = new int[n];
       while(i <= j)
       {
          if(Math.abs(nums[i]) < Math.abs(nums[j]))
          {
             temp[k] = nums[j]*nums[j];
             j--;
          }
          else
          {
            temp[k] = nums[i]*nums[i];
            i++;
          }
          k--;
       }   
       return temp;
    }
}