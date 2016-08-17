public class Solution {
    public int reverse(int x) {
        int sign = x>0?1:-1;
        x = Math.abs(x);
        int res = 0;
        while(x!=0) {
            if(Integer.MAX_VALUE/10 < res || (Integer.MAX_VALUE-x%10)<res*10) return 0;   //Very Important skill.
            res = 10 * res + x%10;
            x /= 10;
        }
        return sign*res;
    }
}

//When coding to solve problems like this, one must consider overflow, and try to solve it easily.