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
     public boolean isSymmetric(TreeNode root) {
    //     return help(root, root);
    // }
    // private boolean help(TreeNode p, TreeNode q) {
    //     if(p==null && q==null) return true;
    //     if(p==null || q==null) return false;
    //     return p.val==q.val && help(p.left,q.right) && help(p.right,q.left);
    // }
    //Solution2: using queue.
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.offer(root);
    queue.offer(root);
    while(!queue.isEmpty()) {
        TreeNode t1 = queue.poll();
        TreeNode t2 = queue.poll();
        if(t1==null && t2==null) continue;
        if(t1==null || t2==null) return false;
        if(t1.val!=t2.val) return false;
        queue.offer(t1.left);
        queue.offer(t2.right);
        queue.offer(t1.right);
        queue.offer(t2.left);
    }
    return true;
    } 
    
}