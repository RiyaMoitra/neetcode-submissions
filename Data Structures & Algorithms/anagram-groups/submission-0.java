class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> res = new HashMap<>();
        
        for(String str: strs)
        {
            List<String> curr = new ArrayList<>();
            char[] arr= str.toCharArray();
            Arrays.sort(arr);
            String sorted= new String(arr);
            if(res.containsKey(sorted))
            {
                curr= res.get(sorted);
            }
                curr.add(str);
                res.put(sorted, curr);
        }

        List<List<String>> result = new ArrayList<>();

        for(String val: res.keySet())
        {
            List<String> currVal = res.get(val);
            result.add(currVal);
        }
        return result;
    }
}
