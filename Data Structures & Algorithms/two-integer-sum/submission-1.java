class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> compliment = new HashMap<>();

        //nums->[3,2,4] target -> 6 ans = [1,2]

        for(int i = 0; i < nums.length; i++){
            compliment.put(target - nums[i], i); // {3,0}  {4,1} {2,2}
        }
        for(int i = 0; i < nums.length; i++){
            if(compliment.containsKey(nums[i]) && i != compliment.get(nums[i])){
                return new int[]{i , compliment.get(nums[i])};
            }
        }
    return new int [] {};
    }
}
