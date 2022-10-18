package leetcode.linkedlists;
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
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int depthA = 0;
        int depthB = 0;

        ListNode curA = headA;
        while(curA!= null){
            depthA++;
            curA = curA.next;
        }
        ListNode curB = headB;
        while(curB != null){
            depthB++;
            curB = curB.next;
        }

        curA = headA;
        curB = headB;

        while(depthA < depthB){
            curB = curB.next;
            depthB--;
        }
        while(depthB < depthA){
            curA = curA.next;
            depthA--;
        }


        while(curA!=curB){
            curA = curA.next;
            curB = curB.next;
        }

        return curA;
    }
}
