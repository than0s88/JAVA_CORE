package Singly_LinkedList;

public class InsertNodeAtLast {
    public void insertNodeAtLast(ListNode head, int data){
        ListNode node = new ListNode(data);
        ListNode temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        //if temp.next is null point it to new node;
        temp.next = node;
    }
}
