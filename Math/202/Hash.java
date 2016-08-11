public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while(n!=1) {
            int total = 0;
            while(n!=0) {
                int tmp = n % 10;
                total += tmp * tmp;
                n /= 10;
            }
            if(set.contains(total)) {
                return false;
            } else {
                set.add(total);
                n = total;
            }
        }
        return true;
        
    }
}