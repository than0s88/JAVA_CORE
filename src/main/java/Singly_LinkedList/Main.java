package Singly_LinkedList;

public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
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

        head.next = second;
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

        PrintSinglyLinkedList obj = new PrintSinglyLinkedList();
        DetectLoop obj1 = new DetectLoop();
        SearchNode obj2 = new SearchNode();
        NthNodeBeforeEnd obj3 = new NthNodeBeforeEnd();
        FindMiddleNode obj4 = new FindMiddleNode();
        InsertNodeAtBeginning obj5 = new InsertNodeAtBeginning();
        PrintSinglyLinkedList obj6 = new PrintSinglyLinkedList();


        obj.printSinglyLinkedList(head);
        System.out.println(obj4.findMiddleNode(head).data);

    }
}
