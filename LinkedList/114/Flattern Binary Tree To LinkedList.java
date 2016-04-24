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
    public void flatten(TreeNode root) {
    // Solution1: Iteration O(1) Space Complexity
    //   TreeNode curr = root;
    //   while(curr!=null){
    //       TreeNode last = curr.left;
    //       if(last!=null){
    //           while(last.right!=null){
    //               last = last.right;          //find the rightest node of the left subtree to connect with the right
    //           }
    //           last.right = curr.right;
    //           curr.right = curr.left;
    //           curr.left = null;
    //       }
    //       curr = curr.right;
    //   }
    
    // Solution2: Recursion
    if(root ==null) return;
    flatten(root.left);
    flatten(root.right);
    TreeNode tmp = root.right;
    root.right = root.left;
    root.left = null;
    while(root.right !=null){
        root = root.right;
    }
    root.right = tmp;
    
    }
}


    /* In this situation, in order to implement the method recursively, one must assume the method have been worked.
       Thus, we can assume the left and right part of the tree has been flattened by function "flatten", then what need
       to do next is connect the left part to the right and linked it to the root, as it's right part.
       Solution: https://leetcode.com/discuss/30719/my-short-post-order-traversal-java-solution-for-share
    */