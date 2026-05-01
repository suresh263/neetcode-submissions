class Solution {
    public int maxArea(int[] heights) {

        int max_seen_so_far=0;

        for(int i=0;i<heights.length;i++)

        {
            for(int j=i+1;j<heights.length;j++)
            {
                max_seen_so_far= Math.max(max_seen_so_far,Math.min(heights[i],heights[j])*(j-i));
            }
        }
     return max_seen_so_far;   
    }
}
