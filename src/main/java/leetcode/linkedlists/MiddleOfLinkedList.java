package leetcode.linkedlists;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Middle of the linked list is: " + middleNode(head).val);
    }
    public static ListNode middleNode(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
