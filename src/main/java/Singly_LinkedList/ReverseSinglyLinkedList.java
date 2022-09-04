package Singly_LinkedList;

public class ReverseSinglyLinkedList {
    public ListNode reverseSinglyLinkedList(ListNode head){
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null){

            next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }
        return previous;

    }
}
