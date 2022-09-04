package Singly_LinkedList;

public class DeleteNodeWithData {
    public void deleteNodeWithData(ListNode head, int data){

        ListNode temp = head;
        ListNode current = null;

        while (temp!=null && temp.data != data){
            current = temp;
            temp = temp.next;
        }
        if (current==null) return;
        current.next = temp.next;

    }
}
