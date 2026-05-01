class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] preffixSum = new int[nums.length];
        int[] suffixSum = new int[nums.length];

        preffixSum[0] = 1;
        suffixSum[nums.length-1]=1;


        //calculate the prefix Sum
        for(int i=1;i<nums.length;i++)
        {
            preffixSum[i] = preffixSum[i-1] * nums[i-1];
        }
        
        //calculate the suffix Sum
        for(int i=nums.length-2;i>=0;i--)
        {
            suffixSum[i] =  suffixSum[i+1] * nums[i+1];
        }    
        
        for(int i=0;i<nums.length;i++)
        {
            suffixSum[i] = suffixSum[i] * preffixSum[i];
        }

    return suffixSum;
    }
}  
