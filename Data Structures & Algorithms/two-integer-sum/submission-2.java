class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        //nums->[3,2,4] target -> 6 ans = [1,2]

        for(int i = 0; i < nums.length; i++){
            int need = target - nums[i];
            if(seen.containsKey(need)){
                return new int[] {seen.get(need), i};
            }
            seen.put(nums[i] , i);

        }
           return new int [] {};
   
    }
}
