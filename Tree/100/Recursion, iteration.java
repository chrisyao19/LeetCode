/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    //Try to using iteration next time.
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)  return true;
        if(p==null||q==null) return false;
        if(p.val==q.val) {
            if(isSameTree(p.left,q.left) && isSameTree(p.right,q.right)) {
                return true;
            } else return false; 
        } 
        return false;
    }
}