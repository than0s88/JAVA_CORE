package Data_Structure_Algorithm.Doubly_Linked_List;

import LeetCode.Easy.Problem_2.ListNode;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;
    private static class ListNode{
        private int data;
        private ListNode previous;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }
    public DoublyLinkedList(){
    this.head = null;
    this.tail = null;
    this.length = 0;
    }

    public boolean isEmpty(){
    return length == 0;
    }

    public int getLength(){
        return length;
    }

    public static void main(String[] args) {
        DoublyLinkedList ddll = new DoublyLinkedList();
        ddll.head = new ListNode(13);
    }
}
