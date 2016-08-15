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
    public List<String> binaryTreePaths(TreeNode root) {
        //Solution1: Finally written out by myself Interation using two stacks.
        // List<String> list = new ArrayList<String>();
        // if(root==null) return list;
        // Stack<TreeNode> stack = new Stack<TreeNode>();
        // Stack<String> value = new Stack<String>();
        // stack.push(root);
        // value.push(String.valueOf(root.val));
        // while(!stack.isEmpty()){
        //     TreeNode top = stack.pop();
        //     String str = value.pop();
        //     if(top.left==null && top.right==null) {
        //         list.add(str);
        //     } 
        //     if(top.right!=null) {
        //         stack.push(top.right);
        //         value.push(str+"->"+String.valueOf(top.right.val));
        //     }
        //     if(top.left!=null) {
        //         stack.push(top.left);
        //         value.push(str+"->"+String.valueOf(top.left.val));
        //     }
        // }
        // return list;
        
        //Solution2: Recursion
        List<String> list = new ArrayList<String>();
        if(root==null) return list;
        DFS(root,"",list);
        return list;
    }
    private void DFS(TreeNode node, String str, List<String> list) {
        if(node.left==null && node.right==null) {
            list.add(str+node.val);
        }
        if(node.left!=null) {
            DFS(node.left,str+node.val+"->",list);
        }
        if(node.right!=null) {
            DFS(node.right,str+node.val+"->",list);
        }
    }
        
    
    
}