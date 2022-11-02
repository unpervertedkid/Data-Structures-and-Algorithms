package leetcode.linkedlists;

public class ReverseLinkedList {
    public static void main(String[] args) {
       ListNode head = new ListNode(1);
         head.next = new ListNode(2);
            head.next.next = new ListNode(3);
                head.next.next.next = new ListNode(4);
                    head.next.next.next.next = new ListNode(5);

        ListNode result = reverseList(head);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        
        ListNode previous = null;
        ListNode current = head;
        ListNode next = current !=null ? current.next : null;

        while(current!=null){
            current.next = previous;
            previous = current;
            current = next;
            next = next != null ? next.next: null;

        }
        return previous;
    }
}
