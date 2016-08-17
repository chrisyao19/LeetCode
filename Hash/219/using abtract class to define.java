public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //Solution1: brute-force  got TLE at last.
        // if(k==0||nums.length==1) return false;
        // for(int i=0;i<nums.length-1;i++) {
        //     for(int j=i+1;j<=i+k&&j<nums.length;j++) {
        //         if(nums[j]==nums[i]) return true;
        //     }
        // }
        // return false;
        
        //Solution2: Try HashTable, just like a window slices the array.
        //if(k==0||nums.length==1) return false;
        Set<Integer> set = new HashSet<Integer>();   //if set is decleared to be HashSet, get time-out.
        for(int i=0; i<nums.length;i++) {
            if(i>k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
        
        

    }
}