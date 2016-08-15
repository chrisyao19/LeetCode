public class Solution {
    public boolean isIsomorphic(String s, String t) {
        //Solution1: Using containsValue() to determine if the Hashmap contains the specified value.
        // HashMap<Character,Character> map = new HashMap<Character,Character>();
        // for(int i=0; i<s.length();i++) {
        //     if(!map.containsKey(s.charAt(i))) {
        //         //if(map.containsKey(t.charAt(i))) return false;
        //         if(map.containsValue(t.charAt(i))) return false;  
        //         map.put(s.charAt(i),t.charAt(i));
        // } else {
        //     if(t.charAt(i)!=map.get(s.charAt(i))) return false;
        //     }
        // }
        // return true;
        
        //Solution2: Using two arrays, every char from each position has a unique value, but exclude 0.
        int[] i1 = new int[256];
        int[] i2 = new int[256];
        for(int i=0; i<s.length();i++) {
            if(i1[s.charAt(i)]!=i2[t.charAt(i)]) return false;
            i1[s.charAt(i)] = i2[t.charAt(i)] = i+1;
        }
        return true;
    }
    
}