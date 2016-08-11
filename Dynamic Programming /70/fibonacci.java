public class Solution {
    public int climbStairs(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        int total = 0;
        int k = 2;
        int prev = 1; int curr = 2;
        while(k<n) {
            total = prev + curr;
            prev = curr;
            curr = total;
            k++;
        }
        return total;
        
    }
}