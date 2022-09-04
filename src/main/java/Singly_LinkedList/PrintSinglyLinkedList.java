package Singly_LinkedList;

public class PrintSinglyLinkedList {
    public void printSinglyLinkedList(ListNode head){
        ListNode temp = head;
        while (temp != null){
            System.out.print("["+temp.data+"]-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
