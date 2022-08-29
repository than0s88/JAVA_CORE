package SinglyLinkedList;

import java.util.List;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList singly = new SinglyLinkedList();
        singly.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode six = new ListNode(6);
        ListNode seven = new ListNode(7);
        ListNode eight = new ListNode(8);
        ListNode nine = new ListNode(9);
        ListNode ten = new ListNode(10);
        ListNode eleven = new ListNode(11);
        ListNode twelve = new ListNode(12);
        ListNode thirteen = new ListNode(13);

        singly.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        six.next = seven;
        seven.next = eight;
        eight.next = nine;
        nine.next = ten;
        ten.next = eleven;
        eleven.next = twelve;
        twelve.next = thirteen;
        thirteen.next = null;

        //singly.getLength();
//        singly.printNode(singly.head);
//
//        ListNode reverseSinglyList =  singly.reverseSinglyLinkedList(singly.head);
//        singly.printNode(reverseSinglyList);
        singly.printNode(singly.head);
        ListNode middleNode = singly.findMiddleNode();
        System.out.println(middleNode.data);

        System.out.println(singly.head.next.next.data);
    }

    public void insertNodeAtBeginning(int data){
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;

    }

    public void insertNodeAtLast(int data){
        ListNode node = new ListNode(5);
        ListNode temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        //if temp.next is null point it to new node;
        temp.next = node;
    }

    public void insertNodeAnywhere(int position, int data){
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

    public void deleteNodeAtBeginning(){
        ListNode temp = head.next;
        head = temp;
    }

    public void deleteNodeAtLast(){
        ListNode temp = head;
        ListNode tempNull = null;
        while (temp.next != null){
            tempNull = temp;
            temp = temp.next;
        }
        tempNull.next = null;


    }

    public void deleteNodeAnywhere(int position){
        if (position == 1){
            ListNode temp = head.next;
            head = temp;
        }else{
            int count = 1;
            ListNode temp = head;
            while (count < position - 1){
                temp = temp.next;
                count++;
            }
            ListNode temp2 = temp.next;
            temp.next = temp2.next;
        }
    }
    public void printNode(ListNode head){
        ListNode temp = head;
        while (temp != null){
            System.out.print("["+temp.data+"]-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public void searchNode(int position){
        ListNode temp = head;
        int count = 1;
        if (position==1){
            System.out.println(head.data);
        }
        while (count < position){
            temp = temp.next;
            count++;
        }
        System.out.println("Node value is: "+temp.data);

    }

    public ListNode reverseSinglyLinkedList(ListNode head){
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null){

            next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }
        return previous;

    }

    public void getLength(){
        ListNode temp = head;
        int count = 0;

        while (temp!=null){
            temp = temp.next;
            count++;
        }
        System.out.println(count);
    }

    public ListNode findMiddleNode(){

        if (head == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (slow !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode nthNode(ListNode head, int position){
        ListNode temp = head;

        if (position==1){
            return head;
        }


        return temp;
    }

}