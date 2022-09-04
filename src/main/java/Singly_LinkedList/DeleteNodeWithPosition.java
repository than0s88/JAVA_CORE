package Singly_LinkedList;

public class DeleteNodeWithPosition {
    public void deleteNodeWithPosition(ListNode head, int position){
        if (position == 1){
            ListNode temp = head.next;
            head = temp;
        }else{

            int count = 0;
            ListNode temp = head;
            while (count < position){
                temp = temp.next;
                count++;
            }
            ListNode temp2 = temp.next;
            temp.next = temp2.next;
        }
    }
}
