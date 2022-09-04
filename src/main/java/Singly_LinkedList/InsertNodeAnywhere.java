package Singly_LinkedList;

public class InsertNodeAnywhere {
    public void insertNodeAnywhere(ListNode head, int position, int data){
        ListNode node = new ListNode(data);
        int count = 1;
        if (position == 1){
            node.next = head;
            head = node;
        }else{
            ListNode temp = head;
            while (count < position - 1){
                temp = temp.next;
                count++;
            }
            ListNode temp2 = temp.next;
            temp.next = node;
            node.next = temp2;
        }
    }
}
