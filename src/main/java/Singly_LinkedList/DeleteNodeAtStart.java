package Singly_LinkedList;

public class DeleteNodeAtStart {
    public void deleteNodeAtStart(ListNode head){
        ListNode temp = head.next;
        head = temp;
    }
}
