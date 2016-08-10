public class Solution {
    public int titleToNumber(String s) {
        // Ascii for A is 65
        int base = 26;
        char[] ca = s.toCharArray();
        int len = ca.length;
        int total = 0;
        int count = 0;
        for(int i=len-1; i>=0; i--) {
            total += Math.pow(base,count) * (int)(ca[i]-64);
            count++;
        }
        return total;
        
        // for(int i=0;i < len; i++) {
        //     total += 26*total + (ca[i]-'A'+1);
        // }
    }
}