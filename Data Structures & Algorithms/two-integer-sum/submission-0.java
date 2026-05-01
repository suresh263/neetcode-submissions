class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(frequencyMap.containsKey(target-nums[i]))
            {
                return new int[]{frequencyMap.get(target-nums[i]),i};
            }
            else{
                frequencyMap.put(nums[i],i);
            }
        }
       return new int[]{}; 
    }
}
