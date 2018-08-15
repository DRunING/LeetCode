package LeetCode.LinkedList;

/**
 * @author zenli
 */
public class ReverseLinkedListII_92 {
    public ListNode reverseBetween(ListNode head, int m, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;


        //find the reverse place
        ListNode premNode = dummy;
        for(int i = 1; i < m; i++){
            premNode =  premNode.next;
        }

        //reverse the linkedList
        ListNode prev = null, curr = premNode.next;
        while(curr != null && (m <= n)){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
            m++;
        }

        premNode.next.next = curr;
        premNode.next = prev;

        return dummy.next;
    }
}
