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
    public int minDepth(TreeNode root) {
        // int min = Integer.MAX_VALUE;
        // Queue<TreeNode> queue = new LinkedList<TreeNode>();
        // Queue<Integer> depth = new LinkedList<Integer>();
        // queue.offer(root);
        // depth.offer(1);
        // while(!queue.isEmpty()) {
        //     TreeNode front = queue.poll();
        //     int cur_depth = depth.poll();
        //     if(front.left==null && front.right==null) {
        //       return cur_depth;
        //     }
        //     if(front.left!=null) {
        //         queue.offer(front.left);
        //         depth.offer(cur_depth+1);
        //     } 
        //     if(front.right!=null) {
        //         queue.offer(front.right);
        //         depth.offer(cur_depth+1);
        //     }
        // }
        // return 0;
        if(root==null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        int m = Math.min(left,right);
        return  1 + ((m>0)?m:Math.max(left,right));
        }
}