class Solution{
public int maxArea(int[] height) 
    {
           int i = 0;
           int j = height.length-1;
           int res = 0;

          

            while(i < j)
            {
                int h = height[i]<height[j] ? height[i] : height[j];
                int w = Math.abs(i-j);
 
                int maxarea = h*w;

                if(maxarea >= res)
                {
                res = maxarea;
                }
                if(height[i] < height[j])
                {
                    i++;
                }
                else
                {
                    j--;
                }
            }
          return res; 
    }
}
