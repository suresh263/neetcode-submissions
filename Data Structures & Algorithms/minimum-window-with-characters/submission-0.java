class Solution {
    public String minWindow(String s, String t) {

        if (s.length() == 0 || t.length() == 0) return "";

        Map<Character, Integer> frequencyMap = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int[] result = {-1, 0, 0};
        int required = frequencyMap.size();
        int formed = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);
            if (frequencyMap.containsKey(c) && frequencyMap.get(c).equals(windowMap.get(c))) {
                formed++;
            }

            while (formed == required && left <= right) {
                c = s.charAt(left);
                if (result[0] == -1 || (right - left + 1) < result[0]) {
                    result[0] = right - left + 1;
                    result[1] = left;
                    result[2] = right;
                }

                windowMap.put(c, windowMap.get(c) - 1);
                if (frequencyMap.containsKey(c) && windowMap.get(c) < frequencyMap.get(c)) {
                    formed--;
                }

                left++;
            }
            right++;

        }
        return result[0] == -1 ? "" : s.substring(result[1], result[2] + 1);
    }
}