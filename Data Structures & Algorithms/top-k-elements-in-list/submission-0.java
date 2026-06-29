class Solution {
    public int[] topKFrequent(int[] nums, int k) {
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
    }
}

/*
Break down
nums have ordered pairs
need k specific
therefore
put it in memory, add count 1 as we go thru the loop
if it is k >= return that value
*/
