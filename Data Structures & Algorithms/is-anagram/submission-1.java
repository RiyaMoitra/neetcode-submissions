class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        Map<Character , Integer> mapS = new HashMap<>();
        Map<Character , Integer> mapT = new HashMap<>();
        
        for (char c : s.toCharArray()){
            if(mapS.containsKey(c)){
                mapS.put(c, mapS.get(c) + 1) ;
            }
            else {
                mapS.put(c,1);
            }
        }
        for (char c : t.toCharArray()){
            if(mapT.containsKey(c)){
                mapT.put(c, mapT.get(c) + 1) ;
            }
            else {
                mapT.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer> entry : mapS.entrySet()){
            if(!mapT.containsKey(entry.getKey()) || !entry.getValue().equals(mapT.get(entry.getKey()))){
                    return false;
            }
        }

        return true;

    }
    
}
