/**
Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> distinctSet = new HashSet<>();

        for(int num:nums)
        {
           if(!distinctSet.add(num))
           {
            return true;
           } 
           distinctSet.add(num);
        }
return false;
    }
}