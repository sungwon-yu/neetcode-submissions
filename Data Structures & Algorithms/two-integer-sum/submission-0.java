class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> inventory = new HashMap<>();
        int diff = 0;
       // int[] ans = new int[];
        for(int i = 0; i < nums.length; i++){
            diff = target - nums[i];
            if(inventory.containsKey(diff)){
               return new int[] { inventory.get(diff), i };
            }
            inventory.put(nums[i], i);
        }

        return new int[] {}; // or return null;
    }
}
