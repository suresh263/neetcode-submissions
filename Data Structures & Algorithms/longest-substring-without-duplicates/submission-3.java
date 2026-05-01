class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        Set<Character> frequencyMap = new HashSet<>();
        int max_so_far = 0;
        while (right < s.length()) {
            while (frequencyMap.contains(s.charAt(right))) {
                frequencyMap.remove(s.charAt(left));
                left++;
            }
            frequencyMap.add(s.charAt(right));
            max_so_far = Math.max(max_so_far, right - left + 1);
            right++;
        }
        return max_so_far;
    }
}