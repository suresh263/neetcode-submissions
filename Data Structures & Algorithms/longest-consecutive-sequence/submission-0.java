class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        int max_seen_so_far = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!hashSet.contains(nums[i] - 1)) {
                int currentNum = nums[i];
                int currentCounter = 1;

                while (hashSet.contains(currentNum + 1)) {
                    currentNum +=1;
                    currentCounter++;
                }
                 max_seen_so_far = Math.max(max_seen_so_far, currentCounter);
            }
            
           
        }

        return max_seen_so_far;
    }
}