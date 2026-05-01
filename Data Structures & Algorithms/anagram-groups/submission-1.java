class Solution {
    Map<String,List<String>> frequencyMap = new HashMap<>();

    public List<List<String>> groupAnagrams(String[] strs) {
        for (String word: strs) {
            frequencyHelper(word);
        }
      return new ArrayList<>(frequencyMap.values());
    }


    public void frequencyHelper(String str) {
        int[] arr = new int[26];
        for (char ch: str.toCharArray()) {
            arr[ch - 'a']++;
        }
        String Key  = Integer.toString(Arrays.hashCode(arr));
        if (frequencyMap.containsKey(Key)) {
            List<String> frequencyList = frequencyMap.get(Key);
            frequencyList.add(str);
        } else {
            frequencyMap.put(Key, new ArrayList<>(Arrays.asList(str)));
        }

    }

}