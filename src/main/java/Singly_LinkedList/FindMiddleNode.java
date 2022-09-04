package Singly_LinkedList;

public class FindMiddleNode {
    public int findMiddleNode(ListNode head){

        if (head == null){
            return head.data;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (slow !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
