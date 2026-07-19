class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
                 
                 int result = 0;
                 for(int num:nums)
                 {
                   if(map.containsKey(num))
                   {
                     map.put(num,map.get(num)+1);
                   }
                   else{
                     map.put(num,1);
                   }
                   
                 }
                 for(Integer key:map.keySet())
                 {
                   if(map.get(key).equals(1))
                    result = key;
                 }
      return result;
    }
}