package LeetCode.Easy.Problem_2;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);

        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        l4.next = l5;
        l5.next = l6;
        l6.next = null;

//        ListNode l1 = new ListNode(9);
//        ListNode l2 = new ListNode(9);
//        ListNode l3 = new ListNode(9);
//        ListNode l4 = new ListNode(9);
//        ListNode l5 = new ListNode(9);
//        ListNode l6 = new ListNode(9);
//        ListNode l7 = new ListNode(9);
//
//        l1.next = l2;
//        l2.next = l3;
//        l3.next = l4;
//        l4.next = l5;
//        l5.next = l6;
//        l6.next = l7;
//        l7.next = null;
//
//        ListNode ll1 = new ListNode(9);
//        ListNode ll2 = new ListNode(9);
//        ListNode ll3 = new ListNode(9);
//        ListNode ll4 = new ListNode(9);
//
//        ll1.next = ll2;
//        ll2.next = ll3;
//        ll3.next = ll4;
//        ll4.next = null;

        display(addTwoNumbers(l1,l4));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode temp = head;
        int remainder= 0;

        while (l1!=null || l2!=null || remainder !=0 ){

        int x = (l1!=null) ? l1.val : 0;
        int y = (l2!=null) ? l2.val : 0;

            int total = remainder + x + y;
            remainder = total/10;

            temp.next = new ListNode(total %10);
            temp = temp.next;

            if (l1!=null)
            l1 = l1.next;
            if (l2!=null)
            l2 = l2.next;
        }
        return head.next;
    }
    public static void display(ListNode node){
        ListNode temp = node;
        while (temp!=null){
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
