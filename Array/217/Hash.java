public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==0 || nums==null) return false;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:nums) {  
            //determine if the set contains the element first. Avoid time limit out.
            if(set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
        
    }
}