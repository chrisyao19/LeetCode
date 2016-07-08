public class Solution {
    public boolean isAnagram(String s, String t) {
        //Solution1 sort
        // if(s.length()!=t.length()) return false;
        // return sort(s).equals(sort(t));
        
        //Solution2 using array.
        if(s.length()!=t.length()) return false;
        int[] result = new int[256];
        char[] char_set = s.toCharArray();
        for(int i:char_set) {
            result[i]++;
        }
        char_set = t.toCharArray();
        for(int i:char_set) {
            if(--result[i] < 0) return false;
        }
        return true;
        
        
        
    }
    public String sort(String s) {
        char[] char_set = s.toCharArray();
        Arrays.sort(char_set);
        return new String(char_set);
    }
}