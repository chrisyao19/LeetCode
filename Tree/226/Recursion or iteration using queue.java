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
    public TreeNode invertTree(TreeNode root) {
    //   if(root==null) return null;
    //   TreeNode left = invertTree(root.left);
    //   TreeNode right = invertTree(root.right);
    //   root.left = right;
    //   root.right = left;
    //   return root;
    if(root==null) return null;
    Queue<TreeNode> que = new LinkedList<TreeNode>();
    que.add(root);
    while(!que.isEmpty()) {
        TreeNode node = que.poll();
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        if(node.left!=null) que.add(node.left);
        if(node.right!=null) que.add(node.right);
    }
    return root;
    }
}