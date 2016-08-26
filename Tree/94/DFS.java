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
    public List<Integer> inorderTraversal(TreeNode root) {
        //https://en.wikipedia.org/wiki/Tree_traversal#Depth-first_search
        //need to get familiar with three traversal solutions.(pre,in,post order)
        List<Integer> list = new ArrayList<>();
        //if(root==null) return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode tmp = root;
        while(!stack.isEmpty()||tmp!=null) {
            while(tmp!=null) {
                stack.push(tmp);
                tmp = tmp.left;
            }
            tmp = stack.pop();
            list.add(tmp.val);
            tmp = tmp.right;
        }
        return list;
    }
}