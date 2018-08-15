package LeetCode.LinkedList;

/**
 * @author zenli
 */
public class SwapNodesinPairs_24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        ListNode tmp = null;
        ListNode tmp2 = null;
        while(curr.next != null && curr.next.next != null){
            tmp = curr.next.next.next;
            tmp2 = curr.next.next;
            curr.next.next.next = curr.next;
            curr.next.next = tmp;
            curr.next = tmp2;
            curr = curr.next.next;
        }
        return dummy.next;
    }
}
