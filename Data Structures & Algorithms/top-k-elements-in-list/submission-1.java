class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] buckets = new List[nums.length +1];
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }//key is actual number value is frequency
        for(int j : map.keySet()){
            int frequency = map.get(j);
            if(buckets[frequency] == null){
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(j);

        }
        int[] ans = new int[k];
        int index = 0;
        for(int x = buckets.length-1; x >= 0; x--){
            if(buckets[x] != null){
                for(int ii : buckets[x]){
                    ans[index] = ii;
                    index++;
                    if(index == k){
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}

/*
Break down
nums have ordered pairs
need k specific
therefore
put it in memory, add count 1 as we go thru the loop
if it is k >= return that value

       HashMap <Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int num : map.keySet()) {
            maxHeap.add(num);
        }
        int[] ans = new int[k];
        for(int j = 0; j < k; j++){
            ans[j] = maxHeap.poll();
        }
        
        return ans;
*/
