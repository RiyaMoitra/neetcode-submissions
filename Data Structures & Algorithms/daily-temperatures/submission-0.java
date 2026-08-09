class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int [temperatures.length];
      

        for(int i = 0; i < temperatures.length; i++){
            int count = 1;
            int j = i + 1;

            while(j < temperatures.length){
                if(temperatures[j] > temperatures[i]){
                    break;
                }
                j++;
                count++;
            }
            count = (j == temperatures.length) ? 0 :count;
            result[i] = count;
        }
        return result;
        
    }
}
