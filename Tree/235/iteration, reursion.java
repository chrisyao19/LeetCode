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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==p) return p;
        if(root==q) return q;
        int max = Math.max(p.val,q.val); int min = Math.min(p.val,q.val);
        // if(root.val>min && root.val<max) {
        //     return root;
        // } else if(root.val<min) {
        //     return lowestCommonAncestor(root.right, p, q);
        // } else {
        //     return lowestCommonAncestor(root.left, p, q);
        // }
        while(root.val<min || root.val>max) {
            root = root.val<min?root.right:root.left;   
        }
        return root;
        
    }
}