public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[256];  
        char[] tmp = magazine.toCharArray();
        for(char c:tmp) {
            count[c]++;
        }
        tmp = ransomNote.toCharArray();
        for(char x: tmp) {
            count[x]--;
            if(count[x]<0) {
                return false;
            }
        }
        return true;
    }
}