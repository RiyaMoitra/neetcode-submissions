class Solution {
    public int characterReplacement(String s, int k) {

        Map<Character,Integer> map = new HashMap<>();

        int result = 0;
        int left = 0;
        int max = 0;
//AAABABB
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right); //A
            map.put(c, map.getOrDefault(c, 0) + 1);//A->1
            max = Math.max(max , map.get(c)); //1

            while((right-left+1) - max > k){
                
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            result = Math.max(result , right-left+1);
        } 
        return result;
        
    }
}
