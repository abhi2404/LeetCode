class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
            for(int i : nums)
            {
                    map.put(i,map.getOrDefault(i,0)+1);
            }
            LinkedList<Integer> list = new LinkedList(map.keySet());
            Collections.sort(list,(w1,w2)->map.get(w2)-map.get(w1));
             int [] res=new int[k];
        for(int i=0;i<k;i++)
            res[i]=list.get(i);  
        return res;
    }
}