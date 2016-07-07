public class Solution {
    public void moveZeroes(int[] nums) {
        // if(nums!=null) {
        //     int tmp = nums.length-1;
        //     int N = nums.length-1;
        //     while(tmp>=0) {
        //         if(nums[tmp]==0) {
        //             for(int i=tmp+1; i <= N; i++) {
        //                 nums[i-1] = nums[i];
        //             }
        //             N--;
        //         }
        //         tmp--;
        //     }
        //     for(int j=N+1; j<nums.length;j++) {
        //         nums[j] = 0;
        //     }
        // }
        int LastNonZero = 0;
        for(int i=0; i < nums.length; i++) {
            if(nums[i]!=0) {
                nums[LastNonZero++] = nums[i];
            }
        }
        for(int j = LastNonZero; j < nums.length; j++) {
            nums[j] = 0;
        }
        // a more efficient one: swap the non-zero values with LastNonZero.
    }
}