/**
Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stck = new Stack<>();
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int t = temperatures[i];
            while (!stck.isEmpty() && t > stck.peek()[0]) {
                int[] pair = stck.pop();
                result[pair[1]] = i - pair[1];
            }
            stck.push(new int[]{t, i});
        }
        return result;
    }
}