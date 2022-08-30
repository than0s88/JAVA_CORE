package LeetCode_problem_2;

public class Main {
    public static void main(String[] args) {
//        ListNode l1 = new ListNode(2);
//        ListNode l2 = new ListNode(4);
//        ListNode l3 = new ListNode(3);
//
//        ListNode l4 = new ListNode(5);
//        ListNode l5 = new ListNode(6);
//        ListNode l6 = new ListNode(4);
//
//        l1.next = l2;
//        l2.next = l3;
//        l3.next = null;
//
//        l4.next = l5;
//        l5.next = l6;
//        l6.next = null;

        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(9);
        ListNode l3 = new ListNode(9);
        ListNode l4 = new ListNode(9);
        ListNode l5 = new ListNode(9);
        ListNode l6 = new ListNode(9);
        ListNode l7 = new ListNode(9);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = null;

        ListNode ll1 = new ListNode(9);
        ListNode ll2 = new ListNode(9);
        ListNode ll3 = new ListNode(9);
        ListNode ll4 = new ListNode(9);

        ll1.next = ll2;
        ll2.next = ll3;
        ll3.next = ll4;
        ll4.next = null;



        int total, modulo, remainder= 0;



        remainder = (9 + 9)/10;
        total = remainder + 9 + 9;
        modulo = total % 10;

        System.out.println("total: "+total);
        System.out.println("modulo: "+modulo);
        System.out.println("remainder: "+remainder);

        System.out.println("////////////////////");
        display(addTwoNumbers(l1,ll1));
//
//
//        int modulo = (4 + 4) % 10;
//        int remainder = (4 + 6) / 10;
//        System.out.println("modulo: "+modulo);
//        System.out.println("remainder: "+remainder);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode temp = head;
        int total, modulo, remainder= 0;

        while (l1!=null && l2!=null){

            if (l1.next == null){
                l1.val = 0;
            }
            if (l2.next == null){
                l2.val = 0;
            }
            remainder = (l1.val + l2.val)/10;
            total = remainder+ l1.val + l2.val;
            modulo = total % 10;

            temp.next = new ListNode(modulo);
            temp = temp.next;

            if (l1!=null)
            l1 = l1.next;
            if (l2!=null)
            l2 = l2.next;
        }
        return head.next;
    }

//    public static void addTwoNumbers(ListNode l1, ListNode l2) {

//        ListNode node = new SinglyLinkedList.SinglyLinkedList.ListNode(data);
//        node.next = head;
//        head = node;
//        ListNode sum = new ListNode(0);
//        ListNode node = null;
//        int total, remainder= 0;
//
//        while (l1!=null && l2!=null){
//
//            total = remainder+ l1.val + l2.val;
//            remainder = (l1.val + l2.val)/10;
//
//            if (total%10==0){
//                total=0;
//            }
//
//            node = new ListNode(total);
//            node.next = sum;
//            sum = node;
//
//
//
//
//            System.out.print(sum.val+"-->");
//
//            l1 = l1.next;
//            l2 = l2.next;
//
//        }
//        sum.next=null;
//        System.out.println("null");
//
//        if (sum.next==null){
//            System.out.println("return is null");
//        }else{
//            System.out.println("has values");
//        }
//
//    }


    public static void display(ListNode node){
        ListNode temp = node;
        while (temp!=null){
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
