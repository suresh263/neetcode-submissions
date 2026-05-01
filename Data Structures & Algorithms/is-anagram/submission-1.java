class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()) return false;
     
     Map<Character,Integer> anagramMap = new HashMap<>();
     for(char ch: s.toCharArray())
     {
        anagramMap.put(ch,anagramMap.getOrDefault(ch,0)+1);
     }


  Map<Character,Integer> anagramMap1 = new HashMap<>();
     for(char ch: t.toCharArray())
     {
        anagramMap1.put(ch,anagramMap1.getOrDefault(ch,0)+1);
     }

     for(Map.Entry<Character,Integer> entry : anagramMap.entrySet())
{
        if(!entry.getValue().equals(anagramMap1.get(entry.getKey()))) return false;
    }
return true;
}
    }
