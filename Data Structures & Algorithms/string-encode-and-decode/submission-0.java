class Solution {

    public String encode(List<String> strs) {
        StringBuilder br = new StringBuilder();
        for(String str: strs)
        {
        br.append(str.length()).append("#").append(str);
        }
         return br.toString();
    }

    public List<String> decode(String str) {
      List<String> list = new ArrayList<>();
      int i=0;
      while(i<str.length())
      {
      int pos = (int)str.indexOf("#",i);
      int length = Integer.parseInt(str.substring(i, pos));
      list.add(str.substring(pos+1, pos+1+length));
      i= pos+1 +length;
      }

      
      return list;
    }
}
