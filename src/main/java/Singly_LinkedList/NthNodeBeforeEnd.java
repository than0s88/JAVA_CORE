package Singly_LinkedList;

public class NthNodeBeforeEnd {
    public int nthNodeBeforeEnd(ListNode head){
        ListNode temp = head;

            while (temp.next.next != null){
                temp = temp.next;
            }
        return temp.data;
    }
}
