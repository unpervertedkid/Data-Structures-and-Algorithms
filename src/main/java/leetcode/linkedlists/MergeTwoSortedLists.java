package leetcode.linkedlists;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode result = mergeTwoLists(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to hold the result
        ListNode dummy = new ListNode();
        // Create a pointer to the dummy node
        ListNode current = dummy;

        ListNode l1 = list1;
        ListNode l2 = list2;
        // While both lists are not empty
        while(l1!=null || l2!=null){
            // If both lists are not empty compare the values
            if(l1 != null && l2!= null){
                // If the value of the first list is less than the value of the second list add the first list node to the result
                if(l1.val < l2.val){
                    current.next = l1;
                    l1 = l1.next;
                }
                // If the value of the second list is less than the value of the first list add the second list node to the result
                else{
                    current.next = l2;
                    l2 = l2.next;
                }
                current = current.next;
            }
            // If the first list is not empty add its next node to the result
            else if(l1!=null){
                current.next = l1;
                l1 = l1.next;
                current = current.next;
            }
            // If the second list is not empty add the second list node to the result
            else {
                current.next = l2;
                l2 = l2.next;
                current = current.next;
            }

        }


        return dummy.next;

    }
}
