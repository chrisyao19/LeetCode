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
    public List<Integer> preorderTraversal(TreeNode root) {
    //Solution1: Recursion
    //     List<Integer> list = new ArrayList<>();
    //     if(root==null) return list;
    //     helper(root,list);
    //     return list;
    // }
    // private void helper(TreeNode root, List<Integer> list) {
    //     list.add(root.val);
    //     if(root.left!=null) helper(root.left,list);
    //     if(root.right!=null) helper(root.right,list);
    
    //Solution2: Using stack.
    // List<Integer> list = new ArrayList<>();
    // if(root==null) return list;
    // Stack<TreeNode> stack = new Stack<>();
    // stack.push(root);
    // while(!stack.isEmpty()) {
    //     TreeNode tmp = stack.pop();
    //     list.add(tmp.val);
    //     if(tmp.right!=null) {
    //         stack.push(tmp.right);
    //     }
    //     if(tmp.left!=null) {
    //         stack.push(tmp.left);
    //     }
    // }
    // return list;
    
    //Solution3: Using stack, but instead only restore the right child.
    List<Integer> list = new ArrayList<>();
    Stack<TreeNode> rights = new Stack<>();
    while(root!=null) {
        list.add(root.val);
        if(root.right!=null) {
            rights.push(root.right);
        }
        root = root.left;
        if(root==null && !rights.isEmpty()) {
            root = rights.pop();
        }
    }
    return list;
    }
}