class Solution {
    public int[] twoSum(int[] numbers, int target) {
        

        int left = 0;
        

        for(left = 0; left < numbers.length - 1; left++){

            int right = left + 1;

            while(right < numbers.length){
                if(numbers[left] + numbers[right] == target){

                    return new int[] {left + 1 , right + 1};

                }
                else{

                    right++ ;

                }
            }
        }

        return new int[] {-1 , -1};
    }
}
