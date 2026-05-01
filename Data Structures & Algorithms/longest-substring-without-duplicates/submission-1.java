class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_so_far = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> frequencySet = new HashSet<>();
            frequencySet.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (!frequencySet.add(s.charAt(j))) {
                    break;
                }
            }
            max_so_far = Math.max(max_so_far, frequencySet.size());
        }
        return max_so_far;
    }
}