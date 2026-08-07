class Solution {
    public boolean isValid(String s) {

        Map<Character,Character> map = new HashMap<>();

        map.put(')' , '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> q = new Stack<>();
        

        for(int i = 0 ; i < s.length();i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){

                q.push(c);

            }
            else{
                if(q.isEmpty() ||  q.peek() != map.get(c)){

                return false;
                }
                q.pop();
            }
            

        }
        return q.isEmpty();
    }
}
