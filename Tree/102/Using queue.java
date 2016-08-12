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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root==null) return list;
        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> one_level = new ArrayList<Integer>();
            int size = queue.size();
            for(int i=0; i<size; i++) {
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                one_level.add(queue.poll().val);
            }
            list.add(one_level);
        }
        return list;
        
    }
}