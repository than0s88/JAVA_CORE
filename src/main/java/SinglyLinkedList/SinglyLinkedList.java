package SinglyLinkedList;

import java.util.LinkedList;

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
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
//        ListNode node6 = new ListNode(6);
//
//        singly.head.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//        node6.next = null;


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

        singly.printNode();
        System.out.println(singly.findMiddleNode().data);


//        SinglyLinkedList ll1 = new SinglyLinkedList();
//        ll1.insertNodeAtLast(1);
//        ll1.insertNodeAtLast(4);
//        ll1.insertNodeAtLast(8);
//
//        SinglyLinkedList ll2 = new SinglyLinkedList();
//        ll2.insertNodeAtLast(3);
//        ll2.insertNodeAtLast(5);
//        ll2.insertNodeAtLast(8);
//
//        ll1.printNode();
//        ll2.printNode();
//
//        SinglyLinkedList result = new SinglyLinkedList();
//        result.head = mergeListNode(ll1.head, ll2.head);
//        result.printNode();

    }

    public void detectLoopAndRemoveLoop(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while (slow.next != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast){
            removeLoop(slow);
            break;
            }
        }
    }

    public void removeLoop(ListNode slow){
        ListNode temp = head;
        while (temp.next != slow.next){
            temp = temp.next;
            slow = slow.next;
        }
        slow.next = null;
    }

    public void insertNodeAtBeginning(int data){
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;

    }

    public void insertNodeAtLast(int data){
        ListNode node = new ListNode(data);
        if (head ==null){
           head = node;
           return;
        }
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

    public void deleteNodeWithKey(int data){

        ListNode temp = head;
        ListNode current = null;

            while (temp!=null && temp.data != data){
                current = temp;
                temp = temp.next;
            }
            if (current==null) return;
            current.next = temp.next;
    }

    public void printNode(){
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
        while (fast !=null && fast.next != null){
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

    public static ListNode mergeListNode(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(a != null && b != null){
            if (a.data <= b.data){
                tail.next = a;
                a = a.next;
            }else{
                tail.next = b;
                b.next = b;
            }
            tail = tail.next;
        }
        
        if (a == null){
            tail.next = a;
        }else{
            tail.next = b;
        }
        return dummy.next;

    }
}
