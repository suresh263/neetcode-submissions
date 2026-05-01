class Solution {
    public boolean hasDuplicate(int[] nums) {
    Map<Integer,Integer> hashMap = new HashMap<>();
    for(int c : nums)
    {
      hashMap.put(c,hashMap.getOrDefault(c,0)+1); 
      if(hashMap.get(c)==2)
      {
        return true;
      } 
    }

return false;
    }
}
