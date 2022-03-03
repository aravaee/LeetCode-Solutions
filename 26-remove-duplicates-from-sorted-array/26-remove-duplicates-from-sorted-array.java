class Solution {
    public int removeDuplicates(int[] nums) {
        
        int available_index = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                nums[available_index] = nums[i];
                available_index++;

            }
        }
        
        return available_index;
        
    }
}