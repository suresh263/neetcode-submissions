class Solution {
    public int largestRectangleArea(int[] heights) {
        int max_height = 0;
        Stack<Integer> stck = new Stack<>();
        int length = heights.length;

        for (int i = 0; i <= length; i++) {
            int currentHeight = (i == length) ? 0 : heights[i];
            while (!stck.isEmpty() && currentHeight < heights[stck.peek()]) {
                int height = heights[stck.pop()];
                int width = stck.isEmpty() ? i : i - stck.peek() - 1;
                max_height = Math.max(max_height,height * width);
            }
            stck.push(i);
        }

        return max_height;
    }
}