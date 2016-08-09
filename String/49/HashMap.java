public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0) return new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String s: strs) {
            char[] tmp = s.toCharArray();
            Arrays.sort(tmp);
            //String key = new String(tmp);
            String key = String.valueOf(tmp);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            } 
            map.get(key).add(s);  //the value must be added to the list whether or not the map contains the corresponding key.
        }
        return new ArrayList<List<String>>(map.values());
    }
}