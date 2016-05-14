/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        TreeNode root = new TreeNode(-1);
        TreeNode leftpart = new TreeNode(-1);
        TreeNode rightpart = new TreeNode(-1);
        //edge case
        if(head==null) return null;
        if(head.next==null) {
            return new TreeNode(head.val);
        }
        //find the mid-point
        ListNode slow = head; ListNode fast = head;
        ListNode prev = null;
       
        while(fast.next!=null&&fast.next.next!=null) { 
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
            // if(prev==null) {
            //     prev = head;
            // } else {
            //     prev = prev.next;
            // }
            //System.out.println("enter while");
        }
        root.val = slow.val;
        if(prev!=null) {
            prev.next = null;
            leftpart = sortedListToBST(head);
            root.left = leftpart;
        } else {
            //System.out.println("prev is empty");
            root.left = null;
        }
        rightpart = sortedListToBST(slow.next);
        root.right = rightpart;
        return root;
    }
}
