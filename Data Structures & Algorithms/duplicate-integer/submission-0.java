class Solution {
    public boolean hasDuplicate(int[] nums) {
        // you can do two for loops to find if they overlap
        //is there better way?
        //hmm
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}