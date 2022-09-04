package Singly_LinkedList;

public class InsertNodeAtBeginning {

    public static void insertNodeAtBeginning(ListNode head, int data){
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
    }
}
