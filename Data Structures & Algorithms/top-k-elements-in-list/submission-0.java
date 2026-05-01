class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencyMap = new LinkedHashMap<>();
        int counter=0;
        for(int num:nums)
        {
            
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }

       int[] arr = new int[k];

      PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));
          pq.addAll(frequencyMap.keySet());

      for(int i=0;i<k;i++)
      {
       arr[i]=pq.poll();
      }

       return arr;
    }
}
