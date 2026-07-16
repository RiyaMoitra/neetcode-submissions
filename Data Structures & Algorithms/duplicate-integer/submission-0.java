class Solution {
    public boolean hasDuplicate(int[] nums) {

        if(nums.length <= 1){
            return false;
        }
        
        Set<Integer> unique = new HashSet<>();

        for (int num : nums){
            if(unique.contains(num)){
                return true;
            }
            else{
                unique.add(num);
            }
        }
        return false;
    }
}