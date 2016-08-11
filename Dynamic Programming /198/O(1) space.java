public class Solution {
    public int rob(int[] nums) {
        // int[][] dp = new int[nums.length+1][2];
        // for(int i=1;i<=nums.length;i++) {
        //     dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]);
        //     dp[i][1] = nums[i-1] + dp[i-1][0];
        // }
        // return Math.max(dp[nums.length][0],dp[nums.length][1]);
        
        // Using O(1) space
        int p_yes = 0;
        int p_no = 0;
        for(int i:nums) {
            int tmp = p_no;
            p_no = Math.max(p_yes,p_no);
            p_yes = i + tmp;
        }
        return Math.max(p_yes,p_no);
    }
}