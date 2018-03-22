package LinkedList;

/**
 * @author zenli
 */
public class LinkedListCycle_41 {
    public boolean solution(ListNode head){
        if(head == null || head.next == null) return false;
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            slow  = slow.next;
            fast  = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
