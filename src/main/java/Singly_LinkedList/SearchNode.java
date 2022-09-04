package Singly_LinkedList;

public class SearchNode {
    public void searchNode(ListNode head, int position){
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
}
