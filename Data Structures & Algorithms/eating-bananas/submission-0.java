class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
       for(int pile : piles){
            max = Math.max(max , pile);
       }

       int left = 0;
       int right = max;

       while(left <= right){
        int mid = (left + right) / 2;
        long totalTime = 0;

        for(int pile : piles){
            totalTime += Math.ceil((double) pile / mid);
        }
        if(totalTime <= h){
            max = mid;
            right = mid - 1;
        }
        else{
            left = mid + 1;
        }
       }
        return max;
    }
}
