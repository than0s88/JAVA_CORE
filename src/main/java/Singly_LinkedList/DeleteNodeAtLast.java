package Singly_LinkedList;

public class DeleteNodeAtLast {
    public void deleteNodeAtLast(ListNode head){
        ListNode temp = head;
        ListNode tempNull = null;
        while (temp.next != null){
            tempNull = temp;
            temp = temp.next;
        }
        tempNull.next = null;


    }
}
