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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            List<List<Integer>> list = new ArrayList<List<Integer>>();
            if(root==null) return list;
            queue.offer(root);
            while(!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> tmp = new ArrayList<Integer>();
                for(int i=0; i<size;i++) {
                    if(queue.peek().left!=null) queue.offer(queue.peek().left);
                    if(queue.peek().right!=null) queue.offer(queue.peek().right);
                    tmp.add(queue.poll().val);
                }
                list.add(0,tmp);
            }
            return list;
        
        
        
        
        
        
        
        
    }
}