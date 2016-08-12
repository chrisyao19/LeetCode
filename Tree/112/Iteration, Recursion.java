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
    public boolean hasPathSum(TreeNode root, int sum) {
        // if(root==null) return false;
        // if(root.left==null && root.right==null && root.val==sum) return true;
        // return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
        if(root==null) return false;
        Stack<TreeNode> node = new Stack<TreeNode>();
        Stack<Integer> value = new Stack<Integer>();
        node.push(root); value.push(sum);
        while(!node.isEmpty()) {
            TreeNode tmp = node.pop();
            int val = value.pop();
            if(tmp.left==null && tmp.right==null&&tmp.val==val) return true;
            
            if(tmp.left!=null) {
                node.push(tmp.left); value.push(val-tmp.val);
            }
            if(tmp.right!=null) {
                node.push(tmp.right); value.push(val-tmp.val);
            }
        }
        return false;
    }
}