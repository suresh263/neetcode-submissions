class Solution {
    Map < String, List < String >> frequencyMap = new HashMap < > ();
    List < List < String >> result = new ArrayList < > ();

    public List < List < String >> groupAnagrams(String[] strs) {

        for (String word: strs) {
            frequencyHelper(word);
        }

        for (Map.Entry<String,List<String>> map: frequencyMap.entrySet()) {
            result.add(map.getValue());
        }
        return result;
    }


    public void frequencyHelper(String str) {
        int[] arr = new int[26];
        for (char ch: str.toCharArray()) {
            arr[ch - 'a']++;
        }
        if (frequencyMap.containsKey(Integer.toString(Arrays.hashCode(arr)))) {
            List<String> frequencyList = frequencyMap.get(Integer.toString(Arrays.hashCode(arr)));
            frequencyList.add(str);
        } else {
            frequencyMap.put(Integer.toString(Arrays.hashCode(arr)), new ArrayList<>(Arrays.asList(str)));
        }

    }

}