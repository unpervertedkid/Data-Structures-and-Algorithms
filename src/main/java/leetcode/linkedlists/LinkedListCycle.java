package leetcode.linkedlists;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
            if(fast == null){
                return false;
            }
        }
        return false;
    }
}
