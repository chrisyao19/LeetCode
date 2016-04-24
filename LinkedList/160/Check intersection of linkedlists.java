// Check the intersection of two linked lists.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Solution1 HashSet
        // HashSet<ListNode> nodeSeen = new HashSet<>();       O(mn) time complexity, not good.
        // while(headA!=null){
        //     nodeSeen.add(headA);
        //     headA = headA.next;
        // }
        // ListNode tmp = headB;
        // while(tmp!=null){
        //     if(nodeSeen.contains(tmp)) return tmp;   //.contains(); not contain();
        //     tmp = tmp.next;
        // }
        // return null;

        //Solution2 Tricky one.     Making two pointers walk through the same size by redirecting one point which walks to 
        //                          the end of the list first to the head of another list. 
        if(headA==null || headB==null) return null;
        ListNode a = headA;
        ListNode b = headB;
        while(a!=b){
            a = a==null?headB:a.next;
            b = b==null?headA:b.next;
            if(a==headA && b==headB){
                return null;
            }
        }
        return a;
    }
}