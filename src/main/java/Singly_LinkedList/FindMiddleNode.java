package Singly_LinkedList;

import java.util.List;

public class FindMiddleNode {
    public ListNode findMiddleNode(ListNode head){

        if (head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
