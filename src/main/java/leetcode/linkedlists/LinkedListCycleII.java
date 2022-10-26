package leetcode.linkedlists;

public class LinkedListCycleII {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        System.out.println(detectCycle(head).val);
    }
    public static ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        //Find if they have a cycle and if so where the two elements collide
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }
        }

        //Check if there is no cycle
        if(fast == null || fast.next == null){
            return null;
        }

        //Move slow to head and find meeting point(start of cycle)
        slow = head;

        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }
}
