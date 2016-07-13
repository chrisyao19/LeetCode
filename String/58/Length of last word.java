public class Solution {
    public int lengthOfLastWord(String s) {
        int space = 32;
        s = helper(s);
        char[] chars = s.toCharArray(); 
        for(int i=chars.length-1; i>=0; i--) {
            if(chars[i]==space) {
                return chars.length-1-i;
            }
        }
        return s.length();
    }
    public String helper(String s) {
        int len = s.length();
        for(int i = len-1; i>=0; i--) {
            if(s.charAt(i)==' ') {
                s = s.substring(0,i);
            } else {
                break;
            }
        }
        return s;
       
    }
}