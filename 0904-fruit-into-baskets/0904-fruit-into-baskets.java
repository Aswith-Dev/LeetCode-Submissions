class Solution {
    public int totalFruit(int[] fruits) {
       int dfg = 0;
       int n = fruits.length;
       int r = 0;
       int l = 0;
       int max = 0;

       HashMap<Integer,Integer> map = new HashMap<>();

       for(r=0; r<n; r++)
       {
              if(!map.containsKey(fruits[r]))
              {
                  dfg++;
                  map.put(fruits[r],1);  
              }  
              else
              {
                  map.put(fruits[r],map.get(fruits[r])+1);
              } 
      

              if(dfg <= 2)
              {
                  max = Math.max(max,r-l+1);
              }
              else // dfg > 2
              {
                 while(map.get(fruits[l]) > 1)
                 {
                    map.put(fruits[l],map.get(fruits[l])-1);
                    l++;
                 }
                 map.put(fruits[l],map.get(fruits[l])-1);
                 map.remove(fruits[l]);
                 l++;
                 dfg--;
                 
                 
              }
       }
          
     return max;
    }
}