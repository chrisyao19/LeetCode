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
    public int kthSmallest(TreeNode root, int k) {
        //using in-order treversal
        //Solution1: in-order treversal
        // int count = 1;
        // Stack<TreeNode> stack = new Stack<>();
        // TreeNode tmp = root;
        // while(!stack.isEmpty()||tmp!=null) {
        //     while(tmp!=null) {
        //         stack.push(tmp);
        //         tmp = tmp.left;
        //     }
        //     tmp = stack.pop();
        //     if(count==k) return tmp.val;
        //     else {
        //         tmp=tmp.right;
        //         count++;
        //     }
        // }
        // return 0;
        
        //Solution2: Binary Search 
       int count = countNode(root.left);
       if(k<=count) {
           return kthSmallest(root.left,k);
       }
       else if(k>1+count) {
           return kthSmallest(root.right,k-1-count);
       }
       else return root.val;
    }
     private int countNode(TreeNode root) {
            if(root==null) return 0;
            return 1+countNode(root.left) + countNode(root.right);
        }
}