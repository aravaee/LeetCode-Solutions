class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> set = new HashSet<Integer>();
        
        for(int n: nums){
            set.add(n);
        }
        
        if(set.size() == nums.length){
            return false;
        }
        
        return true;
        
    }
}