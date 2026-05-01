class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        int[] s1Frequency = new int[26];
        int[] s2Frequency = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Frequency[s1.charAt(i) - 'a']++;
            s2Frequency[s2.charAt(i) - 'a']++;
        }

        int left = 0;
        int right = s1.length();

        while (right < s2.length()) {
            if (compare(s1Frequency, s2Frequency)) return true;
            s2Frequency[s2.charAt(left) - 'a']--;
            left++;
            s2Frequency[s2.charAt(right) - 'a']++;
            right++;
        }

        return compare(s1Frequency, s2Frequency);
    }

    public boolean compare(int[] s1Arr, int[] s2Arr) {
        for (int i = 0; i < s1Arr.length; i++) {
            if (s1Arr[i] != s2Arr[i]) {
                return false;
            }
        }
        return true;
    }

}