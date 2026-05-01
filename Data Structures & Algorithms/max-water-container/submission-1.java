class Solution {
    public int maxArea(int[] heights) {

        int left = 0;
        int right = heights.length-1;
        int max_seen_so_far=0;
        while(left<right)
        {
            max_seen_so_far = Math.max(max_seen_so_far,(right-left)*Math.min(heights[left],heights[right]));
            if(heights[left]<heights[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
    return max_seen_so_far;    
    }
}
