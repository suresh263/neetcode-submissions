class Solution {
    public int characterReplacement(String s, int k) {

     Map<Character,Integer> frequencyMap = new HashMap<>();
     int window = 0;
     int l=0;
     int maxFrequency = 0;
     for(int r=0;r<s.length();r++)
     {
        frequencyMap.put(s.charAt(r),frequencyMap.getOrDefault(s.charAt(r),0)+1);
        maxFrequency = Math.max(maxFrequency,frequencyMap.get(s.charAt(r)));

        while(((r-l)+1)-maxFrequency > k)
        {
        frequencyMap.put(s.charAt(l), frequencyMap.get(s.charAt(l)) - 1);
        l++;
        }
        window = Math.max(window, r - l + 1); 
     }
return window;
    }
}
