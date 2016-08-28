/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//Be aware of the bound problem
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        TreeNode head = helper(nums,0,nums.length-1);
        return head;
    }
    
    private TreeNode helper(int[] nums,int lo, int hi) {
        if(lo>hi) return null;
        int mid = lo + (hi-lo)/2;
        TreeNode tmp = new TreeNode(nums[mid]);
        tmp.left = helper(nums,lo,mid-1);
        tmp.right = helper(nums,mid+1,hi);
        return tmp;
        
    }
}